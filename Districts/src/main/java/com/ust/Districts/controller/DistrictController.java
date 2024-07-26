package com.ust.Districts.controller;

import com.ust.Districts.model.district;
import com.ust.Districts.service.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/district")
public class DistrictController {
    @Autowired
    private DistrictService service;

    @PostMapping("/addDistrict")
    public district addDistrict(@RequestBody district District){
        return service.addDistrict(District);
    }

    @GetMapping("/getDistricts/{stateName}")
    public List<district> getDistrictByStateName(@PathVariable("stateName") String stateName){
        return service.getDistrictByStateName(stateName);
    }
}
