package com.shivani.appointmentapplication.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Shivani
 *
 */
@Aspect
@Component
@Slf4j
public class AppointmentAOP {
	
	
	
	/**
	 *  Point cut expression
	 */
	@Pointcut("execution(* com.shivani.appointmentapplication.controller.AppointmentController.*(..))") 
	private void appointmentControllerPointcut() {
		
	}
	
	
	/**
	 * @param jp
	 * Execute after point cut method
	 */
	@After(value = "appointmentControllerPointcut()")
	private void allAppointmentControllerMethod(JoinPoint jp) {
		log.info("working fine");
		log.debug(jp.getSignature().getName());
	}
}
