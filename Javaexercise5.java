package exercises;

public class Javaexercise5 {

	public static void main(String[] args) {
		
		// Assignment Operator
		int number1, number2;
		 number1 = 10;
		 System.out.println(number1);
		 number2 = number1;
		 System.out.println(number2);
		 
		// Arithmetic Operator
		 double output;
		 
		 // Addition operator
		 output = number1 + number2;
		 System.out.println("number1 + number2 = " + output);
		 
		 // Subtraction operator
		 output = number1 - number2;
		 System.out.println("number1 - number2 = " + output);
		 
		 // Multiplication operator
		 output = number1 * number2;
		 System.out.println("number1 * number2 = " + output);
		 // Division operator
		 output = number1 / number2;
		 System.out.println("number1 / number2 = " + output);
		 
		 // Remainder operator
		 output = number1 % number2;
		 System.out.println("number1 % number2 = " + output);
		 
		// Unary Operators
		 double number = 10, resultNumber;
		 boolean flag = false;
		 
		 System.out.println("+number = " + +number);
		 // number is equal to 10.
		 
		 System.out.println("-number = " + -number);
		 // number is equal to 10.
		 
		 // ++number is equivalent to number = number + 1
		 
		 System.out.println("number = " + ++number);
		 // number is equal to 11.
		 // -- number is equivalent to number = number - 1
		 System.out.println("number = " + --number);
		 // number is equal to 10.
		 System.out.println("!flag = " + !flag);
		 // flag is still false.
		 System.out.println(number++);
		 System.out.println(number);
		 System.out.println(++number);
		 System.out.println(number);
		 
		// Relational Operators
		 if (number1 > number2)
		 {
		 System.out.println("number1 is greater than number2.");
		 }
		 if (number1 < number2)
		 {
		 System.out.println("number2 is greater than number1.");
		 }
		 if (number1 == number2)
		 {
		 System.out.println("number1 is equal to number2.");
		 }
		 
		// Logical Operators
		 int number3 = 20;
		 boolean result;
		 // Logical OR Operator
		 result = (number1 > number2) || (number3 > number1);
		 // result will be true because number3 greater than number1
		 System.out.println(result);
		 
		 // Logical AND Operator
		 result = (number1 > number2) && (number3 > number1);
		 // result will be false because number1 is equal to number2
		 System.out.println(result);
		 
		// Ternary Operator
		 int februaryDays = 29;
		 String display;
		 
		 display = (februaryDays == 28) ? "Not a leap year" : "Leap year";
		 System.out.println(display);
		 
		// Bitwise Operator
		 int a = 50; /* 50 = 0011 0010 */
		 int b = 20; /* 20 = 0001 0100 */
		 int c = 0;
		 c = a & b; /* 16 = 0001 0000 */
		 System.out.println("a & b = " + c );
		 c = a | b; /* 54 = 0011 0110 */
		 System.out.println("a | b = " + c );
		 c = a ^ b; /* 38 = 0010 0110 */
		 System.out.println("a ^ b = " + c );
		 c = ~a; /*-51 = 1100 1101 */
		 System.out.println("~a = " + c );
		 
		// Shift Operator
		 c = a >> 2; /* 12 = 0000 1100 */ // Right shift operator
		 System.out.println("a >> 2 = " + c );
		 
		 c = a << 2; /* 200 = 1100 1000 */ // left shift operator
		 System.out.println("a << 2 = " + c );


		

	}

}
