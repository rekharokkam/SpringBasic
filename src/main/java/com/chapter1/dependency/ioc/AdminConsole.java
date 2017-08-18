package com.chapter1.dependency.ioc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chapter1.di.RentalLocation;
import com.chapter1.di.RentalService;

@SuppressWarnings ("unused")
public class AdminConsole {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		
		RentalService rentalService = context.getBean("kioskLocation", RentalService.class);
		
		List<RentalLocation> locations = rentalService.find("Speed", "16802", 10);
		
		((ClassPathXmlApplicationContext)context).close();
	}

}
