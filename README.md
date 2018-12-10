# 15-leetcode-problems

1.	Range Sum of Binary Search Tree
	Questions – 
	Can the root be null?
	Are the left and right values inclusive or exclusive
	Can you give me the treeNode Class?
	IDEAL – 
	IDEAL helped me by structuring my train of though. First, I tried to understand the problem. To do this I drew the binary searched tree to figure out how the output was generated. Afterwards I defined my goal, which was to traverse the tree and check to see if the values were less than or greater than our range. If not, then we will add them to our total. The only possible solution that I thought of was recursion so that is what I implemented. What I anticipated from this method was that I would run into a null so I made sure an if statement was implemented. I was not able to do this on my own so I made sure to look at the solution to see how it was implemented. After I looked over the solution, I had a better understanding of how it worked. 
	Duke 7 Steps – 
Duke’s 7 steps helped me by solving problems by expanding the Explore in IDEAL. The first thing I did make this into a small problem, so instead of having a huge tree, I only put 3 nodes. After learning how to solve that small instance, I wrote some pseudo code to help me with a larger problem. After realizing you must traverse the tree after checking the current value, the answer became very clear. After tracing the method and making sure it works that’s when I actually start to code it in the IDE. I also tried to think of ways to break the code to ensure the program works. After verifying it did not break anymore, I moved on to the next problem.







 
2.	Battleship
	Questions – 
	Could I have examples of this
	Can a ship be diagonal, horizontal, or vertical?
	What is the size of a ship?
	Can ships be right next to each other or overlapping?
	
	IDEAL - 
	IDEAL helped me by structuring my train of though. First, I tried to understand the problem. To do this I drew the battleship board to figure out how the output was generated. Afterwards I defined my goal, which was to traverse the board and make an algorithm which returns to me to amount of ships. A possible solution that I thought of was to use 2 for loops and check to see if you either got a “.” Or an “x”. if you had either of those at the current position the for loop would just continue, otherwise, increase out ship counter by 1. What I anticipated from this method was that I would run into out of bounds exceptions and using if statements, so I had to make sure I implemented something that would not pose a problem. I looked at the solution to see how it was implemented since I was stuck while doing my implementation. After I looked over the solution, I had a better understanding of how it worked. 
	Duke 7 Steps – 
Duke’s 7 steps helped me by solving problems by expanding the Explore in IDEAL. The first thing I did make this into a small problem, so instead of having multiple ships, I put only 1 ship. After learning how to solve that small instance, I wrote some pseudo code to help me with a larger problem. After realizing you must traverse the board and increase the counter only when you check you are not at a “.” And after checking you are no longer at an “x”, the answer became clear. After tracing the method and making sure it works that’s when I actually start to code it in the IDE. I also tried to think of ways to break the code to ensure the program works. After verifying it did not break anymore, I moved on to the next problem. 









3.	Max increase to keep City Skyline

	Questions – 
	Can I have examples of this?
	Can the array be of any size?
	Will the array always be populated?
	
	IDEAL - 
	IDEAL helped me by structuring my train of though. First, I tried to understand the problem. To do this I drew the grid to figure out how the output was generated. Afterwards I defined my goal, which was to traverse the grid and check to see if the current value was the max of the row and if it was the max of the column, and then afterwards getting the total amount that changed from the original grid. A possible solution for this using for loops to get the max of rows and cols and then another for loop to get the amount that changed from the initial grid.  What I anticipated from this method was that I would have to use dynamic programing to store the max value for all rows and for all columns.
	Duke 7 Steps – 
Duke’s 7 steps helped me by solving problems by expanding the Explore in IDEAL. The first thing I did make this into a small problem, so instead of having a grid, I made it into a 2x2 array. After learning how to solve that small instance, I wrote some pseudo code to help me with a larger problem. After realizing you have to use dynamic programming to store the max values of all rows and columns, the answer became very clear. After tracing the method and making sure it works that’s when I actually start to code it in the IDE. I also tried to think of ways to break the code to ensure the program works. After verifying it did not break anymore, I moved on to the next problem. 







