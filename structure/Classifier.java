package structure;

import java.util.ArrayList;

public class Classifier{

	private ArrayList<Integer> listA;
	private ArrayList<Integer> listB;
	private ArrayList<Integer> listC;
	private ArrayList<Integer> listD;

	public Classifier(){
	}

	public void classify(ArrayList<Integer> a, ArrayList<Integer> b){
      this.listA = a;
	  this.listB = b;
	  this.listC = new ArrayList<Integer>();
	  this.listD = new ArrayList<Integer>();

	  ArrayList<Integer> checked = new ArrayList<Integer>();

	  for(int i = 0; i < listB.size(); i++){

        int needle = listB.get(i);
        
        if(!checked.contains(needle)){
	      if(listA.contains(needle)){
	        
	        this.listC.add(needle);
	        
	      }else{
	          
	        this.listD.add(needle);
	             
	      }

	      checked.add(needle);
	    }

      }
	}
	
	public ArrayList<Integer> getListC(){
	    return this.listC;
	}
	
	public ArrayList<Integer> getListD(){
	    return this.listD;
	}

}