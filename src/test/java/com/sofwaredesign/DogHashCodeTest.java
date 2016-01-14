package com.sofwaredesign;

import com.sofwaredesign.Dog;

import junit.framework.TestCase;

public class DogHashCodeTest extends TestCase{

	
	public void testHashCodeFalse(){
		Dog bernard= new Dog("bernard",2);
		Dog dalmatian= new Dog("dalmatian",2);
		assertFalse(bernard.hashCode()==dalmatian.hashCode());
	}
	
	public void testEqualsTrue(){
		Dog bernard= new Dog("bernard",2);
		Dog bernard2= new Dog("bernard",2);
		assertTrue(bernard.hashCode()==bernard2.hashCode());
	}
	
	public void testEqualsSame(){
		Dog bernard= new Dog("bernard",2);
		assertTrue(bernard.hashCode()==bernard.hashCode());
	}
}
