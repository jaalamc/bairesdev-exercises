import java.util.Stack;

public class Excercise1 {
  
  private static Stack<Integer> stack = new Stack<Integer>();
  
  public static void main(String[] args) {
  
    try{
      int n = Integer.parseInt(args[0]);
  
      System.out.println("Factorial: " + Integer.toString(factorial(n)));
    
    } catch (Exception e) {
        System.err.println("First Argument must be an integer!");
        System.exit(1);
    }
  }
  
  public static int factorial(int n){
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