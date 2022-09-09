package com.shivani.appointmentapplication.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Aspect
@Component
@Slf4j
public class AppointmentAOP {
	
	@Pointcut("execution(* com.shivani.appointmentapplication.controller.AppointmentController.*(..))") 
	private void appointmentControllerPointcut() {
		
	}
	

	@After(value = "appointmentControllerPointcut()")
	private void allAppointmentControllerMethod(JoinPoint jp) {
		log.info("working fine");
		log.debug(jp.getSignature().getName());
	}
}
