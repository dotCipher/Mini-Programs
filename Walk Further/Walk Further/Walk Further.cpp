/*  
This program is designed to calculate the answer to a hacking wargame named Walk Futher 
designed by dot_Cipher as a continuation of Keep Walking, with increased difficulty.  
It uses the input of a variable X (which is also known as n#) and runs it through a 
series of formulas to output the answer.  Depending on the number input it will 
display the answer to that formula by calculating every single equation before it
to get the variable to the n# equation given by the user.

The patten being:
A = (n1^2)/(1)(-1) + 1 + 2.01
B = (n2^2)/(A)(-2) + 2 + 2.01
C = (n3^2)/(B)(-3) + 3 + 2.01
D = (n4^2)/(C)(-4) + 4 + 2.01


The example being:
2.01 = (1)/(1)(-1) + 1 + 2.01
~3.51 = (2)/(2.01)(-2) + 2 + 2.01
~4.72 = (3)/(~3.51)(-3) + 3 + 2.01
~5.79 = (4)/(~4.72)(-4) + 4 + 2.01

etc...

*/

#include <iostream>
using namespace std;

int main()
{
int prog_on;
prog_on = 1;

cout << "------------------------  Walk Further application  ------------------------" << endl << endl;
cout << "|  This program is designed to calculate the answer to a hacking wargame" << endl;
cout << "|  named Walk Futher designed by dot_Cipher as a continuation of Keep" << endl;
cout << "|  Walking, with increased difficulty.  It uses the input of a variable X" << endl;
cout << "|  (which is also known as n#) and runs it through a series of formulas to" << endl;
cout << "|  output the answer.  Depending on the number input it will display the" << endl;
cout << "|  answer to that formula by calculating every single equation before it" << endl;
cout << "|  to get the variable to the n# equation given by the user." << endl << "|" << endl;
cout << "|  The patten being:			The example being: " << endl;
cout << "|  A = (n1^2)/(1)(-1) + 1 + 2.01	2.01 = (1)/(1)(-1) + 1 + 2.01" << endl;
cout << "|  B = (n2^2)/(A)(-2) + 2 + 2.01	~3.51 = (2)/(2.01)(-2) + 2 + 2.01" << endl;
cout << "|  C = (n3^2)/(B)(-3) + 3 + 2.01	~4.72 = (3)/(~3.51)(-3) + 3 + 2.01" << endl;
cout << "|  D = (n4^2)/(C)(-4) + 4 + 2.01	~5.79 = (4)/(~4.72)(-4) + 4 + 2.01" << endl ;
cout << "|  etc..." << endl << endl;
cout << "------------------  Designed and programmed by dot_Cipher  ------------------" << endl << endl << endl;

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