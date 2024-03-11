package LinkList;

public class LinkList {

	private Link first;
	
	public LinkList() {
		first = null;
	}
	
	public boolean isEmpty() {
		
		return (first==null);
	}
	
	public void insertFirst(String name,double avg) {
		
		Link newlink = new Link(name,avg);
		newlink.next = first;
		first = newlink;
	}
	
	public Link deleteFirst() {
			Link temp = first;
			first = first.next;
			return temp;
			
	}
	
	public void displayList() {
		
		Link current = first;
		
		while(current!=null) {
			
			current.displayDetails();
		}
		
	}
	
public Link deleteLink(String name) {
		
		Link current = first;
		Link previous = first;
		
		if(current == null) {
			return null;
		}
		while(!current.name.equals(name)){
			current = previous;
			current = current.next;
			
			if(current == null) {
				return null;
			}
		}
		
		if(current == first) {
			first = first.next;
		}else {
			previous.next = current.next;
		}
		return current;
	}
	
	
	
	
}
