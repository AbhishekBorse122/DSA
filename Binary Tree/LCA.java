//Java implementation to find lowest common ancestor of n1 and n2 using one traversal of binary tree
//        1 
//     2     3
//   4  5  6  7 
public class LCA
{
   static class Node
   {
	int data;
	Node left, right;
	public Node(int item)
	{
		data = item;
		left = right = null;
	}
   }
   static Node Root;
   static Node findLCA(int n1, int n2)
   {
		return findLCA(Root, n1, n2);
   }
	// This function returns pointer to LCA of two given
	// values n1 and n2. This function assumes that n1 and
	// n2 are present in Binary Tree
	static Node findLCA(Node N, int n1, int n2)
	{
		// Base case
		if (N == null)
			return null;
		// If either n1 or n2 matches with Root's key, report
		// the presence by returning Root (Note that if a key is
		// ancestor of other, then the ancestor key becomes LCA
		if (N.data == n1 || N.data == n2)
			return N;
		// Look for keys in left and right subtrees
		Node left_lca = findLCA(N.left, n1, n2);
		Node right_lca = findLCA(N.right, n1, n2);
		// If both of the above calls return Non-NULL, then one key
		// is present in once subtree and other is present in other,So this node is the LCA
		if (left_lca!=null && right_lca!=null)
			return N;
		// Otherwise check if left subtree or right subtree is LCA
		return (left_lca != null) ? left_lca : right_lca;
	}
	public static void main(String args[])
	{
		Root = new Node(1);
		Root.left = new Node(2);
		Root.right = new Node(3);
		Root.left.left = new Node(4);
		Root.left.right = new Node(5);
		Root.right.left = new Node(6);
		Root.right.right = new Node(7);
		System.out.println("LCA(4, 5) = " +findLCA(4, 5).data);
		System.out.println("LCA(3, 4) = " +findLCA(3, 4).data);
	}
}