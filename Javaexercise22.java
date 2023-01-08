package exercises;

class Books{
	
	void run() {
		System.out.println("Book not in stock");
		
	}
	
}
public class Javaexercise22 extends Books {
	void run()
	{
		System.out.println("Book is available");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Javaexercise22 obj = new Javaexercise22();
		obj.run();
		
		

	}

}
