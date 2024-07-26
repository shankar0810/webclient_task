package com.ust.State_Service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class responseDto {
    private statesdto state;
    private List<districtDto> district;
}
