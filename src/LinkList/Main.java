package LinkList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkList studentList = new LinkList();
		
		studentList.insertFirst("Prashani", 69.5);
		studentList.insertFirst("Aravinda", 78.0);
		studentList.insertFirst("nipun", 69.5);

		studentList.displayList();
		
		studentList.deleteLink("Aravinda");
		
		System.out.println();
		System.out.println();
		
		studentList.displayList();
	}
	

}
