package exercises;

class XYZ {
	public void print_XYZ()
	{
		System.out.println("Cooking");
		
	}
}
class UVW extends XYZ
{
	public void print_UVW()
	{
		
	System.out.println("Emerging Technology");
	}
	
}

public class Javaexercise24 {

	public static void main(String[] args) {
		UVW d =new UVW();
		
		d.print_XYZ();
		d.print_UVW();
		
	}

}
