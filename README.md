# Coursera-Algorithms
This project has solutions of exercises from a course on Coursera. It uses divide-and-conquer paradigm and reads information from files. There are different algorithms implemented such as quick sort, inversions counter and other.

### 1. Inversions Counter
File contains all of the 100,000 integers between 1 and 100,000 (inclusive) in some order, with no integer repeated.
The task is to compute the number of inversions in the file given, where the i-th row of the file indicates the i-th entry of an array.

#### Relevance
This problem is related to measuring similarity between two ranked lists, which in turn is relevant for making good recommendations to someone based on your knowledge of their and others' preferences ("collaborative filtering").

#### What is inversion
Inversion is a pair of indices (i, j) of a numeric array A where i<j and A[i] > A[j].

#### How to use the application
You can put `.txt` file with your data inside the folder `/resources` and in the main method of the class `Program` put the name of your file at the line 
```java
// file with data provided by Coursera
MyFileReader inversionsDataFile = new MyFileReader("InversionsData.txt", MyFileReader.DataType.NUMBER);
``` 
and then just execute the program to get a result.

### 2. Comparisons Counter
File contains all of the integers between 1 and 10,000 (inclusive, with no repeats) in unsorted order. The integer in the i-th row of the file gives you the i-th entry of an input array.

The task is to compute the total number of comparisons used to sort the given input file by QuickSort. It is known, that the number of comparisons depends on which elements are chosen as pivots, so it is needed to explore three different pivoting rules:
1. Always the first element as a pivot
2. Always the last element as a pivot
3. "Median-of-three" pivot (the first, the last and the middle elements)

#### How to use the application
You can put `.txt` file with your data inside the folder `/resources` and in the main method of the class `Program` put the name of your file at the line 
```java
// file with data provided by Coursera
MyFileReader sortDataFile = new MyFileReader("ComparisonsData.txt", MyFileReader.DataType.NUMBER);
``` 
and then just execute the program to get a result.

### 3. Minimum Cut of Undirected Graph
The file contains the adjacency list representation of a simple undirected graph. There are 200 vertices labeled 1 to 200. The first column in the file represents the vertex label, and the particular row (other entries except the first column) tells all the vertices that the vertex is adjacent to.

The task is to code up and run the randomized contraction algorithm for the min cut problem and use it on the above graph to compute the min cut.

#### Relevance
Min-cut has been used for identify weaknesses in the network. If it is needed to find a weakness in a transportation network of a particular country, one can simply present this network through a graph and find a minimum cuts of the graphs

Another application is found in image processing, where min-cut algorithm is used for image segmentation.

Another application of min-cut has been found in detection communities in social networks.


#### What is a cut
A cut (S,T) in an undirected graph G=(V,E) is a partition of the vertices V into two non-empty, disjoint sets S**U**T=V. 

#### How to use the application
You can put `.txt` file with your data inside the folder `/resources` and in the main method of the class `Program` put the name of your file at the line 
```java
// file with data provided by Coursera
MyFileReader graphDataFile = new MyFileReader("MinCutData.txt", MyFileReader.DataType.LINE);
``` 
and then just execute the program to get a result.

### 4. Strongly Connected Components (SCCs) of Directed Graph
The file contains the edges of a directed graph. Vertices are labeled as positive integers from 1 to 875714. Every row indicates an edge, the vertex label in first column is the tail and the vertex label in second column is the head (recall the graph is directed, and the edges are directed from the first column vertex to the second column vertex). So for example, the 11th row looks like: "2 47646". This just means that the vertex with label 2 has an outgoing edge to the vertex with label 47646.

The task is to code up the algorithm from the video lectures for computing strongly connected components (SCCs), and to run this algorithm on the given graph.

#### What is SCCs
A directed graph is called strongly connected if there is a path in each direction between each pair of vertices of the graph. Equivalently, a strongly connected component of a directed graph G is a subgraph that is strongly connected, and is maximal with this property: no additional edges or vertices from G can be included in the subgraph without breaking its property of being strongly connected. The collection of strongly connected components forms a partition of the set of vertices of G. 

#### How to use the application
You can put `.txt` file with your data inside the folder `/resources` and in the main method of the class `Program` put the name of your file at the line 
```java
// files with data provided by Coursera
MyFileReader SCCDataFile = new MyFileReader("CCSData.txt", MyFileReader.DataType.LINE);
``` 

also you need to know how many nodes does graph have and you have to put this data in the next line
```java
// initializing counters
SCCCounter sccCounter = new SCCCounter(SCCData, 875714);
``` 
and then just execute the program to get a result.

#### Useful tip
This problem requires quite deep recursion, so probably you will need to enlarge your stack in order to avoid `StackOverflowError`. In my case it was enough `-Xss10m`. For more detailes you can read a topic about it (for example here: 
https://stackoverflow.com/questions/2127217/java-stack-overflow-error-how-to-increase-the-stack-size-in-eclipse)


### 5. Dijkstra's Shortest-Path Algorithm
The file contains an adjacency list representation of an undirected weighted graph with 200 vertices labeled 1 to 200. Each row consists of the node tuples that are adjacent to that particular vertex along with the length of that edge. For example, the 6th row has 6 as the first entry indicating that this row corresponds to the vertex labeled 6. The next entry of this row "141,8200" indicates that there is an edge between vertex 6 and vertex 141 that has length 8200. The rest of the pairs of this row indicate the other vertices adjacent to vertex 6 and the lengths of the corresponding edges.

The task is to run Dijkstra's shortest-path algorithm on this graph, using 1 (the first vertex) as the source vertex, and to compute the shortest-path distances between 1 and every other vertex of the graph. If there is no path between a vertex v and vertex 1, we'll define the shortest-path distance between 1 and v to be 1000000. It should be reported the shortest-path distances to the following ten vertices, in order: 7,37,59,82,99,115,133,165,188,197. 

#### Relevance
Shortest path algorithms are applied to automatically find directions between physical locations, such as driving directions on web mapping websites like MapQuest or Google Maps. 

If one represents a nondeterministic abstract machine as a graph where vertices describe states and edges describe possible transitions, shortest path algorithms can be used to find an optimal sequence of choices to reach a certain goal state, or to establish lower bounds on the time needed to reach a given state. For example, if vertices represent the states of a puzzle like a Rubik's Cube and each directed edge corresponds to a single move or turn, shortest path algorithms can be used to find a solution that uses the minimum possible number of moves.

In a networking or telecommunications mindset, this shortest path problem is sometimes called the min-delay path problem and usually tied with a widest path problem. For example, the algorithm may seek the shortest (min-delay) widest path, or widest shortest (min-delay) path.

A more lighthearted application is the games of "six degrees of separation" that try to find the shortest path in graphs like movie stars appearing in the same film.

Other applications, often studied in operations research, include plant and facility layout, robotics, transportation, and VLSI design.


#### What is a shortest path
In graph theory, the shortest path problem is the problem of finding a path between two vertices (or nodes) in a graph such that the sum of the weights of its constituent edges is minimized. 

#### How to use the application
You can put `.txt` file with your data inside the folder `/resources` and in the main method of the class `Program` put the name of your file at the line 
```java
// file with data provided by Coursera
MyFileReader dijkstraDataFile = new MyFileReader("DijkstraData.txt", MyFileReader.DataType.ARRAY);
``` 

also you need to know how many nodes does graph have and you have to put this data in the next line
```java
// initializing counters
DijkstraShortPath dijkstraSPC = new DijkstraShortPath(dijkstraData, 200);
``` 
and then just execute the program to get a result.
