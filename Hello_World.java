package exercises;

 class ABC 
{ 
 public void print_ABC() 
 { 
 System.out.println("Cooking"); 
 } 
} 
 
 
  class PQR extends ABC 
{ 
 public void print_PQR() 
 { 
 System.out.println("IoT"); 
 } 
} 
  public class Hello_World{
public static void main(String[] args) {
PQR d = new PQR(); 
 d.print_ABC(); 
 d.print_PQR();
 
}
}
