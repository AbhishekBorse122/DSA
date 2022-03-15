//Program to implement the DeQue.
//It is Simple Implementation of DeQue by Circular Array. 
public class DeQue
{
    int front,rear;
    int size;
    int A[];
    public DeQue(int size)
    {
      A=new int[size];
      front=-1;
      rear=0;
      this.size=size;
    }
    boolean isFull()
    {
       return ((front==0 && rear==size-1) || front==rear+1);
    }
    boolean isEmpty()
    {
      return (front==-1);
    }
    void insertFront(int data)
    {
      if(isFull())
      {
          System.out.println("\nDeQue is Full");
          return;
      }
      if(front==-1)
      {
          front=0;
          rear=0;
      }
      else if(front==0)
      {
       front=size-1;
      }
      else
      {
          front=front-1;
      }
      A[front]=data;
    }
    void insertRear(int data)
    {
      if(isFull())
      {
          System.out.print("\nDeQue is Full");
          return;
      }
      if(front==-1)
      {
          front=0;
          rear=0;
      }
      else if(rear==size-1)
      {
       rear=0;
      }
      else
      {
          rear=rear+1;
      }
      A[rear]=data;
    }
    void deleteFront()
    {
      if(isEmpty())
      {
          System.out.print("\nDeQue is Empty");
          return;
      }
      if(front==rear)
      {
          front=-1;
          rear=-1;
      }
      else if(front==size-1)
      {
       front=0;
      }
      else
      {
          front=front+1;
      }
      displayDeQue();
    }  
    void deleteRear()
    {
      if(isEmpty())
      {
          System.out.print("\nDeQue is Empty");
          return;
      }
      if(front==rear)
      {
          front=-1;
          rear=-1;
      }
      else
      {
          rear=rear-1;
      }
      displayDeQue();
    }
    void displayDeQue()
    {
        if(isEmpty())
        {
            System.out.println("\nDeQue is Empty");
            return;
        }
        System.out.print("\nDeQue: ");
        for(int i=front;i<=rear;i++)
        {
            System.out.print(" "+A[i]);
        }
    }
    public static void main(String args [])
    {
     DeQue Q=new DeQue(5);
     Q.insertRear(34);
     Q.insertRear(12);
     Q.insertRear(87);
     Q.insertRear(91);
     Q.displayDeQue();
     Q.deleteFront();
     Q.deleteRear();
     Q.insertFront(23);
     Q.displayDeQue();
    }
}