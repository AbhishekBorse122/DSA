//this is Breadth First search algorithm,here we use the undirected graph.
import java.util.LinkedList;
import java.util.*;
public class Graph_List
{
	private int V; 
	private LinkedList<Integer> adj[]; 
    Graph_List(int v)
	{
		V = v;
		adj = new LinkedList[v];
		for (int i=0; i<v; ++i)
			adj[i] = new LinkedList<Integer>();
	}
	void addEdge(int u,int v)
	{
		adj[u].add(v);
        adj[v].add(u);
	}
	public void printList()
    {
        for(int i=0;i<V;i++)
        {
            System.out.print("\nList of Vertex "+i+" : "+i);
            for(int j=0;j<adj[i].size();j++)
            {
              System.out.print("->"+adj[i].get(j));
            }
        }
    }
	public static void main(String args[])
	{
		Graph_List g = new Graph_List(5);
		g.addEdge(0, 1);
        g.addEdge(0, 3);
		g.addEdge(0, 4);
		g.addEdge(1, 2);
		g.addEdge(1, 3);
		g.addEdge(2, 3);
		g.addEdge(3, 4);        
        g.printList();      
	}
}
