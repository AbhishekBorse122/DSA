import java.util.LinkedList; 
import java.lang.String;
import java.util.*;
import java.util.Queue; 
public class QueueSort 
{ 
    public static int minIndex(Queue<Integer> list,int sortIndex) 
    { 
     int min_index = -1; 
     int min_value = Integer.MAX_VALUE; 
     int s = list.size(); 
     for (int i = 0; i < s; i++) 
     { 
        int current = list.peek();           
        list.poll(); 
        if (current <= min_value && i <= sortIndex) 
        { 
            min_index = i; 
            min_value = current; 
        } 
        list.add(current);  
     } 
     return min_index; 
    } 
    public static void insertMinToRear(Queue<Integer> list,int min_index)                                            
     { 
        int min_value = 0;  
        int s = list.size(); 
        for (int i = 0; i < s; i++) 
        { 
        int current = list.peek(); 
        list.poll(); 
        if (i != min_index) 
            list.add(current); 
        else
            min_value = current; 
        } 
        list.add(min_value); 
    } 
    public static void sortQueue(Queue<Integer> list) 
    { 
        for(int i=1;i<=list.size();i++) 
        { 
            int min_index = minIndex(list,list.size() - i); 
            insertMinToRear(list, min_index); 
        } 
    }  
    public static void main (String[] args)  
    { 
        Queue<Integer> Q = new LinkedList<>(Arrays.asList(23,34,14,67,12,99,54,78)); 
        sortQueue(Q);  
        while(Q.isEmpty()== false) 
        { 
            System.out.print(Q.peek() + "  "); 
            Q.poll(); 
        } 
    } 
} 