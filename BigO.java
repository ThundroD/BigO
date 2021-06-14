package bigO;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class BigO {
	//O(n) algorithm that sequentially inserts an element into a list
    public static List<String> nAlgorithm(String [] arr){
    	//create list
        List <String> sweets = new ArrayList<String>();
        //one for loop that adds elements into list. 
        for(String candy : arr) {
            sweets.add(candy);
        }
        //return list
        return sweets;
    }
    
   // O(n​2)​ algorithm that iterates over a 2D array of integers.
    public static void n2Algorithm(int [][] arr){
    	//nested for loop to iterate through 2D array creating O(n2)
    	for(int[] firstNumber : arr) {
    		for(int [] secondNumber : arr) {
    			//prints out entire iteration
    			System.out.println(Arrays.toString(firstNumber) + Arrays.toString(secondNumber));
    		}
    	}
    }
    
    // O(logn) algorithm that inserts elements sequencially into list
    public static void OlogNAlgorithm() {
    	//set list and amount
    	ArrayList<Integer> numberList = new ArrayList<Integer>();
    	int amount = 1000;
    	//for loop to add to list
    	for(int i=1; i <= amount; i= i * 2) {
    		
        	numberList.add(i);
        	
    	}
    	//print 10 numbers before i would be at 1000 or greater and thus an example of the o(log n)
    	//because no matter how large amount is set, there isn't a significant increase in processing
    	System.out.println(numberList);
    }
  
    
	public static void main(String[] args) {
	     //Create string array
        String [] candy = new String [5];
        //add to the array
        candy[0] = "M&Ms";
        candy[1] = "Kit-Kat";
        candy[2] = "Snickers";
        candy[3] = "Reese's Peanut Butter Cups";
        candy[4] = "Skittles";
        //Call ons function to insert array items into List
        System.out.println(nAlgorithm(candy));
        
        //2D Array
        int [][] my2DArray= {{1,2}, {3,4}, {5,6}, {7,8}, {9,10}};
        //call function to iterate through 2D array
        n2Algorithm(my2DArray);
        
        //call function to insert elements into a list using Ologn 
        OlogNAlgorithm();
        
	}

}
