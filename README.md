# Make Change Project

## By Chris Gehrke
+### September 2017

First week project for skill Distillery.
Demonstrates:
* Basic Java language skills.
* Using Eclipse for project development.

This project reads a price, an amount tendered, and prints the change due in each denomination.

All you have to do when you run this program is:
* Enter the price of the item as you would any normal price.
* Enter the amount the customer has tendered (given in cash and/or change).
* The program will then give the amount of change due back in bills and coins.

-The program runs by multiplying the price of the item by 100 and also the amount tendered by 100. 

-Then what it does is subtracts the price of the item from the amount tendered. 

-If the amount tendered is less than the actual price it will give an error message saying that its not enough money.

-If it is the exact amount of change it will just read a thank you.

-If the amount tendered is more than the item price then it will run through the series of denominations of change due.

-The denominations work by taking the change due and dividing by the total amount of that denomination (ex. 100 times $100 is 10000, 100 times 50 is 5000 and so on). Once you get to the coins its just their same value.

-Then what happens is that if the answer is greater than 0 it will figure out how many times that number will go into the change due and the number left over after the using the mod is the number of bills or coins due.

-The program only runs once so if you want to enter something else you'll just have to run it again.

Enjoy the glory of this amazing tool.