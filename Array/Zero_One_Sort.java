public class Zero_One_Sort
{
 static void printSort(int a[],int n)
 {
  int cnt0=0,cnt1=0,cnt2=0;   
  for(int i=0;i<a.length;i++){
      if(a[i]==0){ cnt0++; }
      else if(a[i]==1){ cnt1++;}
      else{ cnt2++; }
  }  
  int i=0;
  while(cnt0>0){
      a[i++]=0;
      cnt0--;
  }
  while(cnt1>0){
      a[i++]=1;
      cnt1--;
  }
  while(cnt2>0){
      a[i++]=2;
      cnt2--;
  }
 }
 static void printSort2(int a[],int size)
 {
    int l=0,m=0,h=size-1;
    int temp=0;
    while(m<=h)
    {
      switch (a[m])
      {
       case 0:temp=a[l];
           a[l++]=a[m];
           a[m++]=temp;
          break;
       case 1: m++;
           break;   
       case 2: temp=a[h];
           a[h--]=a[m];
           a[m]=temp;
           break;
      }
    }
 }
 public static void main(String args[])
 {
  int arr[]={0,2,0,1,1,1,2,0};   
  printSort(arr,arr.length);
  for(int i:arr){
      System.out.print(i+" ");
  }
  int arr2[]={2,0,2,1,0,1,1,1,1,2,0};   
  printSort(arr2,arr2.length);
  System.out.print("\n");
  for(int i:arr2){
      System.out.print(i+" ");
  }
 }
}