4.	Maximum Binary Tree

	Questions – 
	Give another example
	Can you have null?
	
	IDEAL helped me by structuring my train of though. First, I tried to understand the problem. To do this I drew the binary searched tree to figure out how the output was generated. Afterwards I defined my goal, which was to find the max value and make binary tree. Anything to the left side of the max will be the left subtree anything after the max index will be the right subtree. The only possible solution that I thought of was recursion so that is what I implemented. 
	Duke 7 Steps – 
Duke’s 7 steps helped me by solving problems by expanding the Explore in IDEAL. The first thing I did make this into a small problem, so instead of having a huge array, I did an array of size 3 and then an array of size 4. After learning how to solve that small instance, I wrote some pseudo code to help me with a larger problem. After realizing you must save your max value after every iteration and assigning your left and right node value, the answer became very clear. After tracing the method and making sure it works that’s when I actually start to code it in the IDE. I also tried to think of ways to break the code to ensure the program works. After verifying it did not break anymore, I moved on to the next problem. 












5.	Reveal cards in increasing order

	Questions – 
	Can I have an example
	Can you have duplicates
	Will you always have at least 1 card
	
	IDEAL helped me by structuring my train of though. First, I tried to understand the problem. To do this I drew the array to figure out how the output was generated. Afterwards I defined my goal, which was to reveal the cards in increasing order while putting the next card in the bottom of the deck. The only possible solution that I thought of was using 2 for loops so that is what I implemented. What I anticipated from this method was that I would run into a null so I made sure an if statement was implemented. 

	Duke 7 Steps – 
Duke’s 7 steps helped me by solving problems by expanding the Explore in IDEAL. The first thing I did make this into a small problem, so instead of having a large array, I only put 3 elements. After learning how to solve that small instance, I wrote some pseudo code to help me with a larger problem. After realizing you must sort the given array first, and using a deque to use the pollFirst method, the answer became clear. After tracing the method and making sure it works that’s when I actually start to code it in the IDE. I also tried to think of ways to break the code to ensure the program works. After verifying it did not break anymore, I moved on to the next problem. 










6.	Insert into a binary search tree

	Questions – 
	Could I have an example?
	
	IDEAL helped me by structuring my train of though. First, I tried to understand the problem. To do this I drew the tree to figure out how the output was generated. Afterwards I defined my goal, which was to know which side to go, traverse the tree and insert the value. The only possible solution that I thought of was using recursion so that is what I implemented. What I anticipated from this method was that I would run into a null so I made sure an if statement was implemented. 
	Duke 7 Steps – 
Duke’s 7 steps helped me by solving problems by expanding the Explore in IDEAL. The first thing I did make this into a small problem, so instead of having a huge tree, I only put 3 nodes. After learning how to solve that small instance, I wrote some pseudo code to help me with a larger problem. After realizing you must traverse the tree after checking the current value, the answer became very clear. After tracing the method and making sure it works that’s when I actually start to code it in the IDE. I also tried to think of ways to break the code to ensure the program works. After verifying it did not break anymore, I moved on to the next problem. 













7.	Find and replace pattern

	Questions – 
	What output should I give if there is no pattern?
	What if the list is empty?
	
	
	IDEAL helped me by structuring my train of though. First, I tried to understand the problem. To do this I drew the list to figure out how the output was generated. Afterwards I defined my goal, which was to traverse the list and check to see if the input pattern is in the given list. A possible solution that I thought of was using maps and using a for loop so that is what I implemented. What I anticipated from this outcome was not finding the correct keys so I made sure to implement that.
	Duke 7 Steps – 
Duke’s 7 steps helped me by solving problems by expanding the Explore in IDEAL. The first thing I did make this into a small problem, so instead of having a huge list, I only put 3 strings. After learning how to solve that small instance, I wrote some pseudo code to help me with a larger problem. After realizing you must use 2 hashmaps, the answer became very clear. After tracing the method and making sure it works that’s when I actually start to code it in the IDE. I also tried to think of ways to break the code to ensure the program works. After verifying it did not break anymore, I moved on to the next problem. 











