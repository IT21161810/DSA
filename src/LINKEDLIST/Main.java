package LINKEDLIST;

public class Main {

	public static void main(String[] args) {
		
		LinkList newlist = new LinkList();
		
		newlist.insertFirst(32);
		newlist.insertFirst(43);
		newlist.insertFirst(67);
		newlist.insertFirst(87);
		newlist.insertFirst(62);
		
//		newlist.displayList();
		
		while(!newlist.isEmpty()) {
			Link alink = newlist.deleteFirsy();
			alink.displayLink();
		}

	}

}
