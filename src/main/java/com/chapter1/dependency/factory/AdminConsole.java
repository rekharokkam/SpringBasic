package com.chapter1.dependency.factory;

import java.util.List;

import com.chapter1.di.RentalLocation;
import com.chapter1.di.RentalService;

@SuppressWarnings ("unused")
public class AdminConsole {

	public static void main(String[] args) {
		RentalService rentalService = new RentalService(KioskLocationFactory.getInstance());
		
		List<RentalLocation> locations = rentalService.find("Speed", "16802", 10);
	}

}
