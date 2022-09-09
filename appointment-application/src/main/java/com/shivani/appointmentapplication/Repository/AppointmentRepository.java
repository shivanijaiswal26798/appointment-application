package com.shivani.appointmentapplication.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.shivani.appointmentapplication.Entity.Appointment;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {

	Appointment getByAppointmentId(int appointmentId);
	
	@Query(value = "select * from appointment where date_and_time between ?1 and ?2", nativeQuery = true)
	public List<Appointment> getAllAppointment(String startDate,String endDate);

}
