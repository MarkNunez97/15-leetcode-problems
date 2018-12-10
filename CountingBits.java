package edu.utep.cs.cs1290.fifteen;

/*
 * 
 * 
 * Example 1:

	Input: 2
	Output: [0,1,1]
	Example 2:
	
	Input: 5
	Output: [0,1,1,2,1,2]
 */

public class CountingBits {
	
	public int[] countBits(int num) {
	    int[] f = new int[num + 1];
	    for (int i=1; i<=num; i++) f[i] = f[i >> 1] + (i & 1);
	    return f;
	}

}
