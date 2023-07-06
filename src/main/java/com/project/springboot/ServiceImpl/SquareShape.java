package com.project.springboot.ServiceImpl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.project.springboot.services.ShapeService;
@Service
@Qualifier("square")
public class SquareShape implements ShapeService{

	@Override
	public void drawShape(String shapeMessage) {
		System.out.println("Square has 4 side "+shapeMessage);
		
	}
	

}
