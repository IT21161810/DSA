package Stack;

public class query {

	private int []queryArray;
	private int maxSize;
	private int front;
	private int rear;
	private int nItems;
	
	public query(int s){
		maxSize = s;
		queryArray = new int[maxSize];
		front = 0;
		rear  = -1;
		nItems = 0;
	}
	
	public void insert(int j) {
	
		if(rear == nItems-1) {
			System.out.println("Queue is full");
		}else {
			queryArray[++rear] = j;
			nItems++;
		}
		
		
	}
	
	public int remove() {
		
		if(nItems == 0) {
			System.out.println("No queue");
			return -99;
		}
		nItems--;
		return queryArray[front++];
	}
	
	public int peekfront() {
		if(nItems == 0) {
			System.out.println("Queue is full");
			return -99;
		}else {
			return queryArray[front];
		}
		
	}
	
	public boolean isFull() {
		
		return (rear == maxSize - 1);
	}
	
	public boolean isEmpty() {
		
		return (rear ==  - 1);
	}
	
	

	

}
			
	
