package animals;

public class Animal {
	
	public int age;
	public String gender;
	
	public void isMammal() {
		System.out.println("This is the public isMammal method in the Animal class");
	}
	
	public void mate() {
		System.out.println("This is the public mate method in the Animal class");
	}
	
	public static void main(String[] args) {
		
		Animal myAnimal = new Animal();
		Fish myFish = new Fish();
		Zebra myZebra = new Zebra();
		
		myAnimal.isMammal();
		myAnimal.mate();
		
		myZebra.run();
	}
	
}
