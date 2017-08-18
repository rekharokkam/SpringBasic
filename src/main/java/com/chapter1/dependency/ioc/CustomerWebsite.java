package com.chapter1.dependency.ioc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chapter1.di.RentalLocation;
import com.chapter1.di.RentalService;

@SuppressWarnings ("unused")
public class CustomerWebsite {
	
	private static final String TITLE = "Forest Gump";

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		
		RentalService rentalService = context.getBean("digitalMediaRentalService", RentalService.class);
		
		List<RentalLocation> locations = rentalService.find(TITLE, "16802", 10);
		
		for(RentalLocation eachLocation : locations){
			System.out.println(eachLocation.getName());
		}

		((ClassPathXmlApplicationContext)context).close();
	}
}
