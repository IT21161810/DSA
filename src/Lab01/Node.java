package Lab01;

public class Node {

	public int empno;
	public String name;
	public Node leftchild;
	public Node rightchild;
	
	public void displayNode() {
		System.out.println("Employee name : "+name+" Employee number : "+empno);
	}
	
}
