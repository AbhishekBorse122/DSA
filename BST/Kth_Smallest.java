class Node 
{
	int data;
	Node left, right;
	Node(int x)
	{
		data = x;
		left = right = null;
	}
}
public class Kth_Smallest 
{	
	static int count = 0;
	static Node root;
	public static Node insert(Node root, int x)
	{
		if (root == null)
			return new Node(x);
		if (x < root.data)
			root.left = insert(root.left, x);
		else if (x > root.data)
			root.right = insert(root.right, x);
		return root;
	}	
	public static Node kthSmallest(Node N, int k)
	{
		if (N == null)
			return null;	
		Node L = kthSmallest(N.left, k);
		if (L != null)
			return L;
		count++;
		if (count == k)
			return N;
		return kthSmallest(N.right, k);
	}
	public static void printKthSmallest(Node root, int k)
	{
		Node res = kthSmallest(root, k);
		if (res == null)
			System.out.println("There are less than k nodes in the BST");
		else
			System.out.println("K-th Smallest Element is " + res.data);
	}
	public static void main (String[] args) 
	{
		int keys[] = { 20, 8, 22, 4, 12, 10, 14 };
		for (int x : keys)
			root = insert(root, x);
		int k = 3;
		printKthSmallest(root, k);
	}
}
