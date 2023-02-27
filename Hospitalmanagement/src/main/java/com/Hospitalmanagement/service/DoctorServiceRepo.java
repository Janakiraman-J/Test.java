package com.Hospitalmanagement.service;

import java.util.List;
import org.springframework.stereotype.Component;

import com.jani.entity.Doctor;





@Component
public class DoctorServiceRepo {
	doctor postDoctor(Doctor d);

	Doctor getDoctor(int docId);

	List<Doctor> getAllDoctor();

	Doctor updateDoctor(Doctor params, int docId);

	String deleteDoctor(int docId);

}
