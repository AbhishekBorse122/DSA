public class Array_2D 
{
    public static void main(String[] args)
    {
     int a[][]={{1,4,},{1,3,4},{1,4,9}};
     System.out.print(a.length+" "+a[0].length);
     for(int i=0;i<a.length;i++){
         System.out.print("\n");
         for (int m: a[i]) {
             System.out.print(m+" ");
         }
     }
     System.out.print("\n3D Array");
     int b[][][]={{{1,3,4},{5,4,9}},{{6,1,0},{2,2,8}},{{0,8,7},{5,9,3}}};
     for(int i=0;i<b.length;i++){
         System.out.print("\n");
         for(int j=0;j<b[i].length;j++){
         System.out.print("\n");
           for(int k=0;k<b[i][j].length;k++){
               System.out.print(b[i][j][k]+" ");
           }
         }    
        }
    }
}
