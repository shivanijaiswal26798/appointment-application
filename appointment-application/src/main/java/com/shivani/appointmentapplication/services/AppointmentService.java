package com.shivani.appointmentapplication.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shivani.appointmentapplication.Entity.Appointment;
import com.shivani.appointmentapplication.Repository.AppointmentRepository;

@Service
public class AppointmentService {

	@Autowired
	private AppointmentRepository appointmentRepository;
	
	public Appointment save(Appointment appointment) {
		return appointmentRepository.save(appointment);
	}
	

	public Appointment getAppointmentById(int appointmentId) {
		return appointmentRepository.getByAppointmentId(appointmentId);
	}
	
	public List<Appointment> getAllAppointment(String startDate,String endDate){
		return appointmentRepository.getAllAppointment(startDate, endDate);
	}
}
