package com.ust.State_Service.service;

import com.ust.State_Service.dto.responseDto;
import com.ust.State_Service.model.state;

public interface stateService {

    state addState(state State);

    responseDto getDistrictsByStateName(String stateName);
}
