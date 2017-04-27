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
MyFileReader inversionsDataFile = new MyFileReader("InversionsData.txt");
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
MyFileReader sortDataFile = new MyFileReader("ComparisonsData.txt");
``` 
and then just execute the program to get a result.
