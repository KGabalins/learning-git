import java.util.Random;

public class Dog{
	private String myName;
	private int myAge;
	private String myBreed;
	private Random myRandom = new Random();
	private String[] myBreeds = {"Bulldog", "German Shepherd", "Siberian Husky", "Golden Retriever",
								 "Boxer", "Poodle"};

	public Dog(String name, int age){
		myName = name;
		myAge = age;
		// Need to make a random generator that chooses a random breed

		myBreed = myBreeds[myRandom.nextInt(myBreeds.length)];
	}

	public void bark(){
		System.out.println("Wuff wuff!");
	}

	public void desc(){
		System.out.println(myName + " is a " + myAge + " year old " + myBreed);
	}
}

