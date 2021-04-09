//Importing the Scanner class
import java.util.Scanner;
public class control_flow {
	public static void main(String[] args) {
		// Create a Scanner object
		int num = 5;
		int fact = 1;
		for (int i = 1 ; i <= num; ++i){
		    fact *= i;
		}
	    System.out.println("Factorial of " + num + " is " + fact);
}
}

