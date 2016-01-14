package com.sofwaredesign.comparator;

import java.util.Comparator;

import com.sofwaredesign.Animal;

public class AgeComparator implements Comparator<Animal>{

	public int compare(Animal o1, Animal o2) {
		return o1.getAge() - o2.getAge();
	}

}
