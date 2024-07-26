package com.ust.State_Service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class statesdto {
    private String stateId;
    private String stateName;
    private String countryName;
    private int population;
}
