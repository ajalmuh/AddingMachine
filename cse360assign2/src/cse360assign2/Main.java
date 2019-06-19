package cse360assign2;

public class Main {

   public static void main(String[] args) {
       // creating an AddingMachine object 
	   AddingMachine myCalculator=new AddingMachine();
	   myCalculator.add(4); 
       // calling the adding method to add the number in the parameter
	   myCalculator.subtract(2); 
       // calling the subtracting method to subtract the number in the parameter
	   myCalculator.add(5); 
       // calling the adding method to add the number in the parameter
       System.out.println(myCalculator.toString()); 
       // this line will print the operations and the numbers added or subtracted 
       System.out.println("Total= "+myCalculator.getTotal()); 
       // this line will print the total after all the operations are done
   }
}
