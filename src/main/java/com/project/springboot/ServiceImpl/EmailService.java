package com.project.springboot.ServiceImpl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.project.springboot.services.CommunicationService;
@Service
@Qualifier("Email")
public class EmailService implements CommunicationService {

	@Override
	public void communicateMessage(String message) {
		System.out.println(message +"Sending Message Via E-Mail.");

	}

}
