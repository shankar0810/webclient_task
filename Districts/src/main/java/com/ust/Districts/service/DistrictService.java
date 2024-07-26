package com.ust.Districts.service;

import com.ust.Districts.Repository.repo;
import com.ust.Districts.model.district;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistrictService {
    @Autowired
    private repo Repo;

    public district addDistrict(district District){
        return Repo.save(District);
    }

    public List<district> getDistrictByStateName(String stateName) {
        return Repo.findByStateName(stateName);
    }
}
