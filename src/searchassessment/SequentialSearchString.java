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
 * a. Implement main method to read data from a file, call the indexOf method
 *    and print the search result and execution time
 * b. Perform several measurements using data sets provided:
 *    run the program (this class) several times,  i.e. with each of the data sets provided,
 *    and record the results
 * c. implement a step counter and perform measurements again. Record your results.
 
 * --------------------------------------------------------------------------
 * 
 * @author Whitecliffe
 * @author Peter Stanger
 */
public class SequentialSearchString {

    private static int stepCounter = 0;

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
       
      // ========== YOUR TASK =========================================================
      // QUESTION 2
      // YOUR TASK:
      // IMPLEMENT THE SEQUENTIAL SEARCH
     
      // QUESTION 3
      // - IMPLEMENT STEP COUNTER  
      //   Note: you will need to comment it out when doing time measurements, 
      //         because the step counter impacts the execution time
      // ===============================================================================

        for (int i = 0; i < collection.length; i++) {

            //stepCounter++;

            if (collection[i].compareTo(term) == 0) {
                return i;
            }
        }


        return -1; // default implementation - change this when you implement the search.
     }
 
  
/**
     * Reads in 
     * - a search term (String)
     * - a sequence of Strings from a file (.txt file)
     * both specified as a command-line argument;
     * searches for the term in the collection
     * prints the result of the search and the execution time in seconds
     *
     * example on how to run (in your IDE): SequentialSearchString.java "Alice" movies.txt
     *
     *
     * @param args the command-line arguments
     * @param arg[1] the search term
     * @param args[2] the collection
     */
    public static void main(String[] args)  { 

        int searchResult = 0;

        // READ INPUT ARGUMENTS FROM A FILE
        //Read the search term
        String term = new String((args[0]));
        
        // Read the input data stream (the collection)
        In in;
        String[] collection;
        try{ 
            in = new In(args[1]);
            collection = in.readAllLines();
        
            // Print the goal
            System.out.print("Searching for " + term);
            System.out.println(" in collection of size " + collection.length);

            // ========== YOUR TASK =========================================================
            // QUESTION 3 
            // - CALL THE SEARCHING METHOD 
            // - IMPLEMENT TIMER and print the execution time
            //   Hint: you may use the provided Stopwatch utility class, or implement your own.
            // - print the search result
            // ===============================================================================

            searchResult = indexOf(term, collection);

            if(searchResult >= 0){
                System.out.println(term + " was found at index " + searchResult);
            } else {
                System.out.println("Could not find " + term + " in the collection");
            }

        } catch (java.lang.IllegalArgumentException e) {
            // Error with input data file
            System.out.println(e+ ": Incorrect data file as argument: " + args[1]);
        }

      
    } 
    
}
