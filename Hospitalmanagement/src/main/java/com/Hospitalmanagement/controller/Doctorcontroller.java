package com.Hospitalmanagement.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



import com.Hospitalmanagement.entity.Doctor;
import com.Hospitalmanagement.service.DoctorServiceRepo;

@RestController
public class Doctorcontroller {
	@Autowired
	private DoctorServiceRepo DoctorServiceRepo;

	@PostMapping(value = "/doctors")
	public Doctor addController(@RequestBody Doctor doctor) {
		return DoctorServiceRepo.postDoctor(doctor);
	}

	@GetMapping(value = "/doctors/{docId}")
	public Doctor getController(@PathVariable int docId) {
		return DoctorServiceRepo.getDoctor(docId);
	}

	@GetMapping(value = "/doctors")
	public List<Doctor> getAllController() {
		return DoctorServiceRepo.getAllDoctor();
	}

	@PutMapping(value = "/doctors/{docId}")
	public Doctor updateController(@PathVariable int docId, @RequestBody Doctor doctor) {
		return DoctorServiceRepo.updateDoctor(doctor, docId);
	}

	@DeleteMapping(value = "/doctors/{id}")
	public String deleteController(@PathVariable int id) {
		return DoctorServiceRepo.deleteDoctor(id);
	}

	@PostMapping("/doctorValid")
	public ResponseEntity<Doctor> addValidDoctor(@Valid @RequestBody Doctor d) {
		Doctor savedDoctor = DoctorServiceRepo.postDoctor(d);
		return new ResponseEntity<Doctor>(savedDoctor, HttpStatus.CREATED);

	}

}
