package edu.utep.cs.cs1290.fifteen;

import java.util.ArrayList;
import java.util.List;

/*
 * xample:
Input: [[1,2], [3], [3], []] 
Output: [[0,1,3],[0,2,3]] 
Explanation: The graph looks like this:
0--->1
|    |
v    v
2--->3
There are two paths: 0 -> 1 -> 3 and 0 -> 2 -> 3.
 */
public class PathToTarget {

	 public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
	        return solve(graph, 0);
	    }

	    public List<List<Integer>> solve(int[][] graph, int node) {
	        int N = graph.length;
	        List<List<Integer>> ans = new ArrayList<>();
	        if (node == N - 1) {
	            List<Integer> path = new ArrayList<>();
	            path.add(N-1);
	            ans.add(path);
	            return ans;
	        }

	        for (int nei: graph[node]) {
	            for (List<Integer> path: solve(graph, nei)) {
	                path.add(0, node);
	                ans.add(path);
	            }
	        }
	        return ans;
	    }
}
