package exercises;

class Tony 
{ 
 public void print_Tony() 
 { 
 System.out.println("I am Cooking"); 
 }
} 

class Mark extends Tony 
{ 
 public void print_Mark() 
 { 
 System.out.println("Emerging Technology"); 
 } 
} 
class Super extends Tony
{ 
 public void print_Super() 
 { 
 System.out.println("IoT"); 
 } 
} 
public class Javaexercise26
	{
	public static void main(String[] args) {
		Super d = new Super(); 
 d.print_Tony();
 Mark f = new Mark(); 
 f.print_Mark();
 


	}

}
