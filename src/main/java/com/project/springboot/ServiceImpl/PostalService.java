package com.project.springboot.ServiceImpl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.project.springboot.services.CommunicationService;

@Service
@Qualifier("Postal")
public class PostalService implements CommunicationService{

	@Override
	public void communicateMessage(String message) {
		System.out.println("Messages will  be Delivered by Post ");
		
	}
	

}
