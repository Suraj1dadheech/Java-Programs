package java.CoreJavaPart3.Collections.SetsAndHashSets.Challenge;

public class DogMain {

	public static void main(String[] args) {
		Labrador rover=new Labrador("Rover");
		Dog rover2=new Dog("Rover");
		
		
		System.out.println(rover2.equals(rover));
		System.out.println(rover.equals(rover2));

		//Lebrador is instance of DOG
		// But Dog is not  Instace of Lebrador
//		System.out.println(dog.equals(labrador));    // true
//		System.out.println(labrador.equals(dog));   // false

//		System.out.println(labrador instanceof Dog); //true
//		System.out.println(dog instanceof Labrador); //false
	}

}
