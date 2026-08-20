package Day10;

public class Code1 {

	static class Treenode{
		int data; // data
		Treenode left; // Memory link to the left child node
		Treenode right; //  Memory link to the right child node
		
		//constructor
		public Treenode(int value) {
			this.data = value;
			this.left = null;
			this.right = null;
		}	
	}
	
	public static void preorder(Treenode node) {
		if(node == null) {
			return;
		}
		
		System.out.print(node.data + " ");
		
		//left
		preorder(node.left);
		
		//right
		preorder(node.right);
	}
	
	public static void postorder(Treenode node) {
		if(node == null) {
			return;
		}
		
		postorder(node.left);
		postorder(node.right);
		System.out.print(node.data + " ");
	}
	
	public static void inorder(Treenode node) {
		
		if(node == null) {
			return;
		}
		
		inorder(node.left);
		System.out.print(node.data + " ");
		inorder(node.right);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Treenode root = new Treenode(10);
		
		root.left = new Treenode(35);
		root.right = new Treenode(25);
		root.left.left = new Treenode(45);
		root.left.right = new Treenode(12);
		root.left.right.right = new Treenode(117);
		
		root.right.left = new Treenode(8);
		root.right.right = new Treenode(101);
		root.right.right.right = new Treenode(105);

		System.out.println("Tree preorder : ");
		preorder(root);
		
		System.out.println();
		System.out.println("Tree postorder : ");
		postorder(root);

		System.out.println();
		System.out.println("Tree inorder : ");
		inorder(root);

	}

}
