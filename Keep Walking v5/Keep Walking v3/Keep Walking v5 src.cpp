/*  This is an advanced program that follows a mathamatical pattern 
like algorithm that is used for finding out the answer to a formula 
of recursion.  It goes as follows:
A = n1^2 + 1 + 3
B = n2^2 + A + 3
C = n3^2 + B + 3
D = n4^2 + C + 3
etc...

An example of this is
5 = 1 * 1 + 1 + 3
12 = 2 * 2 + 5 + 3
24 = 3 * 3 + 12 + 3
43 = 4 * 4 + 24 + 3
71 = 5 * 5 + 43 + 3
*/

#include <iostream>
using namespace std;

int main()
{
int prog_on;
prog_on = 1;

BEGIN:
cout << "------------------  Keep walking application  ------------------" << endl << endl;
cout << "This program is designed to calculate the answer to the hacking" << endl
	 << "wargame named Keep walking from www.net-force.nl.  It uses the " << endl
	 << "input of a variable X (which is also known as n#) and runs it  " << endl
	 << "through a series of formulas to output the answer.  Depending  " << endl
	 << "on the number input it will display the answer to that formula " << endl
	 << "by calculating every single equation before it to get the      " << endl
	 << "variable to the n# equation given by the user.					" << endl << endl
	 << "The patten being:			The example being: " << endl
	 << "A = n1^2 + 1 + 3			5 = 1 * 1 + 1 + 3   " << endl
	 << "B = n2^2 + A + 3			12 = 2 * 2 + 5 + 3  " << endl
	 << "C = n3^2 + B + 3			24 = 3 * 3 + 12 + 3 " << endl
	 << "D = n4^2 + C + 3			43 = 4 * 4 + 24 + 3 " << endl << endl;
cout << "------------  Designed and programmed by dot_Cipher  ------------" << endl << endl << endl;

START:

int X;
int Y;
int NAns;
int Ans;
Ans = 1;							// Variable declared and Ans/test initialized


do
{
	cout << "Please insert a designated positive integer value X:" << endl;
	cin >> X;						//user enters X
	Y = 1;							//First equation of Y set to 1
	
	if (X <= 0)
	{
	cout << "Zero or any negative number is an invalid entry, please type a positive value" << endl << endl << endl;
	goto START;
	}

	X = X + 1;						//THIS IS SO CHEAP!!! LOL


	if (X == 0)						//if X = 1 run this
	{
	NAns = X * X + Ans + 3;
	cout << NAns << endl;
	}

	while (Y != X)					//While 1 is not = to X run this
	{
	Ans = Y * Y + Ans + 3;
	Y++;
	}

	if (Y == X)						//if X = Y run this
	{
	cout << Ans << endl << endl;
	}

	goto START;


}
while (prog_on==1);

return 0;
}
/* 
Designed and programmed by dot_Cipher (aka. AIProjectX)
email me:  aiprojectx@gmail.com
574Ч 1337
*/