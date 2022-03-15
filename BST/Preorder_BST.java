// Java program to construct BST from given preorder traversal
class Node {
	int data;
	Node left, right;
	Node(int d)
	{
		data = d;
		left = right = null;
	}
}
class Index {
	int index = 0;
}
public class Preorder_BST {
	Index index = new Index();
	// A recursive function to construct BST from pre[].
	// preIndex is used to keep track of index in pre[].
	Node constructTreeUtil(int pre[],Index preIndex,int key,int min, int max,int size)
	{
		if (preIndex.index >= size) {
			return null;
		}
		Node Root = null;
		// If current element of pre[] is in range, then
		// only it is part of current subtree
		if (key > min && key < max) {
			// Allocate memory for Root of this
			// subtree and increment *preIndex
			Root = new Node(key);
			preIndex.index = preIndex.index + 1;
			if (preIndex.index < size) {
				// Construct the subtree under Root
				// All nodes which are in range {min .. key}
				// will go in left subtree, and first such
				// node will be Root of left subtree.
				Root.left = constructTreeUtil(
					pre, preIndex, pre[preIndex.index], min,
					key, size);
			}
			if (preIndex.index < size) {
				// All nodes which are in range {key..max}
				// will go in right subtree, and first such
				// node will be Root of right subtree.
				Root.right = constructTreeUtil(
					pre, preIndex, pre[preIndex.index], key,
					max, size);
			}
		}
		return Root;
	}
	Node constructTree(int pre[], int size)
	{
		int preIndex = 0;
		return constructTreeUtil(pre, index, pre[0],Integer.MIN_VALUE,Integer.MAX_VALUE, size);
	}
	void printInorder(Node node)
	{
		if (node == null) {
			return;
		}
		printInorder(node.left);
		System.out.print(node.data + " ");
		printInorder(node.right);
	}
	public static void main(String[] args)
	{
		Preorder_BST tree = new Preorder_BST();
		int pre[] = new int[] { 10, 5, 1, 7, 40, 50 };
		int size = pre.length;
		Node Root = tree.constructTree(pre, size);
		System.out.println(
			"Inorder traversal of the constructed tree is ");
		tree.printInorder(Root);
	}
}
