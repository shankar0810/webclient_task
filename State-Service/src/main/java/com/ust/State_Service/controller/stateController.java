package com.ust.State_Service.controller;

import com.ust.State_Service.dto.responseDto;
import com.ust.State_Service.model.state;
import com.ust.State_Service.service.stateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/state")
public class stateController {
    @Autowired

    private stateService service;

    @PostMapping("/addState")
    public state addState(state State){
        return service.addState(State);
    }

    @GetMapping("getDistricts/{stateName}")
    public ResponseEntity<responseDto> getDistricts(@PathVariable("stateName") String stateName) {
        responseDto ResponseDto = service.getDistrictsByStateName(stateName);
        return ResponseEntity.ok(ResponseDto);
    }
}
