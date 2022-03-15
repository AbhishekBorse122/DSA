//Here we represent the Graph in the Adjcency Matrix & this graph is undirected graph.
public class Graph_Matrix
{
   private int Matrix[][];
   private int Vertex;
   Graph_Matrix(int Vertex)
   {
     this.Vertex=Vertex;
     Matrix=new int[Vertex][Vertex];
   }
   public void addEdge(int u,int v)
   {
       Matrix[u][v]=1;
       Matrix[v][u]=1;
   }
   public void removeEdge(int u,int v)
   {
       Matrix[u][v]=0;
       Matrix[v][u]=0;
   }
   public void printMatrix()
   {
       System.out.print("Matrix: ");
       for(int i=0;i<Matrix.length;i++)
       {
           System.out.print("\n"+i+"-->");
           for(int j=0;j<Matrix.length;j++)
           {
               System.out.print("  "+Matrix[i][j]);
           }
       }
   } 
   public static void main(String args [])
   {
      Graph_Matrix G=new Graph_Matrix(4);
      G.addEdge(0,1);
      G.addEdge(0,3);
      G.addEdge(1,2);
      G.addEdge(1,3);
      G.addEdge(0,2);
      G.addEdge(2,3);
      G.printMatrix();
   }
}