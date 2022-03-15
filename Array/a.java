class Solution {
    public List<Integer> findAnagrams(String s, String p) {
     Map<Character,Integer> M=new HashMap<>();
     for(int i = 0;i< p.length();i++) {
        if(M.containsKey(p.charAt(i))) {
            M.put(p.charAt(i),M.get(p.charAt(i))+1);
        } else {
            M.put(p.charAt(i),1);
        }
     } 
     List<Integer> A=new ArrayList<>();
     int start=0,end=0;
     while(end<s.length()){
        if(M.get(s.charAt(end))>0){
            M.put(s.charAt(end),M.get(s.charAt(end))-1);
            end++;
            if(end-start>0){
                A.add(start);
            }    
        }else if(start==end){
            start++;
            end++;
        } else{
          M.put(s.charAt(start),M.get(s.charAt(start))+1);
            start++;
        }
     }   
     return A;    
  }
}