package com.shivani.appointmentapplication.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shivani.appointmentapplication.Entity.Appointment;
import com.shivani.appointmentapplication.Repository.AppointmentRepository;

/**
 * @author Shivani
 *
 */
@Service
public class AppointmentService {
	
	@Autowired
	private AppointmentRepository appointmentRepository;
	
	/**
	 * @param appointment
	 * @return Appointment
	 */
	public Appointment save(Appointment appointment) {
		return appointmentRepository.save(appointment);
	}
	

	/**
	 * @param appointmentId
	 * @return Appointment
	 */
	public Appointment getAppointmentById(int appointmentId) {
		return appointmentRepository.getByAppointmentId(appointmentId);
	}
	
	/**
	 * @param startDate
	 * @param endDate
	 * @return List<Appointment>
	 */
	public List<Appointment> getAllAppointment(String startDate,String endDate){
		return appointmentRepository.getAllAppointment(startDate, endDate);
	}
}
