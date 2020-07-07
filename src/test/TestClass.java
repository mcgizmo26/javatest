package test;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog bostonTerrier = (Dog) new Breed("short", true, "short", "short", "Boston Terrier", 4, true, "Small");
		System.out.println("A " + bostonTerrier.breed + " is " + bostonTerrier.getSize() + ", has a " + bostonTerrier.tailSize + " tail, and has " + bostonTerrier.getLegs() + " legs.");
	}

}
