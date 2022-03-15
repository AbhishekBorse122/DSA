//Kruskal's Algorithm is Greedy Algo.This algo is used to convert the graph into MST.
//The basic Logic Behind this algo is 1)Make a Set[] of edges with increasing order of its weight.2) Make a Set1[] of each seprate Vertex
//3)find minimum wei edge add to Set2[] and then if the vertex of this edge are in different set then make Union of the both vertex if they are 
//in same set then exit the process again find minimum wei edge again repeat the same process till the all vertex are not in Same Set1[].
//Exit the all process when all vertex are came in same set1[].
//Then we got the Set2[] contain the edges for MST.
//Time Complexity of this algo is O(E log V) E-Edges,V-Vertex
import java.util.*;
import java.io.*;
public class Kruskals_Algo
{
    class Edge implements Comparable<Edge>
    {
     int src,dest,weight;
     public int compareTo(Edge compare)
     {
         return this.weight-compare.weight;
     }
    };
    class Subset
    {
       int parent,rank;
    };
    private int V,E;
    private Edge edge[];
    Kruskals_Algo(int v,int e)
    {
        V=v;
        E=e;
        edge=new Edge[E];
        for(int i=0;i<e;i++)
        {
            edge[i]=new Edge();
        }
    }
    public int find(Subset subsets[],int i)
    {
      if(subsets[i].parent!=i)
      {
          subsets[i].parent=find(subsets,subsets[i].parent);
      }
     return subsets[i].parent;
    }
    void Union(Subset subsets[],int x,int y)
    {
        int xroot=find(subsets,x);
        int yroot=find(subsets,y);
        if(subsets[xroot].rank < subsets[yroot].rank)
        {
          subsets[xroot].parent=yroot;
        }
        else if(subsets[xroot].rank > subsets[yroot].rank)
        {
          subsets[yroot].parent=xroot;
        }
        else
        {
         subsets[yroot].parent=xroot;
         subsets[xroot].rank++;
        }
    }
    void Kruskals_MST()
    {
        Edge result[]=new Edge[V];
        int e=0;
        int i=0;
        for(i=0;i<V;++i)
        {
            result[i]=new Edge();
        }
        Arrays.sort(edge);
        Subset subsets[]=new Subset[V];
        for(i=0;i<V;i++)
        {
            subsets[i]=new Subset();
        }
        for(int v=0;v<V;++v)
        {
            subsets[v].parent=v;
            subsets[v].rank=0;
        }
        i=0;
        while(e<V-1)
        {
            Edge next=new Edge();
            next=edge[i++];
            int x=find(subsets,next.src);
            int y=find(subsets,next.dest);
            if (x!=y)
            {
              result[e++]=next;
              Union(subsets,x,y);
            }
        }
      System.out.println("Following the edges Constructed in MST");
      int minimumCost=0;
      for( i=0;i<e;++i)
        {
            System.out.println(result[i].src + " -- "+ result[i].dest+ " == " + result[i].weight);
            minimumCost += result[i].weight;
        }
        System.out.println("Minimum Cost Spanning Tree " + minimumCost);
    }
    // Driver Code
    public static void main(String[] args)
    {
        /* Let us create following weighted graph
                10
            0-------1
            | \     |
           6|  5\   |15
            |     \ |
            2-------3
                4       */
        int V = 4; // Number of vertices in graph
        int E = 5; // Number of edges in graph
        Kruskals_Algo graph = new Kruskals_Algo(V, E);
        // add edge 0-1
        graph.edge[0].src = 0;
        graph.edge[0].dest = 1;
        graph.edge[0].weight = 10;
        // add edge 0-2
        graph.edge[1].src = 0;
        graph.edge[1].dest = 2;
        graph.edge[1].weight = 6;
        // add edge 0-3
        graph.edge[2].src = 0;
        graph.edge[2].dest = 3;
        graph.edge[2].weight = 5;
        // add edge 1-3
        graph.edge[3].src = 1;
        graph.edge[3].dest = 3;
        graph.edge[3].weight = 15;
        // add edge 2-3
        graph.edge[4].src = 2;
        graph.edge[4].dest = 3;
        graph.edge[4].weight = 4;
        graph.Kruskals_MST();
    }
}