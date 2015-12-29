package javaProjects;

public class FieldVariable_LocalVariable {
	final static int f = 45;
	static int  a;    /*This is a field/global variable as it's been declared 
	                   with the class level*/
	
	public static void main(String[] args) {
		// Example of printing the field variable:
		System.out.println("Print the field variable a = " + a);
		
		//Example of printing the local variable:
		int a = 10;   /*Here a is a local variable as it's been declared within the 
		              method*/
		
		System.out.println("Print the local variable a = " + a);

		
		int f = 25;   /*Here f is a local variable as it's been declared within the 
                      method*/

        System.out.println("Print the value in the variable f = " + f);
        //The result is showing the value of f = 25. But it should be f = 45.
	}

}
