// Driver Testing.cpp : Defines the entry point for the console application.
// These test cases were made by ecdev456 to check that "CheckMath" and CheckWin are correct
// Due to CheckMath not returning anything, i've included the use of the table in order to visualize results


// Self Testing: (currently ready to just Run and show cases i've made) If you want to make your changes read below.
// 1. You can edit any of the arrays below and will notice table update accordingly
// 2. you can comment one of the CheckMath calls after the assigning.
//		2a. If you do this then you'll notice the color values not being updated (meaning appropriate sums not being check) i.e CheckMath does the updating for you.

// 2 test cases will purposely not win
// 1  test case will win

#include <iostream>
#include <cstdlib>
#include <Windows.h>
#include "view.h"
#include "model.h"

using namespace std;
//Test 1 Array to make the Vertical checks sum correctly
const int Test1[5][5] = { 
	{ 0,1,1,1,1 },
	{ 0,0,1,1,0 },
	{ 1,0,0,0,1 },
	{ 1,1,1,1,1 },
	{ 1,1,0,0,0 } 
};

//Test 2 Array to make the Horizontal 
const int Test2[5][5] = {
	{ 0,0,1,1,1 },
	{ 0,1,1,1,1 },
	{ 0,1,1,0,1 },
	{ 1,1,1,1,0 },
	{ 1,0,0,0,0 }
};

//Win Array changes the board to a winning state
const int Win[5][5] = {
	{ 0,0,1,1,1 },
	{ 0,1,1,1,1 },
	{ 1,1,0,0,1 },
	{ 1,1,1,1,0 },
	{ 1,0,0,0,0 }
};

int main()
{
	view View;
	Model test;
	bool winCatch;
	View.printRullo();
	cout << endl;

	//Test Case 1  All values on the Vertical are summed correctly.
	// CheckMath called to update the correct values
	//Print the board again to show the current board
	for (int i = 0; i < 5; i++) 
	{
		for (int x = 0; x < 5; x++)
		{
			actNum[i][x] = Test1[i][x];
		}
	}
	test.CheckMath();	
	View.printRullo();
	cout << endl;

	//Test Case 2; same as Test Case 1 but fulfills only for the Horizontal.
	for (int i = 0; i < 5; i++)
	{
		for (int x = 0; x < 5; x++)
		{
			actNum[i][x] = Test2[i][x];
		}
	}
	test.CheckMath();
	View.printRullo();
	cout << endl;

	//Test Case 3: Activating or Deactiving the current status of the board in order to make the win happen.
	//CheckWin called to make sure the win is happened and bool will catch the result
	for (int i = 0; i < 5; i++)
	{
		for (int x = 0; x < 5; x++)
		{
			actNum[i][x] = Win[i][x];
		}
	}
	test.CheckMath();
	View.printRullo();
	winCatch= test.CheckWin();
	cout << endl;

	if (winCatch == 1)
	{
		cout << "Game has automatically congratulated your win^" << endl;
	}
	if (winCatch == 0)
	{
		cout << "Seems like you changed the Win array to make it not win" << endl;
	}
    return 0;
}

