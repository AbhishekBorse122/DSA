import java.util.Stack;
public class Count_Pairs 
{
	static class Node 
	{
		int data;
		Node left, right;
		public Node(int data) {
			this.data = data;
			left = null;
			right = null;
		}
	}	
	static Node Root1;
	static Node Root2;
	static int countPairs(Node Root1, Node Root2,int x)
	{
		if (Root1 == null || Root2 == null)
			return 0;	
		// stack 'S1' used for the inorder
		// traversal of BST 1
		// stack 'S2' used for the reverse
		// inorder traversal of BST 2
		//stack<Node*> S1, S2;
		Stack<Node> S1 = new Stack<>();
		Stack<Node> S2 = new Stack<>();
		Node T1, T2;
		int count = 0;
		// the loop will break when either of two
		// traversals gets completed
		while (true) 
        {
            // BST1 - Inorder Traversal
			while (Root1 != null) 
            {
				S1.push(Root1);
				Root1 = Root1.left;
			}
            // BST2 - Reverse Inorder Traversal
			while (Root2 != null) 
            {
				S2.push(Root2);
				Root2 = Root2.right;
			}
			// if either gets empty then corresponding tree traversal is completed
			if (S1.empty() || S2.empty())
				break;
			T1 = S1.peek();
			T2 = S2.peek();
			if ((T1.data + T2.data) == x)
            {
				count++;
				S1.pop();
				S2.pop();
				// insert next possible node in the
				// respective stacks
				Root1 = T1.right;
				Root2 = T2.left;
			}
			// move to next possible node in the inorder traversal of BST 1
			else if ((T1.data + T2.data) < x) {
				S1.pop();
				Root1 = T1.right;
			}
			// move to next possible node in the reverse inorder traversal of BST 2
			else {
				S2.pop();
				Root2 = T2.left;
			}
		}
		return count;
	}
	
	public static void main(String args[])
	{
		// formation of BST 1
		Root1 = new Node(5);	 /*			 5	 */
		Root1.left = new Node(3); /*		 / \	 */
		Root1.right = new Node(7); /*		 3	 7	 */
		Root1.left.left = new Node(2); /* / \ / \ */
		Root1.left.right = new Node(4); /* 2 4 6 8 */
		Root1.right.left = new Node(6);
		Root1.right.right = new Node(8);
	
		// formation of BST 2
		Root2 = new Node(10);	 /*		 10		 */
		Root2.left = new Node(6); /*		 / \	 */
		Root2.right = new Node(15); /*	 6	 15	 */
		Root2.left.left = new Node(3); /* / \ / \	 */
		Root2.left.right = new Node(8); /* 3 8 11 18 */
		Root2.right.left = new Node(11);
		Root2.right.right = new Node(18);
	
		int x = 16;
		System.out.println("Pairs = "+ countPairs(Root1, Root2, x));
	}
}