8.	Minimum add to make parenthesis valid

	Questions – 
	Is this only for one type of parenthesis
	Can it be empty?
	
	IDEAL helped me by structuring my train of though. First, I tried to understand the problem. To do this I drew the parenthesis out to figure out how the output was generated. Afterwards I defined my goal, which was to traverse the string and have a counter that keeps track to see if its balanced or not. A possible solution that I thought of was using a for loop so that is what I implemented. What I anticipated from this method was that I would run into a lot of different cases and combinations of parenthesis, so I had to make sure the algorithm was correct to ensure it worked
	Duke 7 Steps – 
Duke’s 7 steps helped me by solving problems by expanding the Explore in IDEAL. The first thing I did make this into a small problem, so instead of having a lot of parenthesis, I made really simple examples. After learning how to solve that small instance, I wrote some pseudo code to help me with a larger problem. After realizing you must use two counters and add them in the end, the answer became very clear. After tracing the method and making sure it works that’s when I actually start to code it in the IDE. I also tried to think of ways to break the code to ensure the program works. After verifying it did not break anymore, I moved on to the next problem. 












9.	All paths from source to target

	Questions – 
	Could you explain this problem differently?
	What is the range of the nodes?
	
	IDEAL helped me by structuring my train of though. First, I tried to understand the problem. To do this I drew the nodes to figure out how the output was generated. Afterwards I defined my goal, which was to traverse nodes and output all possible outcomes. The only possible solution that I thought of was using a double list so that is what I implemented. What I anticipated from this method was that I would run into a null so I made sure an if statement was implemented. I was not able to do this on my own so I made sure to look at the solution to see how it was implemented. After I looked over the solution, I had a better understanding of how it worked. 
	Duke 7 Steps – 
Duke’s 7 steps helped me by solving problems by expanding the Explore in IDEAL. The first thing I did make this into a small problem, so instead of having a lot of nodes, I cut the nodes in half. After learning how to solve that small instance, I wrote some pseudo code to help me with a larger problem. After realizing you must use a double list and use a double for loop, the answer became very clear. After tracing the method and making sure it works that’s when I actually start to code it in the IDE. I also tried to think of ways to break the code to ensure the program works. After verifying it did not break anymore, I moved on to the next problem. 










10.	Partition labels

	Questions – 
	What do you mean by appears in at most one part?
	Could I have another example?

	IDEAL - 
IDEAL helped me by structuring my train of though. First, I tried to understand the problem. To do this I drew the string to figure out how the output was generated. Afterwards I defined my goal, which was to split the string into as many parts as possible so each letter appears in at most one part. A possible solution that I thought of was using a for loop so that is what I implemented. I was not able to do this on my own so I made sure to look at the solution to see how it was implemented. After I looked over the solution, I had a better understanding of how it worked. 
	Duke 7 Steps – 
Duke’s 7 steps helped me by solving problems by expanding the Explore in IDEAL. The first thing I did make this into a small problem, so instead of having a huge string, I tried a small example. After learning how to solve that small instance, I wrote some pseudo code to help me with a larger problem. After realizing you must extend the length of the partition after seeing another character, the answer became very clear. After tracing the method and making sure it works that’s when I actually start to code it in the IDE. I also tried to think of ways to break the code to ensure the program works. After verifying it did not break anymore, I moved on to the next problem. 










11.	Complex number multiplication

	Questions – 
	Does the output have to show the 0?

IDEAL –
 IDEAL helped me by structuring my train of though. First, I tried to understand the problem. To do this I drew the complex multiplication to figure out how the output was generated. Afterwards I defined my goal, which was to find a way to replicate the imaginary “I”. a possible solution was to use a string array and parse them so that’s what I did. What I anticipated from this method was that I would need to find a way to count the number of I’s. After I got the solution, I had a better understanding of how it worked. 
	Duke 7 Steps – 
Duke’s 7 steps helped me by solving problems by expanding the Explore in IDEAL. The first thing I did make this into a small problem, so instead of having a complicated math problem, I made something relatively simple. After learning how to solve that small instance, I wrote some pseudo code to help me with a larger problem. After realizing you must create an array and parse it, the answer became very clear. After tracing the method and making sure it works that’s when I actually start to code it in the IDE. I also tried to think of ways to break the code to ensure the program works. After verifying it did not break anymore, I moved on to the next problem. 












12.	Counting bits

	Questions – 
	Why does 5 give the output of [0,1,1,2,1,2]?
	
