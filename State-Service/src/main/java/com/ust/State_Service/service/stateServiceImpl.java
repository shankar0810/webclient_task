package com.ust.State_Service.service;

import com.ust.State_Service.Repository.Repo;
import com.ust.State_Service.dto.responseDto;
import com.ust.State_Service.dto.statesdto;
import com.ust.State_Service.dto.districtDto;
import com.ust.State_Service.model.state;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
public class stateServiceImpl implements stateService{
    @Autowired
    private Repo repo;

    @Autowired
    private WebClient webClient;

    @Override
    public state addState(state State) {
        return repo.save(State);
    }

    @Override
    public responseDto getDistrictsByStateName(String stateName) {
        responseDto response = new responseDto();
        state State = repo.findByStateName(stateName)
                .orElseThrow(() -> new RuntimeException("state Not found"));
        statesdto stateDto = mapTostate(State);

        List<districtDto> districtDto = webClient
                .get()
                .uri("http://localhost:9098/district/getDistricts/" + State.getStateName())
                .retrieve()
                .bodyToMono(new ParameterizedTypeReference<List<districtDto>>() {
                })
                .block();
        response.setState(stateDto);
        response.setDistrict(districtDto);
        return response;
    }

    private statesdto mapTostate(state State) {
        statesdto dto = new statesdto();
        dto.setStateId(State.getStateId());
        dto.setStateName(State.getStateName());
        dto.setCountryName(State.getCountryName());
        dto.setPopulation(State.getPopulation());
        return dto;
    }
}
