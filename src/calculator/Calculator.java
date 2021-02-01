package calculator;
import java.util.Scanner;
import java.lang.Math;

public class Calculator {
	public static void main(String[] args) {
		double a;
		double b;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		a = input.nextDouble();
		
		System.out.println("Enter the second number: ");
		b = input.nextDouble();
		String operation;
		
		System.out.println("Enter the operation: ");
		Scanner op = new Scanner(System.in); 
		operation = op.next();
		
		if (operation.equals("+")) {
	        System.out.println(a + " + " + b + " = " + (a + b));
	        }
		else if (operation.equals("-")) {
	            System.out.println(a + " - " + b + " = " + (a - b));
	        }

		else if (operation.equals("/")) {
	            System.out.println(a + " / " + b + " = " + (a / b));
	        }
		else if (operation.equals("*")) {
	            System.out.println(a + " * " + b + " = " + (a * b));
	        }
		
	}
}
