package Lab02;

import java.util.Scanner;

public class fact {

	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	       
	        factorial(5);
	        
	       
	    }
	 
	 public static int factorial(int n) {
		    if (n == 0 || n == 1) {
		        return 1;
		    } else {
		        return n * factorial(n - 1);
		    }
		}
	 
}
