package structure;

import java.util.ArrayList; 

public class Queue{

  private ArrayList<Person> queue;

  public Queue(){
    queue = new ArrayList<Person>();
  }

  public void enqueue(int amount){
  	for(int i = 0; i < amount; i++){
      Person p = new Person("Person" + Integer.toString(i+1));
      
      addToQueue(p);
    }
  }

  private void addToQueue(Person p){
  	queue.add(p);
    System.out.println("Queueing " + p.getName());
  }

  public void dequeue(){
  	while(!queue.isEmpty()){
      Person p = getNextPerson();
    
      System.out.println("Dequeueing " + p.getName());
    }
  }

  private Person getNextPerson(){

    if(!queue.isEmpty()){
    	return queue.remove(0);
    }else{
      return null;
    }
    
  }

  public String getPersonName(int index){
    if(!queue.isEmpty()){
      return (queue.get(index)).getName();
    }else{
      return null;
    }
  }
	
  public class Person{
    private String name;
    
    public Person(String name){
      this.setName(name);
    }
  
    public void setName(String name){
      this.name = name;
    }
  
    public String getName(){
      return this.name;
    }
  }
}
