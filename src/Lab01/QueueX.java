package Lab01;

public class QueueX {

	private int[] queueArr;
	private int maxsize;
	private int rear;
	private int font;
	private int nItem;
	
	public QueueX(int s) {
		maxsize = s;
		queueArr = new int [maxsize];
		rear = -1;
		font = 0;
		nItem = 0;
	}
	
	//isEmpty
	public boolean isEmpty() {
		
		return (nItem == 0);
	}
	
	public boolean isFull() {
		
		return (rear == maxsize-1);
	}
	
	public void insert(int j) {
		
		if(rear == maxsize-1) {
			System.out.println("Queue is full");
		}
		else {
			queueArr[++rear] = j; 
		}
		
	}
	
	public int remove() {
		
		if(nItem == 0) {
		   System.out.println("queue is empty");	
		}else 
			
			nItem--;
		    return queueArr[font++];
	}
	
	
	
	
}
