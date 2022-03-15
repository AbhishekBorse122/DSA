// A Java Program to check whether a Is_graph is tree or not
import java.io.*;
import java.util.*;
public class Is_Graph
{
	private int V; 
	private LinkedList<Integer> adj[]; //Adjacency List
	// Constructor
	@SuppressWarnings("unchecked")
	Is_Graph(int v)
	{
		V = v;
		adj = new LinkedList[V];
		for (int i=0; i<v; ++i)
			adj[i] = new LinkedList<Integer>();
	}
	// Function to add an edge into the Is_graph
	void addEdge(int v,int w)
	{
		adj[v].add(w);
		adj[w].add(v);
	}
	// to detect cycle in Is_graph reachable from vertex v.
	boolean isCyclicUtil(int v, boolean visited[], int parent)
	{
		visited[v] = true;
		Integer i;
		// Recur for all the vertices adjacent to this vertex
		Iterator<Integer> it = adj[v].iterator();
		while (it.hasNext())
		{
			i = it.next();
			// If an adjacent is not visited, then recur for
			// that adjacent
			if (!visited[i])
			{
				if (isCyclicUtil(i, visited, v))
					return true;
			}
			// If an adjacent is visited and not parent of
			// current vertex, then there is a cycle.
			else if (i != parent)
			return true;
		}
		return false;
	}
    // Returns true if the Is_graph is a tree, else false.
	boolean isTree()
	{
		// Mark all the vertices as not visited and not part
		// of recursion stack
		boolean visited[] = new boolean[V];
		for (int i = 0; i < V; i++)
			visited[i] = false;
		// The call to isCyclicUtil serves multiple purposes
		// It returns true if Is_graph reachable from vertex 0
		// is cyclcic. It also marks all vertices reachable from 0.
		if (isCyclicUtil(0, visited, -1))
			return false;
		// If we find a vertex which is not reachable from 0
		// (not marked by isCyclicUtil(), then we return false
		for (int u = 0; u < V; u++)
			if (!visited[u])
				return false;
		return true;
	}
	// Driver method
	public static void main(String args[])
	{
		Is_Graph g1 = new Is_Graph(5);
		g1.addEdge(1, 0);
		g1.addEdge(0, 2);
		g1.addEdge(0, 3);
		g1.addEdge(3, 4);
		if (g1.isTree())
			System.out.println("Is_Graph is Tree");
		else
			System.out.println("Is_Graph is not Tree");

		Is_Graph g2 = new Is_Graph(5);
		g2.addEdge(1, 0);
		g2.addEdge(0, 2);
		g2.addEdge(2, 1);
		g2.addEdge(0, 3);
		g2.addEdge(3, 4);
		if (g2.isTree())
			System.out.println("Graph is Tree");
		else
			System.out.println("Graph is not Tree");
	}
}
// This code is contributed by Aakash Hasija
