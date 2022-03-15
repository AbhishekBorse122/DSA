//Programt to find the Lowest Common Ancestor(LCA) of Binary Tree         
//        1 
//     2     3
//   4  5  6  7 
public class Distance_Node
{
// Global static variable
static int d1 = -1;
static int d2 = -1;
static int dist = 0;
static Node Root;
static class Node
{
	Node left, right;
	int data;
	Node(int data)
	{
		this.data = data;
		left = null;
		right = null;
	}
}
// Returns level of data k if it is present in tree, otherwise returns -1
static int findLevel(Node Root,int k,int level)
{
	// Base Case
	if (Root == null) return -1;
	// If data is present at Root, or in left
	// subtree or right subtree, return true;
	if (Root.data == k)
	{
		return level;
	}
	int l = findLevel(Root.left, k, level + 1);
	return (l != -1)? l : findLevel(Root.right,k,level + 1);
}
// This function returns pointer to LCA of
// two given values n1 and n2. It also sets
// d1, d2 and dist if one data is not ancestor of other
// d1 -. To store distance of n1 from Root
// d2 -. To store distance of n2 from Root
// lvl -. Level (or distance from Root) of current node
// dist -. To store distance between n1 and n2
public static Node findDistUtil(Node Root, int n1,int n2, int lvl)
{
	// Base case
	if (Root == null)
	{
		return null;
	}
	// If either n1 or n2 matches with Root's
	// data, report the presence by returning
	// Root (Note that if a data is ancestor of
	// other, then the ancestor data becomes LCA
	if (Root.data == n1)
	{
		d1 = lvl;
		return Root;
	}
	if (Root.data == n2)
	{
		d2 = lvl;
		return Root;
	}
	// Look for n1 and n2 in left and right subtrees
	Node left_lca = findDistUtil(Root.left,n1,n2,lvl + 1);
	Node right_lca = findDistUtil(Root.right,n1,n2,lvl + 1);
	// If both of the above calls return Non-null,
	// then one data is present in once subtree and
	// other is present in other, So this node is the LCA
	if (left_lca != null && right_lca != null)
	{
		dist = (d1 + d2) - 2 * lvl;
		return Root;
	}
	// Otherwise check if left subtree
	// or right subtree is LCA
	return (left_lca != null)? left_lca : right_lca;
}
// The main function that returns distance
// between n1 and n2. This function returns -1
// if either n1 or n2 is not present in
// Binary Tree.
public static int findDistance(Node Root, int n1, int n2)
{
	d1 = -1;
	d2 = -1;
	dist = 0;
	Node lca = findDistUtil(Root, n1, n2, 1);
	if (d1 != -1 && d2 != -1)
	{
		return dist;
	}
	// If n1 is ancestor of n2, consider
	// n1 as Root and find level
	// of n2 in subtree Rooted with n1
	if (d1 != -1)
	{
		dist = findLevel(lca, n2, 0);
		return dist;
	}
	// If n2 is ancestor of n1, consider
	// n2 as Root and find level
	// of n1 in subtree Rooted with n2
	if (d2 != -1)
	{
		dist = findLevel(lca, n1, 0);
		return dist;
	}
	return -1;
}
 public static void main(String[] args)
 {
	Root = new Node(1);
	Root.left = new Node(2);
	Root.right = new Node(3);
	Root.left.left = new Node(4);
	Root.left.right = new Node(5);
	Root.right.left = new Node(6);
	Root.right.right = new Node(7);
	Root.right.left.right = new Node(8);
	System.out.println("Dist(4, 5) = " +findDistance(Root, 4, 5));
	System.out.println("Dist(3, 4) = " +findDistance(Root, 3, 4));
  }
}

