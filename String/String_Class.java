public class String_Class
{  
    public static void main(String[] args)
    {
      String S1="AbHisheK";
      System.out.println(S1.length());
      char c[]=S1.toCharArray();  
      String S2=new String(c);
      System.out.println(S1.toLowerCase());
      System.out.println(S1.toUpperCase());
      System.out.println(S1.charAt(5));
      System.out.println(S1.substring(1,5));
      System.out.println(S1.contains("is"));// boolean
      String S3=String.join("--","Hii","I","Abhi");
      System.out.println(S3);     
      String S4="Borse";
      System.out.println(S1.equals(S4));// 
      System.out.println(S1.isEmpty());
      System.out.println(S1.concat("Borse"));
      System.out.println(S1.replace('h','H'));
      System.out.println(S1.replace("eK","Ek"));      
      System.out.println(S1.compareTo(S4));
      System.out.println(S4.compareTo(S2));
      System.out.println("abhi".compareTo("abhi"));
      System.out.println("ABHI".compareTo("abhi"));
      S3="Hiii I Am Abhishek";
      System.out.println(S3);
      String a[]=S3.split("\\s"); // "\\s" is for whitespace character 
      for(String i:a){
        System.out.println(i);
      }
      S3="Apple,Banana?Jackfruit+]";
      a=S3.split("[,+?]");
      for(String i:a){
        System.out.println(i);
      }
      S3="Apple and Banana and JackFruit and Grapes";
      a=S3.split("and");
      for(String i:a){
        System.out.println(i);
      }
      System.out.println(S3.indexOf('A'));
      System.out.println(S3.indexOf("Abhi")); 
      S3="  I Am Abhishek ";
      System.out.println(S3);
      System.out.println(S3.trim());//the space before & after of the string is remove by this function
      S3=String.valueOf(45);
      System.out.println(S3);
    }
}