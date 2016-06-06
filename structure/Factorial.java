package structure;

import java.util.Stack;

public class Factorial{

  public Factorial(){
  }

  public int getFactorial(int n){
    Stack<Integer> stack = new Stack<Integer>();  

    int result = 1;
    
    for(int i = n; i >= 1 ; i--){
      stack.push(i); 
    }
    
    while(!stack.empty()){
      result = result * stack.pop();
    }
    
    return result;
  }

}