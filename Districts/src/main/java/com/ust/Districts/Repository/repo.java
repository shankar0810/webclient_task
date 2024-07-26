package com.ust.Districts.Repository;

import com.ust.Districts.model.district;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface repo extends JpaRepository<district,Integer> {
    List<district> findByStateName(String stateName);
}
