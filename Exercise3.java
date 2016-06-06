import structure.People;

public class Exerise3{
  
  public static void main(String[] args){
  
    People p = new People();

    try{
      
      String name = args[0];
      
      String message = p.findPerson(name);

      System.out.println(message);

    }catch(ArrayIndexOutOfBoundsException e){
      System.out.println("Invalid parameter.");
    }
    
  }
  
}

