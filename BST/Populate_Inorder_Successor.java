// Java program to populate inorder traversal of all nodes a binary tree node.
// In this program we have one extra pointer along with the right & left ptr which will point its inorder successor in the BST.
public class Populate_Inorder_Successor
{
    static class Node
    {
	 int data;
	 Node left, right, next;
	 Node(int item)
	 { 
		data = item;
		left = right = next = null;
	 }
    }
    static Node Root;
	static Node next = null;
	public static void populateNext(Node node)// traversing with reverse order so we can maintain the inorder successor of every node
	{
		// The first visited node will be the rightmost node next of the rightmost node will be NULL
		if (node != null)
		{
			// First set the next pointer in right subtree
			populateNext(node.right);
			// Set the next as previously visited node in reverse Inorder
			node.next = next;
			// Change the prev for subsequent node
			next = node;
			// Finally, set the next pointer in left subtree
			populateNext(node.left);
		}
	}
	public static void main(String args[])
	{
		Root = new Node(10);
		Root.left = new Node(8);
		Root.right = new Node(12);
		Root.left.left = new Node(3);
		populateNext(Root);
		Node ptr = Root.left.left;
		while (ptr != null)
		{
			// -1 is printed if there is no successor
			int print = ptr.next != null ? ptr.next.data : -1;
			System.out.println("Next of " + ptr.data + " is: " + print);
			ptr = ptr.next;
		}
	}
}
