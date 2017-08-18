package com.chapter1.di;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StoreLcoator implements SourceLocator {
	
	private static List<RentalLocation> locations = new ArrayList<RentalLocation>();
	
	static{
		locations.add(new RentalLocation("Blockbuster", Arrays.asList("Forest Gump", "Speed")));
		locations.add(new RentalLocation("Gary's Video", Arrays.asList("Jaws", "Ghost")));
		locations.add(new RentalLocation("West Coast Video", Arrays.asList("Forest Gump", "Hook")));
	}

	/* (non-Javadoc)
	 * @see com.chapter1.di.SourceLocator#find(java.lang.String, int)
	 */
	@Override
	public List<RentalLocation> find (String zipCode, int radius){
		return locations;
	}
}
