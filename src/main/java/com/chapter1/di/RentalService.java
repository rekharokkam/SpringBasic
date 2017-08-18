package com.chapter1.di;

import java.util.ArrayList;
import java.util.List;

/*
 * 3 Rules to apply dependecy Injection pattern
 * 
 * 1) Identify the dependencies
 * 2) Define abstraction for dependencies - Create an interface / abstract class
 * 3) Inject Implementation of the dependency
 * 
 *
 */
public class RentalService {

	private SourceLocator storeLocator ;
	
	public RentalService (SourceLocator storeLocator)
	{
		this.storeLocator = storeLocator;
	}
	
	public List<RentalLocation> find (String title, String zipCode, int miles){
		List<RentalLocation> locations = storeLocator.find(zipCode, miles);
		
		List<RentalLocation> availableLocations = new ArrayList<RentalLocation>();
		for (RentalLocation location : locations){
			if (location.getTitles().contains(title)){
				availableLocations.add(location);
			}
		}
		
		return availableLocations;
	}
	
}
