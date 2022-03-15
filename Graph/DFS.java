import java.io.*;
import java.util.*;
import java.util.LinkedList;
public class DFS 
{
    private int V; 
	private LinkedList<Integer> adj[];
	@SuppressWarnings("unchecked") DFS(int v)
	{
		V = v;
		adj = new LinkedList[v];
		for (int i = 0; i < v; ++i)
			adj[i] = new LinkedList();
	}
	void addEdge(int v, int w)
	{
		adj[v].add(w); 
	}
	void DFSUtil(int v, boolean visited[])
	{
		visited[v] = true;
		System.out.print(v + " ");
		Iterator<Integer> i = adj[v].listIterator();
		while (i.hasNext()) 
		{
			int n = i.next();
			if (visited[n]!=true)
				DFSUtil(n, visited);
		}
	}
	void DFSearch(int v)
	{
		boolean visited[] = new boolean[V];
		DFSUtil(v, visited);
	}
	public static void main(String args[])
	{
		DFS g = new DFS(5);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 3);
		g.addEdge(1, 4);
		System.out.println("Following is Depth First Traversal "+ "(starting from vertex 2)");
		g.DFSearch(0);
	}
}
