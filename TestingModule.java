import structure.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestingModule{
	
  @Test
  public void testExercise1(){

    Factorial f = new Factorial();

    int result = f.getFactorial(4);

    assertEquals(24, result);
  
  }

  @Test
  public void testExercise2(){
  	
    Queue q = new Queue();

    int amount = 5;

    q.enqueue(amount);
    
    String name = q.getPersonName(3);

    assertEquals("Person3", name);

  }

  @Test
  public void testExercise3(){
  	People p = new People();

    String job = p.findPerson("Marion");

    assertEquals("Engineer", job);
  }

  @Test
  public void testExercise4(){

    int[] numbersA = {2,8,5,10};
    int[] numbersB = {2,2,3,4,4,20};
    int[] numbersC = {2};
    int[] numbersD = {3,4,20};

  	ArrayList<Integer> listA = new ArrayList<Integer>();
    ArrayList<Integer> listB = new ArrayList<Integer>();
    ArrayList<Integer> listC = new ArrayList<Integer>();
    ArrayList<Integer> listD = new ArrayList<Integer>();

    for (int i : numbersA) listA.add(i);
    for (int i : numbersB) listB.add(i);
    for (int i : numbersC) listC.add(i);
    for (int i : numbersD) listD.add(i);

    Classifier c = new Classifier();
          
    c.classify(listA, listB);

    assertEquals(listC, c.getListC());
    assertEquals(listD, c.getListD());
  }

}
