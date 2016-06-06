import structure.Factorial;

public class Exercise1 {
  
  public static void main(String[] args) {
  
    int n = 0;
    
    try{

      n = Integer.parseInt(args[0]);

    } catch (Exception e) {
        System.err.println("First Argument must be an integer!");
        System.exit(1);
    }

    Factorial f = new Factorial();
  
    System.out.println("Factorial: " + Integer.toString(f.getFactorial(n)));

  }
  
}