package com.chapter1.di;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KioskLocator implements SourceLocator {

	private static List<RentalLocation> locations = new ArrayList<RentalLocation>();
	
	static{
		locations.add(new RentalLocation("Kiosk A", Arrays.asList("Forest Gump", "Speed")));
		locations.add(new RentalLocation("Kiosk B", Arrays.asList("Jaws", "Ghost")));
		locations.add(new RentalLocation("Kiosk C", Arrays.asList("Forest Gump", "Hook")));
	}

	/* (non-Javadoc)
	 * @see com.chapter1.di.SourceLocator#find(java.lang.String, int)
	 */
	@Override
	public List<RentalLocation> find (String zipCode, int radius){
		return locations;
	}
}
