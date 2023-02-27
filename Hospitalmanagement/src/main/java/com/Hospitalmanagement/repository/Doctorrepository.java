package com.Hospitalmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jani.entity.Doctor;

@Repository
public interface Doctorrepository extends JpaRepository<Doctor, Integer> {

}
