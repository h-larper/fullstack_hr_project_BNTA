package com.example.HR_System_Backend.repositories;

import com.example.HR_System_Backend.models.RequestedTimeOff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequestedTimeOffRepository extends JpaRepository<RequestedTimeOff, Long> {


}
