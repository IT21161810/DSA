package Lab02;

public class QueueX {

		private int[] queueArr;
		private int maxSize;
		private int rear;
		private int front;
		private int nItems;
		
		public QueueX(int s) {
			
			maxSize  = s;
			queueArr = new int[maxSize];
			rear = -1;
			front = 0;
			nItems = 0;
		}
		
		public boolean isEmpty() {
			
			return(nItems == 0);
			
		}
		public boolean isFull() {
			
			return(rear == maxSize-1); //always front is not equal front == 0 is not always true
		}
	
		public void insert(int j) {
			
			if(rear == maxSize-1) {
				System.out.println("Queue is full");
				
			}else {
				queueArr[++rear] = j;
				nItems++;
			}
			
		}
		
		public int remove() {
			
			if(nItems == 0){
				System.out.println("Queue is empty");	
				return -99;
			}else {
				nItems--;
				return queueArr[front++];
			}
		}
		
		

}
