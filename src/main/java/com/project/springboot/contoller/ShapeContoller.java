package com.project.springboot.contoller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.project.springboot.services.ShapeService;
@Service
public class ShapeContoller {

	private ShapeService shapeService;

	public ShapeContoller(@Qualifier("square") ShapeService shapeService) {
		this.shapeService = shapeService;
	}
	
	public void drawShape() {
		shapeService.drawShape("Shape Drawing...");
	}
}
