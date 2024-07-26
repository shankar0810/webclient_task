package com.ust.State_Service.Repository;

import com.ust.State_Service.model.state;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface Repo extends JpaRepository<state, Integer> {

    Optional<state> findByStateName(String stateName);
}
