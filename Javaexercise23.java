package exercises;

abstract class Bird{
	abstract void makeSound();
	
}
	
	class Duck extends Bird{
		public void makeSound() {
			System.out.println("The sound that a Duck makes: QuackQuack");
			
		}
	}
	class Owl extends Bird{
		public void makeSound() {
			System.out.println("The sound that Owl makes: Hoot Hoot");
			
		}
	}
public class Javaexercise23 {

	public static void main(String[] args) {
		Duck d = new Duck();
		d.makeSound();
		Owl c = new Owl();
		c.makeSound();
		
		
	}

}
