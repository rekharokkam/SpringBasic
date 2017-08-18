package com.chapter1.dependency.manual;

import java.util.List;

import com.chapter1.di.KioskLocator;
import com.chapter1.di.RentalLocation;
import com.chapter1.di.RentalService;

public class AdminConsole {
	
	@SuppressWarnings ("unused")
	public static void main(String[] args) {
		RentalService rentalService = new RentalService(new KioskLocator("key"));
		
		List<RentalLocation> locations = rentalService.find("Speed", "16802", 10);
	}

}
