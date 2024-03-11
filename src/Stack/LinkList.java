package Stack;

public class LinkList {

	private Link first;
	public LinkList() {
		first = null;
		
	}
	public void displayList() {
		Link cur = first;
		while(cur != null) {
			cur.displayLink();
			cur = cur.next;
		}
		
	}
	public Link find(int key) {
		
		Link cur = first;
		while(cur != null) {
			if(cur.iData == key) 
				return cur;
			else 
				cur = cur.next;
		}
		return null;	
	}
	
	public void insertAfter(int key) {
		
		Link newlink = new Link(key);
		newlink.next = first;
		first = newlink; // insertAfter(2) apperaring as first one
	}
	
	public boolean insertAfter(int key,int newData) {
	
		Link newlink1 = new Link(newData);
		Link cur = first; //make link that refer to current
		while(cur != null) {
			if(cur.iData == key) {
				newlink1.next = cur.next;
				cur.next = newlink1;
				return true;
			}else {
				cur = cur.next;
			}
		}
		        return false;
	}
	
	public Link deleteFirst() {
		Link temp = first;
		first = first.next;
		
		
		return temp;
		
	}
	public boolean delete(int key) {
		Link cur = first;
		Link prev = first;
		while( cur != null) {
			if(cur.iData == key) {
				
				if( cur == first) { //if first is deleting
					first = first.next;
					return true;
				}else {
					cur.next = prev.next; //if middle is deleting
					return true;
				}
			
			}else {
				prev = cur; //buid one gap difference
				cur = cur.next;
			}
		}
		return false;
	}
	
	
	
	
	
}
