package FinalQ;

public class QueueX {
	
	private int queueArr[];
	private int maxsize;
	private int rear;
	private int front;
	private int nItem;
	
	public void QueueX(int s) {
		
		maxsize = s;
		queueArr = new int[maxsize];
		rear = -1;
		front = 0;
		
	}
	
	public boolean isEmpty() {
		return (nItem == 0);
	}
	
	public boolean isFull() {
		return (rear == maxsize-1);
	}
	
	public void insert(int j) {
		
		if(isFull()) {
			System.out.println("Queue is full");
		}else {
			queueArr[++rear] = j;
		}
		
	}
	
	public int remove() {
		
		if(isEmpty()) {
			System.out.println("Queue is empty");
		}
		else
		nItem--;	
		return queueArr[front++];
		
	}
	
	
}
	

