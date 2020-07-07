package test;

public class Dog extends Animal{
	protected String tailSize;
	protected String furType;
	protected String breed;

	public Dog(String tailSize, String furType, String breed, int legs, boolean tail, String size) {
		// TODO Auto-generated constructor stub
		super(legs, tail, size);
		
		this.tailSize = tailSize;
		this.furType = furType;
		this.breed = breed;
		
	}
	
	public void bark() {
		System.out.println("Woof Woof Woof");
	}
	 

}
