package com.shivani.appointmentapplication.Entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Table(name="appointment")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Appointment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int appointmentId;
	
	@Column(name="date_and_time")
	//@DateTimeFormat(pattern="yyy-MM-dd-HH.mm.ss")
	private LocalDateTime dateAndTime;
	
	private double duration;
	private String purpose;

}
