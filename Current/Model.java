package ecdev456;

//Model.hAct[]
		
public class Model {
	//All values are active, then turned off when clicked on (following game rules)
	public static int actNum[][] =
		{
			{ 1,1,1,1,1 },
			{ 1,1,1,1,1 },
			{ 1,1,1,1,1 },
			{ 1,1,1,1,1 },
			{ 1,1,1,1,1 }	
		};
	public static final int rulloGrid[][]=	//5x5 grid official grid
		{
				{ 3,2,6,5,2 },
				{ 3,7,1,1,7 },
				{ 5,1,5,2,6 },
				{ 2,9,6,6,7 },
				{ 2,6,5,2,4 }
			};
	 static int hAct[] = {0,0,0,0,0}; // Keeps track if horizontal sums have been solved by user.
	 static int vAct[]= {0,0,0,0,0}; // Keeps track if verticals sums have been solved by user.
	
	 static int hSum[] = {13,16,12,23,02};	//Keeps track of the sum wanted by the Horizontal values
	 static int vSum[] = {9,17,13,12,15}; // Keeps track of the sum wanted by the Vertical values
	
	private static boolean HCheck[]; //size 5, boolean array where each is assigned true or false if valid mathematics for pertaining row.
	private static boolean VCheck[]; //size 5, boolean array where each is assigned true or false if valid mathematics for pertaining column.
	
	public static int CheckActive(int x, int y) {return actNum[x][y];}//getter
	public static void SetActive(int x, int y, int act) {actNum[x][y] = act;} //Setting active or Not Active
	public Model()	//initialize values to false, when new object made
	{
		for(int i=0; i < 5; i++)
		{
			HCheck[i] = false;
			VCheck[i] = false;
		}
	}
	boolean HPrint(int i) { return HCheck[i];} //Returns HCheck results for other testing.
	boolean VPrint(int i) { return VCheck[i];} //Returns VCheck results for other testing.
	
	public static void CheckMath()
	{
		// CheckMath: In charge of doing the Vertical and Horizontal math checking.
		// Updates every checker when necessary, depending on when the user selects the numbers.
		
		int HSum = 0;	//Temp variable to keep the Horizontal Sum.
		int JSum = 0;// Temp variable to keep the Vertical Sum.
		
		int j =0, col = 0; //For the Rows.
		boolean done = false;	// Math Checking initialized to not finished.
		
		while(!done)	//Loop to do Row and Col checking
		{
			for(int i = 0; i < 5;i++) 	//checking each spot on row, will later change row when 'j++' reached
			{
				if(actNum[j][i] == 1)
				{
					HSum += rulloGrid[j][i];
				}
				if (actNum[i][j] == 1) // check vertically by indexing through columns for ON value
				{
					JSum += rulloGrid[i][j];
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
		
		//Self Checking, can be removed later---------------------------------------
	/*	System.out.println("Horizontal");	
		for(int i = 0; i < 5;i++)
		{
			System.out.println(hAct[i]);
		}
		System.out.println("Vertical");
		for(int i = 0; i < 5;i++)
		{
			System.out.println(vAct[i]); 
		}*/
		// Done self checking.---------------------------------
	}
	public static boolean CheckWin()	// Returns if user has won the game.
	{
		for (int i = 0; i < 5; i++)
		{
			if (hAct[i] != 1) { return false; }
			if (vAct[i] != 1) { return false; }
		}

		//if reached this point then all are good
		//System.out.println( "Congradulations! You won the game!!");
		return true;
	}
}
