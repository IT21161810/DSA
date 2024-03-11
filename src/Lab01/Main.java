package Lab01;

public class Main {

	public static void main(String[] args) {
		
		LinkList stdntList = new LinkList();
		
		stdntList.insertFirst("prashani", 56.8);
		stdntList.insertFirst("aravinda", 78.6);
		stdntList.insertFirst("Nipuna", 78.3);
		
		stdntList.displyList();
		stdntList.deleteFirst();
		
	}

}
