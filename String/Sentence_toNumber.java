//Program to convert the sentence into a equivalent numeric keypad sequence.
//T-O(n) 
public class Sentence_toNumber
{
    static void cnvtoNum(String S,String P[])
    {
      int n=S.length();
      String O="";
      for(int i=0;i<n;i++)
      {
       if(S.charAt(i)==' ') 
        {
          O+='0';
        }
       else
        {
         int pos=S.charAt(i)-'A';//Generate the array index to find the alphabet value.
         O=O+P[pos];//It is done by Subtracting every alphabet from 'A' which return the differnce of their ASCII value i.e array Index. 
        }              
      }
      System.out.println("Sentence to Number: "+O);
    }
    public static void main(String args [])
    {
      String P[]={"2","22","222",  //We are assign a keypad button to every Alphabet and generate the the array index of same alphabet
                  "3","33","333", //and convert the whole Sentence into the Number.
                  "4","44","444",
                  "5","55","555",
                  "6","66","666",
                  "7","77","777","7777",
                  "8","88","888",
                  "9","99","999","9999"};
      String S="ABHISHEK BORSE";
      cnvtoNum(S,P);
    }
}