public class Find_Value
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
    public static void insert(int Data)
    {
      Root=insertUtil(Root,Data);
    }
    public static Node insertUtil(Node N,int Data)
    {
      if(N==null)
      {
          return new Node(Data);
      }
      if(Data<N.data)
      {
          N.left=insertUtil(N.left,Data);
      }
      else if(Data>N.data)
      {
          N.right=insertUtil(N.right,Data);
      }
      return N;
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
   public static Node search2(Node Root,int value)
   {
     if (Root==null || Root.data==value)
        return Root;
     if (Root.data < value)
        return search2(Root.right, value);
     return search2(Root.left, value);
    }
    public static boolean Search(int value)
    {
      Node N=Root;
      if(N==null)
      {
        return false;
      }
      while(N.data!=value)
      {
        if(value<N.data) {
          N=N.left;
        }
        else{
          N=N.right;
        }
        if(N==null){
            System.out.println("\n"+value+" Node is Not Found");
            return false;
        }
      }
      System.out.println("\n"+value+" Node is Found");
      return true;
    }
    public static void main(String args[])
    {
        Find_Value F= new Find_Value();
        insert(10);
        insert(70);
        insert(40);
        insert(30);
        insert(90);
        insert(60);
        InOrder(Root);
        Search(30);
        Search(20);
        Node One=search2(Root,30);
        Node Second=search2(Root,20);
        System.out.println(" 1)  "+One.data+"  2)  "+Second);
    }
}