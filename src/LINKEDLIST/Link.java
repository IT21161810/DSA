package LINKEDLIST;

public class Link {

	public int iData; //data of a link
	public Link next; //pointer to next
	
	public Link(int id) {
		iData = id;
		next = null;
	}
	
	public void displayLink() {
		System.out.println(iData);
	}
}
