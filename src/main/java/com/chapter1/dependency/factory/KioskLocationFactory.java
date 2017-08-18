package com.chapter1.dependency.factory;

import com.chapter1.di.KioskLocator;
import com.chapter1.di.SourceLocator;

public class KioskLocationFactory {

	public static SourceLocator getInstance (){
		return new KioskLocator("key");
	}
	
}
