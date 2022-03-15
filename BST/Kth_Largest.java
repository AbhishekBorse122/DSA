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
public class Kth_Largest 
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
	static Node kthLargestUtil(Node N, int k)
	{
		if (N == null)
			return null;		
		Node R=kthLargestUtil(N.right, k);		
		count++;
		if (count == k) {
		System.out.println(k + "th largest element is " +N.data);
		return N;
		}
		return kthLargestUtil(N.left, k);
	}
	public static void kthLargest(Node root,int k)
	{
		Node res=kthLargestUtil(root, k);
		if (res == null)
			System.out.println("There are less than k nodes in the BST");
		else
			System.out.println("K-th Smallest Element is " + res.data);
	}
	public static void main (String[] args) 
	{
		int keys[] = { 20, 8, 22, 4, 12, 10, 14,47 };
		for (int x : keys)
			root = insert(root, x);
		int k = 6;
		kthLargest(root, k);
	}
}
