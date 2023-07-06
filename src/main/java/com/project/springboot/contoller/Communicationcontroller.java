package com.project.springboot.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.project.springboot.services.CommunicationService;
import com.project.springboot.services.ShapeService;

@Service
public class Communicationcontroller {

	private CommunicationService eMailCommunicationService;
	private CommunicationService postalCommunicationService;
	
	
	/*
	 * @Autowired public void setCommunicationService(CommunicationService
	 * communicationService) { this.communicationService = communicationService; }
	 */
	
	/*
	 * The @Qualifier annotation allows you to specify which implementation should be
	 * injected for each field.
	 */
	public Communicationcontroller(@Qualifier("Email") CommunicationService eMailCommunicationService,
			@Qualifier("Postal") CommunicationService postalCommunicationService) {
		this.eMailCommunicationService = eMailCommunicationService;
		this.postalCommunicationService = postalCommunicationService;
	}
	
	public void springRunner() {
		eMailCommunicationService.communicateMessage("Message sent  Mail ");
		postalCommunicationService.communicateMessage("Message Sent Via POST");
	}
}