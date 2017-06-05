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

