# Coursera-Algorithms
This project has solutions of exercises from a course on Coursera. It uses divide-and-conquer paradigm and reads information from the file. There are different algorithms implemented such as quick sort, inversions counter and others.

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
MyFileReader dataFile = new MyFileReader("data.txt");
``` 
and then just execute the program to get a result.
