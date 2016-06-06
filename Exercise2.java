package exercises;

import structure.Queue;

public class Exercise2{
  
  public static void main(String[] args){
    
    int amount;
    
    try{
      amount = Integer.parseInt(args[0]);
    }catch(Exception e){
      amount = 1;
    }

    Queue q = new Queue();

    q.enqueue(amount);
    
    q.dequeue();
    
  }
}

