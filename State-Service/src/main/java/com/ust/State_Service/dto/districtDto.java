package com.ust.State_Service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class districtDto {
    private int districtId;
    private String districtName;
    private String stateName;
}
