package com.project.springboot.ServiceImpl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.project.springboot.services.ShapeService;
@Service
public class TriangleShape implements ShapeService{

	@Override
	public void drawShape(String shapeMessage) {
		System.out.println("Trinagel shape has 3 sides"+ shapeMessage);
		
	}

}
