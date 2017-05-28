package com.coursera.assignment.second;

import java.util.Arrays;
import java.util.List;

public class SCCCounter {
	
	public int[] fiveLargestSCC(List<int[]> graph, int numberOfNodes) {
		int[] result = {1,2,3,4,5};
		
		boolean[] visitedNodes = new boolean[numberOfNodes];
		Arrays.fill(visitedNodes, false);
		
		int[] nodes = new int[numberOfNodes];
		for(int i = 0; i < numberOfNodes; i++) {
			nodes[i] = i+1;
		}
		System.out.println("List of nodes: " + Arrays.toString(nodes));
		System.out.println("List of visited nodes: " + Arrays.toString(visitedNodes));
		
		DFS_loop(graph, nodes, visitedNodes);
		
		return result;
	}
	
	public void DFS_loop(List<int[]> graph, int[] nodes, boolean[] visited) {
		int t = 0;
		int s = 0;
		
		for (int i = nodes.length-1; i >= 0; i--) {
			if (!visited[nodes[i]-1]) {
				s = nodes[i];
				DFS(graph, nodes[i]-1, nodes, visited);
			}
		}
	}
	
	public void DFS(List<int[]> graph, int node, int[] allNodes, boolean[] visited) {
		System.out.println("visiting node " + (node+1));
		visited[node] = true;
		System.out.println("List of visited nodes: " + Arrays.toString(visited));
	}
	
}
