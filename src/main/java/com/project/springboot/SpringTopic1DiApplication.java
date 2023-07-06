package com.project.springboot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.project.springboot.configuration.Appconfig;
import com.project.springboot.contoller.Communicationcontroller;
import com.project.springboot.contoller.ShapeContoller;

public class SpringTopic1DiApplication {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext springContext = new AnnotationConfigApplicationContext(Appconfig.class);
		Communicationcontroller controllerObject = springContext.getBean(Communicationcontroller.class);
		controllerObject.springRunner();
		springContext.close();
		
		ApplicationContext  container1 = new ClassPathXmlApplicationContext("applicationContext.xml");
		ShapeContoller bean2 = container1.getBean("shapeContoller",ShapeContoller.class);
		bean2.drawShape();
	}
}
