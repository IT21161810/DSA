package Lab01;

import java.util.Scanner;

public class QueueApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueX queueX = new QueueX(5);
		Scanner sc = new Scanner(System.in);
		
		int inptStr;
		
		for(int i=1;i<=5;i++) {
			System.out.println("Enter transaction ID :" +i+"");
		    inptStr =  sc.nextInt();
		    queueX.insert(inptStr);
		}
		
		QueueX odd = new QueueX(5);
		QueueX even = new QueueX(5);
		
		int value;
		while(!queueX.isEmpty()) {
			value = queueX.remove();
			
			if(value %2==0) {
				odd.insert(value);
			}else {
				even.insert(value);
			}
		}
		
		System.out.println("PC1");
		while(!odd.isEmpty()) {
			System.out.println("Transaction ID :"+odd.remove());
		}
		
		
		System.out.println("PC2");
		while(!even.isEmpty()) {
			System.out.println("Transaction ID :"+even.remove());
		}

	}

}
