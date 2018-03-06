# IT6033-Practical-Task-3-Searching-Algorithms
Starter code for assignment IT6033 Practical Task 3

## Framework

You are provided with a framework for programming their algorithms.   
Classes provided, in your classroom repository _IT6033-Practical-Task-3-Searching-Algorithms-[your-github-user-name]_:
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
  - `SearchAssessmentTestSuite.java` that allows to run both test classes in one go
  - instructions on how to run test cases in NetBeans are found below


## Student Assessment Tasks
You will program the following algorithms:  
1. a sequential search on an arrays of strings, read from an input file.
2. a binary search on an arrays of strings, read from an input file.
  
You will measure and compare running time and number of steps 
for the two algorithms, on input data files of various sizes. 


### Part 1: Implement a sequential search on an array of Strings

#### For Question 2

* Implement the searching in `SequentialSearchString.indexOf()`

* Test your implementation using JUnit test `SequentialSearchStringTest.java`
  - select `SequentialSearchStringTest.java`
  - right click
  - select __Run File__
  - look at results in test results panel
  - (you may add other tests of your choice in that class)
  
#### For Question 3

* Implement the measurements in SequentialSearch.main()
    - reading from an input file containing a list of Strings, one per line
    - input files are provided in folder `data`
    - implement a timer, optionally using `utils.Stopwatch.java`
    - test with small file first
    - NetBeans > Project > Properties > Run > create new configuration __Sequential Search String__  with 
      - main class: `SequentialSearchString.java`
      - arguments: `"Viens voir papa!", "movieTitles100.txt"`
      - directory: `..\data`
     - Manu __Run__ > select __Run Project__ - this will run whichever configuration is selected in the dropdown box visible on the toolbar
    
* Perform time measurements with files of different sizes
    - run with provided files from `movieTitles20.txt` to `movieTitles2Million.txt` (or create your own)
    - record measurements in a document
    
* Perform step counting
    - implement step counter in your algorithm (comment it out when doing time measurements as this may affect the time)
    - run with provided files from `movieTitles20.txt` to `movieTitles2Million.txt` (or create your own)
    - record measurements in a document


### Part 2: Implement a binary search on an array of ints

Similar to above, with classes
- `BinarySearch.java`
- `BinarySearchTest.java`

Run with a new configuration __Binary Search String__

Note: input files must be __sorted__ lists for a binary search.

