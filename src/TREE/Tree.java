package TREE;

public class Tree {

	private Node root;
	
	public Tree() {
		root = null;
	}
	
	public void insert(int id,double dd) {
		Node newNode = new Node();
		newNode.iData = id;
		newNode.dData = dd;
		
		if(root == null) 
			root = newNode;
		else
		{
			Node current = root;
			Node parent;
			while(true)
			{
				parent = current;
				
				if(id < current.iData)
				{
					current = current.leftChild;
					if(current == null) {
						parent.leftChild = newNode;
						return;
					}
				}
				else {
					current = current.rightChild;
					if(current == null) {
						current.rightChild = newNode;
						return;
					}
				}
			}
		}
	}
	

	
	public Node find(int key) {
		Node current = root;
		while(current.iData != key) {
			if(key < current.iData) 
				current = current.leftChild;
			else
				current = current.rightChild;
			    if(current == null) {
			        return null;
			      }
		}
		
		return current;
	}
	
	
    public void delete(int id) {
		
    	
	}
	
	
	
	
}
