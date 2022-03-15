// Conversion of Binary Tree to a DLL in which DLL should be in the Inorder Traversal of Binary Tree
// Left & Right will be prev & next of Node in Binary Tree & DLL respectively. 
// T-O(N)
//        10
//    12     15      // Inorder - 25 12 30 10 36 15  it should be DLL 
// 25   30 36        // DLL     - 25 <=> 12 <=> 30 <=> 10 <=> 36 <=> 15
// 
public class BinaryTree_2_DLL
{
    static class Node
    {
	 int data;
	 Node left, right;
	 public Node(int data)
	 {
		this.data = data;
		left = right = null;
	 }
    }
	static Node Root,head;
	static Node prev = null;
	static void BinaryTree2DoubleLinkedList(Node Root)
	{
		if (Root == null)
			return;
		BinaryTree2DoubleLinkedList(Root.left);
		if (prev == null)
			head = Root;
		else
		{
			Root.left = prev;
			prev.right = Root;
		}
		prev = Root;
		BinaryTree2DoubleLinkedList(Root.right);
	}
    static Node bToDLL(Node Root)
    {
       BinaryTree2DoubleLinkedList(Root);
       return head;
    }
	static void printList(Node node)
	{
		while (node != null)
		{
			System.out.print(node.data + " ");
			node = node.right;
		}
	}
	public static void main(String[] args)
	{
		Root = new Node(10);
		Root.left = new Node(12);
		Root.right = new Node(15);
		Root.left.left = new Node(25);
		Root.left.right = new Node(30);
		Root.right.left = new Node(36);
		Node M=bToDLL(Root);
		printList(M);
	}
}

