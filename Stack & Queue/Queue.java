import java.lang.String;
public class Queue
{ 
    static int front, rear, capacity; 
    static int q[]; 
    Queue(int capacity) 
    { 
        front=rear=-1; 
        this.capacity=capacity; 
        q= new int[capacity]; 
    } 
    static boolean isEmpty(){
        return(front==-1);
    }
    static boolean isFull(){
        return(rear==capacity-1);
    }
    static void EnQueue(int data) { 
        if (isFull()) { 
            System.out.println("Queue is full"); 
        }
        else {   
            rear++;
            q[rear]=data;
            if(front==-1)
            {
                front=rear;
            }
            System.out.println("EnQueue: "+data);
        } 
    }
    static void DeQueue()
    { 
        if(isEmpty()){ 
            System.out.println("Queue is Empty"); 
        } 
        else{ 
            int Data;
            if (rear<capacity){ 
                Data=q[front];
                q[front]=0;   
                System.out.println("DeQueue: "+Data);
            }    
            for (int i=0;i<rear;i++) 
            {
                q[i] = q[i+1]; 
            } 
            rear--;         
        } 
    } 
    static void Display()         
    {
        int i; 
        if (front == rear) 
        { 
            System.out.println("Queue is Empty"); 
            return; 
        } 
        System.out.println("\nQueue: ");
        for (i=0;i<=rear;i++)
        { 
          System.out.print("  "+q[i]); 
        } 
        return; 
    }   
    static void Front() 
    { 
        if (front == rear) 
        { 
            System.out.println("Queue is Empty"); 
            return; 
        } 
        System.out.print("\nFront Element is: "+q[front]); 
        return; 
    }
    public static void main(String[] args) 
    { 
        Queue Q = new Queue(6);  
        Q.EnQueue(1);
        Q.EnQueue(2);
        Q.EnQueue(3);
        Q.EnQueue(4);
        Q.EnQueue(5);
        Q.EnQueue(6);
        Q.EnQueue(7);
        Q.DeQueue();
        Q.EnQueue(9);
        Q.DeQueue();
        Q.Display();
    }  
} 