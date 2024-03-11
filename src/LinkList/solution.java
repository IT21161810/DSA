package LinkList;

import java.util.Scanner;

public class solution {

	public static void main(String[] args) {
		
		System.out.println("Enter array elements ");
		String[] str = new String[5]; // initialize with length 4
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<4; i++) { // change condition to i<4 to avoid index out of bounds
		    str[i] = sc.next();
		}

		String prefix = "";
		try {
		    prefix = longestCommonPrefix(str);
		} catch(Exception e) {
		    e.printStackTrace();
		}

		System.out.println("The longest common prefix is: " + prefix);
	}
	
	
	
	public static String longestCommonPrefix(String[] str) {
		
		if(str.length == 0 || str == null) {
			return "";
		}
		String prefix = str[0];
		for(int i =1;i<str.length;i++) {
			while(str[i].indexOf(prefix) != 0) {
				prefix = prefix.substring(0,prefix.length()-1);
				if(prefix.isEmpty()) {
					return "";
				}
			}
		}
		
		return prefix;
		
	}

}
