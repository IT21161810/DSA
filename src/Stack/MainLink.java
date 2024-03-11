package Stack;

import java.util.Scanner;

public class MainLink {

	public static void main(String[] args) {
		
		LinkList l1 = new LinkList();
		Scanner sc = new Scanner(System.in);
		for(int i=1;i<=5;i++) {
			l1.insertAfter(sc.nextInt());
		}
		sc.close();
		
		if(l1.insertAfter(10,20) == true)
			l1.displayList();
		
	    if(l1.delete(10) == true)
	    	l1.displayList();
	    
	}

}


