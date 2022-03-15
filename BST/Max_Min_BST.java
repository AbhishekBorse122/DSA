public class Max_Min_BST
{
    static Node Root;
    static class Node
    {
        int data;
        Node left,right;
        Node(int data)
        {
            this.data=data;
            left=right=null;
        }
    }
    public static Node insert(Node node,int data)
    {
        if (node == null) 
        {
            return (new Node(data));
        }
        else{
          if (data <= node.data) {
            node.left = insert(node.left, data);
          }else{
            node.right = insert(node.right, data);
          }
         return node;
        }
    }
    public static void InOrder(Node N)
    {
       if(N!=null)
       {
           InOrder(N.left);
           System.out.print(" "+N.data);
           InOrder(N.right);
       }
    }   
    public static int Min(Node N)
    {
      while(N.left!=null)
      {
          N=N.left;
      }
      return N.data;
    }
    public static int Max(Node N)
    {
      while(N.right!=null)
      {
          N=N.right;
      }
      return N.data;
    }

    public static void main(String args[])
    {
        Max_Min_BST F= new Max_Min_BST();
        Root=insert(Root,10);
        insert(Root,70);
        insert(Root,40);
        insert(Root,30);
        insert(Root,90);
        insert(Root,60);
        InOrder(Root);
        System.out.print("\nMin: "+Min(Root));
        System.out.print("\nMax: "+Max(Root));
    }
}