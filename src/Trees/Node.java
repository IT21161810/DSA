package Trees;

public class Node {
	
	public int iData;
	public double dData;
	public Node leftChild;
	public Node rightChild;
	
	public Node() {
		
	}
	
	public void displayNode() {
		System.out.println(iData+" , "+dData);
	}
	
}
