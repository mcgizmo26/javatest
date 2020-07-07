package test;

public class Animal {
	private int legs;
	private boolean tail;
	private String size;
	
	public Animal(int legs, boolean tail, String size){
		this.legs = legs;
		this.tail = tail;
		this.size = size;
	}
	
	public int getLegs() {
		return this.legs;
	}
	
	public boolean getTail() {
		return this.tail;
	}
	
	public String getSize() {
		return this.size;
	}

};
