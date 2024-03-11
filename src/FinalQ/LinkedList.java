package FinalQ;

public class LinkedList {

	private Link first;
	
	public LinkedList() {
		first = null;
	}
	
	public boolean isEmpty() {
		return (first == null);
	}
	
	public void insertFirst(String name,double avg) { //insert as first link
		Link newlink = new Link(name,avg);
		newlink.next = first;
		newlink = first;
		
	}
	
	public Link deleteFirst() {
		Link temp = first;
		first = first.next;
		return temp;//delete the first link
	}
	
	public void displayList() {
		Link cur = first;
		
		while(cur != null) {
			cur.displayDetails();
			cur = cur.next;
		}
		
	}
	
	public Link deleteLink(String name) {
		
		Link current = first;
		Link previous = first;
		
		if(current == null) {
			return null;
		}
		
		while(!current.name.equals(name)) {
			previous = current;
			current  = current.next;
			
			if(current == null) {
				return null;
			}
		}
		
		if(current == first) {
			first = first.next;
		}
		else {
			previous.next = current.next;
		}
		return current;
	}
	
	
}
