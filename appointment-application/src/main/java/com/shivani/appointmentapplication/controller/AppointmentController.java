package com.shivani.appointmentapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shivani.appointmentapplication.Entity.Appointment;
import com.shivani.appointmentapplication.services.AppointmentService;

/**
 * @author Shivani
 *
 */
@RestController
@RequestMapping("/appointment")
public class AppointmentController {

	@Autowired
	private AppointmentService appointmentService;
	
	/**
	 * @param appointment
	 * @return Appointment
	 */
	@PostMapping("/")
	public Appointment saveAppointment(@RequestBody Appointment appointment) {
		
		
		return appointmentService.save(appointment);
	}
	
	/**
	 * @param id
	 * @return Appointment
	 */
	@GetMapping("/{id}")
	public Appointment getAppointmentById(@PathVariable int id) {
		return appointmentService.getAppointmentById(id);
	}
	
	/**
	 * @param startDate
	 * @param endDate
	 * @return List<Appointment>
	 */
	@GetMapping("/data")
	public List<Appointment> getAppointmentByDate(@RequestParam String startDate, @RequestParam String endDate) {
		System.out.println(startDate +" "+endDate);
		return appointmentService.getAllAppointment(startDate, endDate);
	}
}
