package Trees;

import java.util.Scanner;

public class MainTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  fact();
		
		}
		
		
	public static int fact() {
		
		int i;
		int num = 5;
		for(i=1;num >= i;i++) {
			num = num *(num-1);
			
	     }
		return num;
	}

}
