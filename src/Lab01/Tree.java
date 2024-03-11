package Lab01;

public class Tree {

	private Node root;
	
	public  Tree() {
		root = null;
	}
	
	public void insert(int id,String dd) {
		
		Node newnode = new Node();
		newnode.empno = id;
		newnode.name  = dd;
		
		if(root == null) 
			root = newnode;
		else
		{
			
		}
		
	}
	
	public boolean delete(int id) {
		
		return false;	
	}
	
	public Node find(int key) {
		
		Node current = root;
		while(current.empno != key) {
			if(key < current.empno) 
				current = current.leftchild;
				
			else
			    current = current.rightchild;	
				if(current == null) 
					return null;
				
			}
		  return root;
	 }
	
	
		
			

	
	
}