IDEAL – 
IDEAL helped me by structuring my train of though. First, I tried to understand the problem. To do this I drew the binary numbers to figure out how the output was generated. Afterwards I defined my goal, which was to make an array that holds each individual bit. The only possible solution that I thought of was using the shift so that is what I implemented. What I anticipated from this method was that I would run into problems because I did not know how to use it very well so I made sure I read up on it. I was not able to do this on my own so I made sure to look at the solution to see how it was implemented. After I looked over the solution, I had a better understanding of how it worked. 
	Duke 7 Steps – 
Duke’s 7 steps helped me by solving problems by expanding the Explore in IDEAL. The first thing I did make this into a small problem, so instead of having a big number, I tried doing 1-4. After learning how to solve that small instance, I wrote some pseudo code to help me with a larger problem. After realizing you must use the shift, the answer became very clear. After tracing the method and making sure it works that’s when I actually start to code it in the IDE. I also tried to think of ways to break the code to ensure the program works. After verifying it did not break anymore, I moved on to the next problem.










 
13.	Keys and rooms

	Questions – 
	Can you have multiple keys in one room?

IDEAL – 
IDEAL helped me by structuring my train of though. First, I tried to understand the problem. To do this I drew the array to figure out how the output was generated. Afterwards I defined my goal, which was to use the current input to open the following door. A possible solution that I thought of was using a stack so that is what I implemented. What I anticipated from this method was that I would need to check the stack to make sure it isn’t empty so I made sure an if statement was implemented. After the solution was complete, I had a better understanding of how it worked. 
	Duke 7 Steps – 
Duke’s 7 steps helped me by solving problems by expanding the Explore in IDEAL. The first thing I did make this into a small problem, so instead of having a large list, I only put 2 items. After learning how to solve that small instance, I wrote some pseudo code to help me with a larger problem. After realizing you must use a stack and an array to keep track of the keys you had, the answer became very clear. After tracing the method and making sure it works that’s when I actually start to code it in the IDE. I also tried to think of ways to break the code to ensure the program works. After verifying it did not break anymore, I moved on to the next problem. 













14.	Daily temperatures

	Questions – 
	What is the range of the temperatures?
IDEAL – 
IDEAL helped me by structuring my train of though. First, I tried to understand the problem. To do this I drew the array to figure out how the output was generated. Afterwards I defined my goal, which was to traverse the array and store if the following day is warmer or colder than the previous one. A possible solution that I thought of was using a stack and an array to keep out new output, so that is what I implemented. What I anticipated from this method was that I would constantly check to see if the stack is empty, so I made sure an if statement was implemented. After the solution was completed, I had a better understanding of how it worked. 
	Duke 7 Steps – 
Duke’s 7 steps helped me by solving problems by expanding the Explore in IDEAL. The first thing I did make this into a small problem, so instead of having a huge array, I only put 3 elements. After learning how to solve that small instance, I wrote some pseudo code to help me with a larger problem. After realizing you must traverse the array and add elements to your new array, the answer became very clear. After tracing the method and making sure it works that’s when I actually start to code it in the IDE. I also tried to think of ways to break the code to ensure the program works. After verifying it did not break anymore, I moved on to the next problem. 










15.	Validate stack sequence

	Questions – 
	Can you push the same value?
	
IDEAL – 
IDEAL helped me by structuring my train of though. First, I tried to understand the problem. To do this I drew out the 2 arrays to figure out how the output was generated. Afterwards I defined my goal, which was to verify our output is possible based on the first arrays order. The only possible solution that I thought of was using a stack so that is what I implemented. What I anticipated from this method was that regardless of what you pop, it will always be the same as the length of the array pushed. After the solution was completed, I had a better understanding of how it worked. 
	Duke 7 Steps – 
Duke’s 7 steps helped me by solving problems by expanding the Explore in IDEAL. The first thing I did make this into a small problem, so instead of having a big array, I only put 3 elements. After learning how to solve that small instance, I wrote some pseudo code to help me with a larger problem. After realizing you must pop whatever you peek, the answer became very clear. After tracing the method and making sure it works that’s when I actually start to code it in the IDE. I also tried to think of ways to break the code to ensure the program works. After verifying it did not break anymore, I moved on to the next problem. 




