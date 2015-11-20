package com.rahul.designPatterns;


/************Note*********************
 * The Class is a simple example of singleton 
 * It is not thread safe
 * It uses Lazy Initialization
 *************************************/

public class SimpleSingleton {

	private static SimpleSingleton instance;

	private SimpleSingleton() {
		// To avoid direct initialization
	}
	
	// The static function
	public static SimpleSingleton getInstance() {

		if(instance == null) {
			instance = new SimpleSingleton();
		}
		return instance;
	}

}
