package cse360assign2;

public class AddingMachine {

	 // initiating variables
	private int total;
	private String history="0";
	public AddingMachine () 
	
	{
		total = 0;  // not needed - included for clarity
	}

	public int getTotal () 
	//The getTotal method is to get the total value after the operations are done 
	{
		return total;
	}

	public void add (int valueInput) 
	//The adding method is to add numbers and it's one of the operations 
	{
		total+=valueInput;
		history+=" + "+valueInput;
	}

	public void subtract (int valueInput) 
	//The subtracting method is to subtract numbers and it's one of the operations 
	{
		total-=valueInput;
		history+=" - "+valueInput;
	}

	public String toString () {
		return history+ "";
	}

	public void clear() {}
}
