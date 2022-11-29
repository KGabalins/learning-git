public class Dog{
	private String myName;
	private int myAge;
	private String myBreed;

	public Dog(String name, int age){
		myName = name;
		myAge = age;
		// Need to make a random generator that chooses a random breed
		myBreed = "Bulldog";
	}

	public void bark(){
		System.out.println("Wuff wuff!");
	}

	public void desc(){
		System.out.println(myName + " is a " + myAge + " year old " + myBreed);
	}
}

