//Cheack whether Given Graph is Binary Tree or Not
//T-O(n)
//This is Breadth First Search algorithm,here we use the undirected Graph.       
import java.util.*;
import java.util.LinkedList;
public class Graph_Is_Tree
{
	public int V; 
	public LinkedList<Integer> adj[]; 
    @SuppressWarnings("unchecked") Graph_Is_Tree(int v)//SuppressWarnings is use for unchecked Exception.
	{
		V = v;
		adj = new LinkedList[v];
		for (int i=0; i<v; ++i)
			adj[i] = new LinkedList<Integer>();
	}
	void addEdge(int u,int v)
	{
		adj[u].add(v);
	}
	boolean isCyclic(int s,boolean visited[],int parent)
	{
		visited[s]=true;
		Integer i;
		Iterator<Integer> It = adj[s].listIterator();
		while (It.hasNext())
	    {
			i = It.next();
			if (!visited[i]){
		     	if(isCyclic(i,visited,s)){
                    return true;
				}
   			}
            else if(i!=parent){
                return true;
            }
		}
        return false;
	}
	boolean isTree()
	{
	   //Make a visited array for visited nodes 
	   boolean visited[]=new boolean[V];
	   // Assign False value to visited array
       for(int i=0;i<V;i++){
		   visited[i]=false;
	   }
	   if(isCyclic(0,visited,-1))
	   {
		   return false;
	   }
       for(int i=0;i<V;i++)
	   {
         if(!visited[i])
		 {
           return false;
		 }
	   }
	   return true;
	}
	public static void main(String args[])
	{
		Graph_Is_Tree G = new Graph_Is_Tree(5);
		G.addEdge(0, 1);
		G.addEdge(0, 2);
		G.addEdge(1, 3);
		G.addEdge(1, 4);
		// G.addEdge(4,2);
		if(G.isTree()){
            System.out.println("Graph is Tree");
        }
        else{
            System.out.println("Graph is Not a Tree");        
        }     
	}
}
