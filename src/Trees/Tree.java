package Trees;

public class Tree {
		
	public Node root;
	
	public Tree() {
		
		root = null;
	}
	
	public Node find(int key) {
		Node cur = root;
		
		while(cur.iData != key) { //till current == key value iterate current value
			if(key < cur.iData)
				cur = cur.leftChild;
			else
				cur = cur.rightChild;
			if(cur == null) //if there is no node return null
				return null;
		}
		
		return cur;
	}
	
	public void insert(int id,double dd) {
		Node newnode = new Node();
		newnode.iData = id;
		newnode.dData = dd;
		
		Node cur = root;
		Node previous =  root;
		
		while(true) {
			if(id < cur.iData) {
				cur = cur.leftChild;
				if(cur == null) {
					previous.leftChild = newnode;
					return;
				}
			}
			else {
				cur = cur.rightChild;
				if(cur == null) {
					previous.rightChild = newnode;
					return;
				}
			}
				
	    }	
		
	}
	
	public Node minimum() {
		Node cur = root;
		while(cur.leftChild != null) {
			cur = cur.leftChild;
			
		}
		return cur;
	}
	
	private void inorder(Node localRoot) { //left root right
		if(localRoot != null) {
			inorder(localRoot.leftChild);
			localRoot.displayNode();
			inorder(localRoot.rightChild);
		}
	}
	
	public void Traverseinorder() {
		inorder(root);
	}
	
	public void preorder(Node localRoot) { //root left right
		if(localRoot != null) {
			localRoot.displayNode();
			preorder(localRoot.leftChild);
			preorder(localRoot.rightChild);
		}
	}
	
	public void Traversepreorder() {
		inorder(root);
	}
	
	public void postorder(Node localRoot) { //left right root
		if(localRoot != null) {
			preorder(localRoot.leftChild);
			preorder(localRoot.rightChild);
			localRoot.displayNode();
		}
	}
	
	public void Traversepostorder() {
		inorder(root);
	}
	
	public Node findRecursive(Node localRoot,int empno) {
		
		if(localRoot == null) {
			return null;
		}
		else if(localRoot.iData == empno) {
			return findRecursive(localRoot.leftChild,empno);
		}else {
			return findRecursive(localRoot.rightChild,empno);
		}
	}
	
	public void deleteAll() {
		root = null;
	}
}
