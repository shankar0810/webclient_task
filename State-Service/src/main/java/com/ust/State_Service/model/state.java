package com.ust.State_Service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "state_details")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class state {
    @Id
    private String stateId;
    private String stateName;
    private String countryName;
    private int population;
}
