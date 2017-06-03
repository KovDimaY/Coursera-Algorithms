package com.coursera.assignment.second;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SCCCounter {
	
	private List<int[]> graph;
	private int finishingTime;
	private boolean[] visitedNodes;
	private int[] labels;
	int numberOfNodes;
	
	public SCCCounter(List<int[]> graph, int numberOfNodes) {
		this.graph = graph;
		this.numberOfNodes = numberOfNodes;
		this.finishingTime = 0;
		
		this.labels = new int[numberOfNodes];
		for(int i = 0; i < numberOfNodes; i++) {
			labels[i] = i+1;
		}
		
		this.visitedNodes = new boolean[numberOfNodes];
		Arrays.fill(visitedNodes, false);
		
	}
	
	
	public int[] fiveLargestSCC() {
		int[] result = {0,0,0,0,0};
		
		List<List<Integer>> backwardOrder = this.formatGraph(this.graph, this.numberOfNodes, false);
		List<List<Integer>> directOrder = this.formatGraph(this.graph, this.numberOfNodes, true);
		
		System.out.println("List of nodes: " + Arrays.toString(this.labels));
		System.out.println("List of visited nodes: " + Arrays.toString(this.visitedNodes));
		
		DFS_loop(directOrder, this.labels, this.visitedNodes);
		return result;
	}
	
	private void DFS_loop(List<List<Integer>> graph, int[] nodes, boolean[] visited) {
		Integer finishingTime = 0;
		int s = 0;
		
		for (int i = nodes.length-1; i >= 0; i--) {
			if (!visited[nodes[i]-1]) {
				s = nodes[i];
				DFS(graph, nodes[i]-1, nodes, visited);
			}
		}
	}
	
	private void DFS(List<List<Integer>> graph, int node, int[] allNodes, boolean[] visited) {
		System.out.println("visiting node " + (node+1));
		visited[node] = true;
		for (int i=0; i<graph.get(node).size(); i++){
			if(!visited[graph.get(node).get(i)-1]) {
				visited[graph.get(node).get(i)-1] = true;
				DFS(graph, graph.get(node).get(i)-1, allNodes, visited);
			}
		}
		System.out.println("List of visited nodes: " + Arrays.toString(visited));
	}
	
	private List<List<Integer>> formatGraph(List<int[]> graph, int numberOfNodes, boolean directOrder) {
		List<List<Integer>> result = new ArrayList();
		for (int n = 0; n < numberOfNodes; n++) {
			result.add(new ArrayList<Integer>());
		}
		if (directOrder) {
			for (int i=0; i<graph.size(); i++){
				result.get(graph.get(i)[0]-1).add(new Integer(graph.get(i)[1]));
			}
		} else {
			for (int i=0; i<graph.size(); i++){
				result.get(graph.get(i)[1]-1).add(new Integer(graph.get(i)[0]));
			}
		}
		System.out.println("***********************Result of convertion***********************");
		for (int i=0; i<result.size(); i++){
			System.out.print("Node " + (i+1) + ": ");
			for (int n = 0; n < result.get(i).size(); n++) {
				System.out.print(result.get(i).get(n) + ", ");
			}
			System.out.println();
		}
		System.out.println("***********************Result of convertion***********************");
		return result;
	}
	
}
