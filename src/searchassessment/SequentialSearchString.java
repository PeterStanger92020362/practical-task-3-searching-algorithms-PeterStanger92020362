package searchassessment;

import utils.In;
import utils.Stopwatch;

/**
 * The class SequentialSearchString provides a framework for implementing 
 * a sequential search on a collection of strings as input.
 * 
 * Searching in collections is done to answer the following questions: 
 * - Does the element exists in a collection? -> method contains()
 * - How to get the element from a collection? - > method indexOf()
 *
 * "Collection" in this class is used in the broader sense 
 * and not in the strict Java sense. For example a collection may be an array 
 * or a list
 * 
 * --------------------------------------------------------------------------
 * YOUR TASKS
 * 
 * QUESTION 2:
 * a. implement indexOf method
 * b. test it using JUnit test class provided SequentialSearchStringTest.java
 *
 * QUESTION 3:
 * a. Implement main method
 * b. Perform measurements using data sets provided
 
 * --------------------------------------------------------------------------
 * 
 * @author Computer Power Plus
 * @author YOUR NAME
 */
public class SequentialSearchString {
    
 /**
 * Checks if collection contains an item.
 * @param term the search term, in this case a String
 * @param collection the collection to be searched, in this case an array of Strings
 * @return true if collection contains the term, false otherwise
 * 
 */    
    public static boolean contains(String term, String[] collection){
       // Reuses the algorithm implementation in indexOf() 
        return (indexOf(term,collection)!= -1);
    }
 
 /**
 * Finds the index of an item in a collection if it contains an item.
 * 
 * @param term the search term, in this case a String
 * @param collection the collection to be searched, in this case an array of Strings
 * @return int index of item in the array if found, otherwise -1
 * 
 */    
    public static int indexOf(String term, String[] collection){
       
        // QUESTION 2
        // YOUR TASK:
        // IMPLEMENT THE SEQUENTIAL SEARCH
        
        return -1; // default implementation - change this when you implement the search.
     }
 
  
/**
     * Reads in 
     * - a search term (integer)
     * - a sequence of integers from a file (.txt file)
     * both specified as a command-line argument;
     * searches for the term in the collection of integers
     * prints the result of the search and the time in seconds
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args)  { 
        
      // QUESTION 3
      // YOUR TASK: 
      // - READ INPUT ARGUMENTS FROM A FILE
      //    Hint: you may use the provided utility class In 
      // - CALL THE SEARCHING METHOD
      // - IMPLEMENT TIMER
      //   Hint: you may use the provided Stopwatch utility class
      // - IMPLEMENT STEP COUNTER  
      
    } 
    
}
