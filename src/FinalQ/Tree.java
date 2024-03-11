package FinalQ;

public class Tree {

	private Node root;
	
	public void Tree() {
		root = null;
	}
	
	public Node find(int emp) {
		
		Node cur = root;
		while(cur.empno != emp) {
			if(emp < cur.empno)
				cur = cur.leftchild;
			else
				cur = cur.rightchild;
		}
		return cur;
	}
	
	
	public void insert(int emp,String name) {
		
		Node newnode = new Node();
		newnode.empname = name;
		newnode.empname = name;
		
		if(root == null) {
			newnode = root;
		}
		else {
			Node current = root;
			Node parent;
			
			while(true) {
				parent = current;
				if(emp<current.empno) {
					current = current.leftchild;
					if(current==null) {
						parent.leftchild = newnode;
						return;
					}
				}
				else {
					if(emp>current.empno) {
						current = current.rightchild;
						if(current==null) {
							parent.rightchild = newnode;
							return;
						}
					}
				}
			}
			
		}
		
	}
	
	
	private void inorder(Node localroot) {
		
		if(localroot != null) {
			inorder(localroot.leftchild);
			localroot.displayNode();
			inorder(localroot.rightchild);
		}
	}
	
	
	public void TraverseinOrder() {
		
		inorder(root);
	}
	
	
	private void preorder(Node localroot) {
		if(localroot != null) {
			localroot.displayNode();
			preorder(localroot.leftchild);
			preorder(localroot.rightchild);
		}
	}
	
	
	public void Traversepreorder() {
		preorder(root);
	}
	
	
	
	private void postorder(Node localroot) {
		if(localroot != null) {
			preorder(localroot.leftchild);
			preorder(localroot.rightchild);
			localroot.displayNode();
		}
	}
	
	
	
	public void Traversepostorder() {
		postorder(root);
	}
	
	
	
	private Node findRecursive(Node localroot,int emp) {
		if(localroot == null) {
			return null;
		}
		else if(localroot.empno==emp) {
			System.out.println(localroot.empno);
			return localroot;
		}
		else if(emp<localroot.empno) {
			return findRecursive(localroot.leftchild,emp);
		}
		else {
			return findRecursive(localroot.rightchild,emp);
		}
	}
	
	
	public void callrecursive(int emp) {
		findRecursive(root,emp);
	}
	
	
	public Node findemp(int emp) {
		Node current = root;
		while(current.empno != emp) {
			
			if(emp<current.empno) {
				current = current.leftchild;
			}
			else {
				current = current.rightchild;
			}
			if(current == null) {
				System.out.println("Not found");
				return null;
			}
			
		}
		System.out.println("Employee name : "+current.empname);
		return current;
	}
	
	
	public void deleteAll() { //root become null in delete all method
		root = null;
	}
	
}
