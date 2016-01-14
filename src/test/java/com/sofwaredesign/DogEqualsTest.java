package com.sofwaredesign;

import com.sofwaredesign.Dog;

import junit.framework.TestCase;

/**
 * tests for equals method of dog class.
 * @author p.bell
 *
 */
public class DogEqualsTest extends TestCase{

	
	public void testEqualsFalse(){
		Dog bernard= new Dog("bernard",2);
		Dog dalmatian= new Dog("dalmatian",2);
		assertFalse(bernard.equals(dalmatian));
	}
	
	public void testEqualsTrue(){
		Dog bernard= new Dog("bernard",2);
		Dog bernard2= new Dog("bernard",2);
		assertTrue(bernard.equals(bernard2));
	}
	
	public void testEqualsSame(){
		Dog bernard= new Dog("bernard",2);
		assertTrue(bernard.equals(bernard));
	}
	
	
}
