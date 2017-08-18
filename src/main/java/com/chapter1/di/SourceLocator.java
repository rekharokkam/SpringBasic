package com.chapter1.di;

import java.util.List;

public interface SourceLocator {

	List<RentalLocation> find(String zipCode, int radius);

}