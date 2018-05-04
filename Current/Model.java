package ecdev456;

//Model.hAct[]
		
public class Model {
	int actNum[][]; // 5x5 Grid, Checking active #'s
	int rulloGrid[][]; //5x5 official grid
	
	public static final int hAct[] = {0,0,0,0,0}; //set to not finished
	public static final int vAct[]= {0,0,0,0,0}; //set to not finished
	
	int hSum[] = {13,16,12,23,02};
	int vSum[] = {9,17,13,12,15};
	
	private boolean HCheck[]; //size 5, boolean array where each is assigned true or false if valid mathematics for pertaining row.
	private boolean VCheck[]; //size 5, boolean array where each is assigned true or false if valid mathematics for pertaining column.
	
	Model()	//initialize values to false, when new object made
	{
		for(int i=0; i < 5; i++)
		{
			HCheck[i] = false;
			VCheck[i] = false;
		}
	}
	boolean HPrint(int i) { return HCheck[i];}
	boolean VPrint(int i) { return VCheck[i];}
	
	void CheckMath()
	{
		//Horizontal math checking.  Seperate 2-d array checking active/non-active values
		//active values will be added and checked to the Final sum of that Row.
		//Non-active will not be added.
		
		int HSum = 0;
		int JSum = 0;//This will be checking the neccessary sum with the current sum.(HSum gets only from active values)
		
		int j =0, col = 0; //in charge of the rows
		boolean done = false;
		
		while(!done)
		{
			for(int i = 0; i < 5;i++) 	//checking each spot on row, will later change row when 'j++' reached
			{
				if(actNum[j][i] == 1)
				{
					HSum += rulloGrid[j][i];
				}
				//checking each spot on row, will later change row when 'j++' reached
			}
			if (HSum == hSum[j])	// If sum is correct then activates correct spot.
			{
				hAct[j] = 1;
			}
			if (JSum == vSum[j]) {
				vAct[col] = 1;
			}
			if (HSum != hSum[j])	//resets it back to not active when not equal
			{
				hAct[j] = 0;
			}
			if (JSum != vSum[j]) {
				vAct[col] = 0;
			}
			// This will have to be modified for vertical checking to work so i doubled the increment variables to j and col.
			if (j == 4 && col == 4) { done = true; }	//exit the while loop
			else
				HSum = 0;
				JSum = 0;
			j++;
			col++;
		}
		
	}
	boolean CheckWin()
	{
		for (int i = 0; i < 5; i++)
		{
			if (hAct[i] != 1) { return false; }
			if (vAct[i] != 1) { return false; }
		}

		//if reached this point then all are good
		System.out.println( "Congradulations! You won the game!!");
		return true;
	}
}
