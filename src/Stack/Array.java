package Stack;

public class Array {

	private int maxSize;
	private double[] stackArray;
	private int top;
	
	public Array(int s) {
		
		maxSize = s;
		top = -1;
		stackArray = new double[maxSize];
	}
	
	public void push(double j) {
		
		if(top == maxSize -1) {
			System.out.println("Stack is full");
		}else {
			top++;
		    stackArray[top] = j;
		}
	}
	
    public double pop() {
    	if(top == -1) {
    		System.out.println("Stack is empty");
    	}
    	
    	  return stackArray[top--];
    }
    
    public boolean isEmpty() {
    	
    	return (top == -1);
    }
}
