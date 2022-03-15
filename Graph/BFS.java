//this is Breadth First search algorithm,here we use the undirected graph.
import java.util.LinkedList;
import java.util.*;
public class BFS
{
	private int V; 
	private LinkedList<Integer> adj[]; 
	@SuppressWarnings("unchecked") BFS(int v)//SuppressWarnings is use for unchecked Exception.
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
	void BFSearch(int s)
	{
		boolean visited[] = new boolean[V];
		LinkedList<Integer> queue = new LinkedList<Integer>();
		visited[s]=true;
		queue.add(s);
		while (queue.size() != 0)
		{
			s = queue.poll();
			System.out.print(s+" ");
			Iterator<Integer> i = adj[s].listIterator();
			while (i.hasNext())
			{
				int n = i.next();
				if (visited[n]!=true)
				{
					visited[n] = true;
					queue.add(n);
				}
			}
		}
	}
	public static void main(String args[])
	{
		BFS g = new BFS(5);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 3);
		g.addEdge(1, 4);
		System.out.println("Following is Breadth First Traversal "+"(starting from vertex 2)");
		g.BFSearch(0);
	}
}
