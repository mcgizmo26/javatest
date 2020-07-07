package test;

public class Breed extends Dog {
	public String noseLength;
	public boolean pureBreed;

	public Breed(String noseLength, boolean pureBreed, String dogTailSize, String dogFurType, String dogBreed, int dogLegs, boolean dogTail, String dogSize) {
		// TODO Auto-generated constructor stub
		super(dogTailSize, dogFurType, dogBreed, dogLegs, dogTail, dogSize);
		this.noseLength = noseLength;
		this.pureBreed = pureBreed;
	}

}
