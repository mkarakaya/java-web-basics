package com.sofwaredesign;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

import com.sofwaredesign.Animal;
import com.sofwaredesign.Dog;
import com.sofwaredesign.comparator.AgeComparator;

import junit.framework.TestCase;

/**
 * this test checks the order of the queue.
 * @author p.bell
 *
 */
public class ComparatorTest extends TestCase{

	public void testImmutableDog()
	{
		Comparator<Animal> comparator = new AgeComparator();
		PriorityQueue<Animal> queue = new PriorityQueue<Animal>(5, comparator);
		queue.add(new Dog("Shaggy", 3));
		queue.add(new Dog("Lacy", 2));
		queue.add(new Dog("Roger", 10));
		queue.add(new Dog("Tommy", 4));
		queue.add(new Dog("Tammy", 1));
		
		//sorted list by age
		List<String> checkList=new ArrayList<String>();
		checkList.add("Tammy");
		checkList.add("Lacy");
		checkList.add("Shaggy");
		checkList.add("Tommy");
		checkList.add("Roger");
		
		for(String name: checkList){
			Dog dog= (Dog) queue.poll();
			assertEquals(name, dog.getBreed());	
		}
	}
}
