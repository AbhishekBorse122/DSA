public class Rotate_DLL 
{
  static Node head = null;
  static class Node
  {
 	int data;
	Node prev,next;
  }
 static void frontInsert(int new_data)
 {
	Node new_node = new Node();
	new_node.data = new_data;
	new_node.prev = null;
	new_node.next = (head);
	if ((head) != null)
		(head).prev = new_node;
    head = new_node;
 }
 static void rotate(int N)// just move the head pointing position from N node & link previous node with last node
 {
	if (N == 0) return;
	Node current = head;
	int count = 1;
	while (count<N && current != null)//move to n node to change the position of head.
	{
		current = current.next;
		count++;
	}
	// System.out.println("\n"+current.data+" ");
	if (current == null) return;
	Node NthNode = current;// we have to point the head to Nth.next & link previous nodes to last node  
	while (current.next != null)
		current = current.next;
	current.next = head;// head points to the first node here is 1 
	head= NthNode.next; // NthNode is 2 next of 2 contains the node having value 3 
	head.prev = null;
	NthNode.next = null;
 }
 static void printList(Node node)
 {
	System.out.print("\nLinkedList: ");
	while (node != null && node.next != null)
	{
		System.out.print(node.data + " ");
		node = node.next;
	}
	if(node != null)
	System.out.print(node.data);
 }
 public static void main(String[] args)
 {
	frontInsert(8);
	frontInsert(7);
	frontInsert(6);
	frontInsert(5);
	frontInsert(3);
	frontInsert(2);
	frontInsert(1);
	printList(head);
	rotate(2);
	printList(head);
 }
}
