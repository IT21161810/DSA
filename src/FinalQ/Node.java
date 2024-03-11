package FinalQ;

public class Node {
	
	public int empno;
	public String empname;
	public Node leftchild;
	public Node rightchild;
	
	public Node() {
		
		empno = this.empno;
		empname = this.empname;
	}
	
	public void displayNode() {
		System.out.println("empno :"+empno+"empname :"+empname);
	}

}
