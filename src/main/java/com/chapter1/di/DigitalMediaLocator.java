package com.chapter1.di;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DigitalMediaLocator implements SourceLocator {

	private static List<RentalLocation> locations = new ArrayList<RentalLocation>();
	
	static{
		locations.add(new RentalLocation("Server A", Arrays.asList("Forest Gump", "Speed")));
		locations.add(new RentalLocation("Server B", Arrays.asList("Jaws", "Ghost")));
		locations.add(new RentalLocation("Server C", Arrays.asList("Forest Gump", "Hook")));
	}

	public DigitalMediaLocator() {
	}

	@Override
	public List<RentalLocation> find(String zipCode, int radius) {
		return locations;
	}

}
