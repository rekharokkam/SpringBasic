package com.chapter1.dependency.factory;

import java.util.List;

import com.chapter1.di.RentalLocation;
import com.chapter1.di.RentalService;

public class CustomerWebsite {
	
	private static final String TITLE = "Forest Gump";

	public static void main(String[] args) {

		RentalService rentalService = new RentalService(DigitalMediaLocatorFactory.getInstance());
		
		List<RentalLocation> locations = rentalService.find(TITLE, "16802", 10);
	}
}
