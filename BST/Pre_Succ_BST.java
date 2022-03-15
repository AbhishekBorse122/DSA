// Program to Find the InOrder Successor & Predecessor .
public class Pre_Succ_BST
{
   public static class Node
   {
 	 int key;
	 Node left, right;
     public Node(int key)
	 {
		this.key = key;
		this.left = this.right = null;
	 }
   };
   public static Node pre = new Node(), suc = new Node();
   public static void findPreSuc(Node root, int key)
   {
	if (root == null)
		return;
	if (root.key == key)
	{
		if (root.left != null)// it is for predecessor 
		{
			Node tmp = root.left;
			while (tmp.right != null)
				tmp = tmp.right;		
			pre = tmp;
		}
		if (root.right != null)// it is for successor
		{
			Node tmp = root.right;
			while (tmp.left != null)
				tmp = tmp.left;
			suc = tmp;
		}
		return;
	}
    // it will continuosly update Successor & Predecessor if given value is not the part of BST
	if (root.key > key)  
	{
		suc = root;
		findPreSuc(root.left, key);
	}
	else
	{
		pre = root;
		findPreSuc(root.right, key);
	}
  } 
  public static Node insert(Node node, int key)
  {
	if (node == null)
		return new Node(key);
	if (key < node.key)
		node.left = insert(node.left, key);
	else
		node.right = insert(node.right, key);
		
	return node;
  }
  public static void main(String[] args)
  {	
	int key = 65;	
	Node root = new Node();
	root = insert(root, 50);
	insert(root, 30);
	insert(root, 20);
	insert(root, 40);
	insert(root, 70);
	insert(root, 60);
	insert(root, 80);
	findPreSuc(root, key);
    System.out.println("Key: "+key);
	if (pre != null)
		System.out.println("Predecessor is " + pre.key);
	else
		System.out.println("No Predecessor");

	if (suc != null)
		System.out.println("Successor is " + suc.key);
	else
		System.out.println("No Successor");
  }
}
//		   50
//		/      \
//	   30       70
//	  /  \    /   \
//	 20  40  60   80	
