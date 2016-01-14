package com.sofwaredesign;

public final class Dog extends Animal{

	private final String breed;
	
	public Dog(String breed, int age ){
		super(age);
		this.breed=breed;
	}
	
	public String getBreed(){
		return this.breed;
	}

	/**
	 * it is better to use Apache Commons Lang EqualsBuilder for real projects which have more classes with
	 * many equals methods.
	 * We do not use 3rd party dependencies for this method in order to understand the behavior.
	 */
	@Override
	public boolean equals(Object obj){
		if (obj == this){ 
			return true; 
		} 
		if (obj == null || obj.getClass() != this.getClass()) { 
			return false; 
		}
		
		Dog dog= (Dog) obj;
		return dog.getAge()== getAge() 
				&& (dog.getBreed()==getBreed() || (getBreed() != null && getBreed().equals(dog.getBreed())));
	}
	
	/**
	 * it is better to use Apache Commons Lang HashCodeBuilder for real projects which have more classes with
	 * many hashCode methods.
	 * We do not use 3rd party dependencies for this method in order to understand the behavior.
	 */
	@Override
	public int hashCode(){
		final int prime = 31; 
		int result = 1; 
		result = prime * result + ((getBreed() == null) ? 0 : getBreed().hashCode()); 
		result = prime * result + getAge();
		return result;
	}
}
