package Arraylist;
import java.util.ArrayList;
import java.util.Collections; 

public class ArrayLists {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    ArrayList<Integer> myNum = new ArrayList<Integer>();
		    myNum.add(100);
		    myNum.add(70);
		    myNum.add(120);
		   

		    Collections.sort(myNum);  

		    for (int i : myNum) {
		      System.out.println(i);
		    }
	}
}
		  
		


	