package Day10;



public class Code3 {

	static class Treenode{
		int data;
		Treenode left;
		Treenode right;
		
		public Treenode(int val) {
			this.data = val;
			this.left = null;
			this.right = null;
		}
		
		
	}
	
	Treenode insert(Treenode root, int key) {
		
		if(root == null) {
			return new Treenode(key);
		}
		
		if(key < root.data) {
			root.left = insert(root.left, key);
		}else if(key >  root.data) {
			root.right = insert(root.right, key);
		}
		
		return root;
	}
	
	 public static int findLessThan(Treenode root, int key) {
	        int ans = -1;

	        while (root != null) {
	            if (root.data < key) {
	                ans = root.data;
	                root = root.right;
	            } else {
	                root = root.left;
	            }
	        }

	        return ans;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Treenode root = new Treenode(8);
		
		root.left = new Treenode(4);
		root.right = new Treenode(12);
		root.left.left = new Treenode(2);
		root.left.right = new Treenode(6);
		root.right.left = new Treenode(10);
		root.right.right = new Treenode(14);
		
		int key = 11;

	    int result = findLessThan(root, key);

	    System.out.println("Largest value less than " + key + " is: " + result);
	}

}
