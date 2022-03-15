// Java program to find if there is a duplicate
// sub-tree of size 2 or more.
import java.util.HashSet;
public class Duplicate_SubTree 
{
	static Node Root;
    static class Node 
	{
	 int data;
	 Node left,right;
	 Node(int data)
	 {
 		this.data=data;
     }
    };
	// This function returns empty string if tree
	// contains a duplicate subtree of size 2 or more.
	public static String dupSubUtil(Node Root, HashSet<String> S)
	{
		String s = "";
		// If current node is NULL, return '$'
		if (Root == null)
			return s + '$';
		// If left subtree has a duplicate subtree.
		String lStr = dupSubUtil(Root.left,S);
		if (lStr.equals(s))
			return s;
		// Do same for right subtree
		String rStr = dupSubUtil(Root.right,S);
		if (rStr.equals(s))
	     	return s;
		// Serialize current subtree
		s = s + Root.data + lStr + rStr;
	    // If current subtree already exists in hash table.[Note that size of a serialized tree with single node is 3 as it has two marker nodes.
		if (s.length() > 3 && S.contains(s))
			return "";
		S.add(s);
		return s;
	}
	//Function to find if the Binary Tree contains duplicate S of size 2 or more
	public static String dupSub(Node Root)
	{
	  HashSet<String> S=new HashSet<>();
	  return dupSubUtil(Root,S);
	}
    public static void main(String args[])
	{
		Root = new Node(1);
		Root.left = new Node(2);
		Root.right = new Node(3);
		Root.left.left = new Node(4);
		Root.left.right = new Node(5);
		Root.right.right = new Node(2);
		Root.right.right.right = new Node(5);
		Root.right.right.left= new Node(4);
		String str = dupSub(Root);
		if(str.equals(""))
			System.out.print(" Yes ");
		else
			System.out.print(" No ");
	}
}
