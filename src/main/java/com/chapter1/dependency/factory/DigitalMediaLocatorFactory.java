package com.chapter1.dependency.factory;

import com.chapter1.di.DigitalMediaLocator;
import com.chapter1.di.SourceLocator;

public class DigitalMediaLocatorFactory {

	public static SourceLocator getInstance (){
		return new DigitalMediaLocator();
	}
}
