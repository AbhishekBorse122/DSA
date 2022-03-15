// Program to find the LCA of the Two Nodes in the BST.
public class LCA
{ 
    static class Node
    {
	  int data;
	  Node left, right;
	  Node(int item)
	  {
		data = item;
		left = right = null;
      }
    }
	static Node Root;
    public static Node lca(Node N, int n1, int n2)
	{
		if (N == null)
			return null;
		// If both n1 and n2 are smaller than Root, then LCA lies in left
		if (N.data > n1 && N.data > n2)
			return lca(N.left, n1, n2);
		// If both n1 and n2 are greater than Root, then LCA lies in right
		if (N.data < n1 && N.data < n2)
			return lca(N.right, n1, n2);
		return N;
	}
	public static void main(String args[])
	{
		Root = new Node(20);
		Root.left = new Node(8);
		Root.right = new Node(22);
		Root.left.left = new Node(4);
		Root.left.right = new Node(12);
		Root.left.right.left = new Node(10);
		Root.left.right.right = new Node(14);
		int n1 = 10, n2 = 14;
		Node t = lca(Root, n1, n2);
		System.out.println("LCA of " + n1 + " and " + n2 + " is " + t.data);
		n1 = 14;
		n2 = 8;
		t = lca(Root, n1, n2);
		System.out.println("LCA of " + n1 + " and " + n2 + " is " + t.data);
	}
}
//        20 
//     8     22
//  4   12 
//    10  14