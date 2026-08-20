package Day10;

import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;
    
    TreeNode(int x) {
        val = x;
        left = null;
        right = null;
    }
}
public class Code2 {
	
	public static TreeNode buildTree(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(nums[0]);
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int i = 1;
        while (i < nums.length) {
            TreeNode curr = q.remove();
            if (i < nums.length) {
                curr.left = new TreeNode(nums[i++]);
                q.add(curr.left);
            }
            if (i < nums.length) {
                curr.right = new TreeNode(nums[i++]);
                q.add(curr.right);
            }
        }
        return root;
    }	
	 public static void printTree(TreeNode root) {
	        if (root == null) {
	            return;
	        }
	        printTree(root.left);
	        System.out.print(root.val + " ");
	        printTree(root.right);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		
//		int n = sc.nextInt();
//		int[] arr = new int[n];
		int[] arr = {2, 7, 3, 5, 3, -1, 2, -1, 7, 2 , 2, -1, -1, -1, 3, -1, -1, -1, -1, -1, -1};
		
		
		TreeNode root = buildTree(arr);
        printTree(root);
	}

}
