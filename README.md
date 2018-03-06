# IT6033-Practical-Task-3-Searching-Algorithms
Starter code for assignment IT6033 Practical Task 3

## Framework

You are provided with a framework for programming their algorithms.   
Classes provided, in the classroom repository _IT6033-Practical-Task-3-Searching-Algorithms_:
* in folder `src/searchassessment`  
  - a starter class `SequentialSearchString.java`, with methods 
    * `indexOf(String term, String[] collection)` - searches for a term in a collection and returns its index position
    * `contains(String term, String[] collection)` - searches for a term in a collection and returns a boolean found/not found
    * `main (args)` - allows to run the search using files containing the data sets to be searched

  - a starter class `BinarySearchString.java`, with similar methods 
    * `indexOf(String term, String[] collection)`
    * `contains(String term, String[] collection)`
    * `main (args)`

* in folder `data/searchassessment`
  - test data sets of different sizes, from small to very large:
    * sequences of strings (movie titles), one per line
  - files called `movieTitles20.txt` to `movieTitles2Million.txt`
  - sample test output listings to show measurements

Additionally corresponding JUnit test classes with test data and expected outputs:
* in folder `test/searchassessment` 
  - `SequentialSearchStringTest.java`
  - `BinarySearchStringTest.java`
  - `SearchPracticeTestSuite.java` that allows to run both test classes in one go
  - instructions on how to run test cases in NetBeans are found below


## Student Assessment Tasks
You will program the following algorithms to solve a real world problem:  
1. a sequential search on an arrays of strings, read from an input file.
2. a binary search on an arrays of strings, read from an input file.
  
You will measure and compare running time and number of steps 
for algorithms a and b, on input data files of various sizes. 
