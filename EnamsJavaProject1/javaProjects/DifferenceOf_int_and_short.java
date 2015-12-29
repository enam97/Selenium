package javaProjects;

public class DifferenceOf_int_and_short {

	public static void main(String[] args) {
		/* integer is a variable that can holds a number -2^31 to +2^31-1.
		if the assigned value to a integer variable does not fall within that range,
		the compiler will show Error. Example as follows: */
		
		int i = 222222222;
		System.out.println("Print the value of integer variable a =" + i);
		
		
		/* short is a variable that can holds a number -2^15 to +2^15-1. If the
		  assigned value of a short variable does not fall within that range,
		  the compiler will show error. Example as follows: */
		
		short s = 22222;
		System.out.println("Print the value of short variable s =" + s);
	}

}
