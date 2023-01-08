package exercises;



interface sam
{
	public void print_sam();
	
}
interface trim{
	public void print_trim();
	
}
interface bell extends sam,trim{
	public void print_bell();
	
}
   class derived implements bell{
	public void print_sam()
	{
		System.out.println("I am Cooking");
		
	}
	public void print_Trim()
	{
		System.out.println("Emerging Technology");
		
	}
	public void print_bell()
	{
		System.out.println("IoT");
	}
	@Override
	public void print_trim() {
		// TODO Auto-generated method stub
		
	}
	
	
}
public class Javaexercise27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			derived d =new derived();
			
		
		d.print_sam();
		d.print_trim();
		d.print_bell();
		

	}

}
