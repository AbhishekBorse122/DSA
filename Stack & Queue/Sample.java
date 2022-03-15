class FrontMiddleBackQueue {
    LinkedList<Integer> Q;
    public FrontMiddleBackQueue(){
     Q=new LinkedList<>();    
    }
    public void pushFront(int val){
      Q.addFirst(val);   
    }
    public void pushMiddle(int val){
      if(Q.isEmpty())  return;
      Stack<Integer> S=new Stack<>();   
      int i=0,n=(Q.size()%2==0?Q.size()/2-1:Q.size()/2);  
      while(i<=n){
        S.push(Q.removeLast());
        i++;
      }          
      Q.addLast(val);
      while(!S.isEmpty()){
        Q.add(S.pop());  
      }           
    }
    public void pushBack(int val) {  
      Q.addLast(val);   
    }
    public int popFront() {
      if(Q.isEmpty()) return -1;  
      return Q.removeFirst();  
    }
    public int popMiddle() {
      if(Q.isEmpty()) return -1;  
      else if(Q.size()%2==0){
        return Q.get(Q.size()/2-1);            
      }else{
        return Q.get(Q.size()/2);            
      }  
    }
    public int popBack() {
      if(Q.isEmpty()) return -1;  
      return Q.removeLast();    
    }
}

/**
 * Your FrontMiddleBackQueue object will be instantiated and called as such:
 * FrontMiddleBackQueue obj = new FrontMiddleBackQueue();
 * obj.pushFront(val);
 * obj.pushMiddle(val);
 * obj.pushBack(val);
 * int param_4 = obj.popFront();
 * int param_5 = obj.popMiddle();
 * int param_6 = obj.popBack();
 */