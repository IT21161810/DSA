package Stack;

public class ArrayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array ar1 = new Array(5);
		
		ar1.push(20);
		ar1.push(30);
		ar1.push(50);
		ar1.push(60);

		while(!ar1.isEmpty()) {
			System.out.println(ar1.pop());
		}
		
		System.out.println(ar1);
		
		

	}

}
