package Lab02;

import java.util.Scanner;

public class MainQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueX Q1 = new QueueX(5);
		Scanner sc = new Scanner(System.in);
		int inputStr;
		
		for(int i=1;i<=5;i++) {
			
			System.out.println("Enter transaction ID : ");
			inputStr = sc.nextInt();
			Q1.insert(inputStr);
			
		}
		
		QueueX oddqueue  = new QueueX(5);
		QueueX evenqueue = new QueueX(5);
		int value;
		
		while(!Q1.isEmpty()) {
			value = Q1.remove();
			if(value % 2 == 0) {
				evenqueue.insert(value);
			}else {
				oddqueue.insert(value);
			
			}
		}
		
		System.out.println("PC 1");
		while(!evenqueue.isEmpty()) {
			System.out.println("Transaction : "+evenqueue.remove());
		}

		System.out.println("PC 2");
		while(!oddqueue.isEmpty()) {
			System.out.println("Transaction : "+oddqueue.remove());
		}
	}

}
