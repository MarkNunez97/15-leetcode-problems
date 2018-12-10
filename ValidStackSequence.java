package edu.utep.cs.cs1290.fifteen;

import java.util.Stack;

/*
 * Input: pushed = [1,2,3,4,5], popped = [4,5,3,2,1]
Output: true
Explanation: We might do the following sequence:
push(1), push(2), push(3), push(4), pop() -> 4,
push(5), pop() -> 5, pop() -> 3, pop() -> 2, pop() -> 1
 */
public class ValidStackSequence {

	 public boolean validateStackSequences(int[] pushed, int[] popped) {
	        int N = pushed.length;
	        Stack<Integer> stack = new Stack<>();

	        int j = 0;
	        for (int x: pushed) {
	            stack.push(x);
	            while (!stack.isEmpty() && j < N && stack.peek() == popped[j]) {
	                stack.pop();
	                j++;
	            }
	        }

	        return j == N;
	    }
}
