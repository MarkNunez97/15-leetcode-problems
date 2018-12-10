package edu.utep.cs.cs1290.fifteen;

import java.util.List;
import java.util.Stack;

/*
 * Example 1:

Input: [[1],[2],[3],[]]
Output: true
Explanation:  
We start in room 0, and pick up key 1.
We then go to room 1, and pick up key 2.
We then go to room 2, and pick up key 3.
We then go to room 3.  Since we were able to go to every room, we return true.
Example 2:

Input: [[1,3],[3,0,1],[2],[0]]
Output: false
Explanation: We can't enter the room with number 2.
 */

public class KeysAndRooms {
	  public boolean canVisitAllRooms(List<List<Integer>> rooms) {
	        boolean[] seen = new boolean[rooms.size()];
	        seen[0] = true;
	        Stack<Integer> stack = new Stack<>();
	        stack.push(0);

	        //At the beginning, we have a todo list "stack" of keys to use.
	        //'seen' represents at some point we have entered this room.
	        while (!stack.isEmpty()) { // While we have keys...
	            int node = stack.pop(); // Get the next key 'node'
	            for (int nei: rooms.get(node)) // For every key in room # 'node'...
	                if (!seen[nei]) { // ...that hasn't been used yet
	                    seen[nei] = true; // mark that we've entered the room
	                    stack.push(nei); // add the key to the todo list
	                }
	        }

	        for (boolean v: seen)  // if any room hasn't been visited, return false
	            if (!v) return false;
	        return true;
	    }

}
