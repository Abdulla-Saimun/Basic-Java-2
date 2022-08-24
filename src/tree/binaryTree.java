package tree;

public class binaryTree {
	
	int data;
	binaryTree left;
	binaryTree right;
	public binaryTree(int data) {
		this.data = data;
		// TODO Auto-generated constructor stub
	}
	
	static int findSum(binaryTree root) {
		if(root == null) {
			return 0;
		} 
		return root.data + findSum(root.left) + findSum(root.right);
	}
	
	static public binaryTree search(binaryTree root, int key) {
		if(root == null || root.data == key) {
			return root;
		}
		
		if(root.data < key) {
			return search(root.right, key);
		}
		return search(root.left, key);
	}
	
	static void inOrderRec(binaryTree root) {
		if(root != null) {
			inOrderRec(root.left);
			System.out.print(root.data+" ");
			inOrderRec(root.right);
		}
	}
	
	public static void main(String[] args) {
		binaryTree root = new binaryTree(2);
		binaryTree one = new binaryTree(3);
		binaryTree two = new binaryTree(4);
		binaryTree three = new binaryTree(5);
		binaryTree four = new binaryTree(6);
		
		root.left = one;
		root.right = two;
		
		two.left = three;
		two.right = four;
		
		System.out.println(findSum(root));
		inOrderRec(root);
	}
	

}
