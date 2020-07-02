package searchassessment;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import utils.In;
import utils.Stopwatch;

import static java.util.Arrays.sort;
import static java.util.Arrays.spliterator;

/**
 * The class BinarySearchString implements a binary search algorithm 
 * to search for a term in collection of strings.
 * The collection MUST BE A SORTED COLLECTION. This class will not sort it.
 * 
 * Searching in collections is done to answer the following questions: 
 * - Does the element exists in a collection? -> method contains()
 * - How to get the element from a collection? - > method indexOf()
 * 
* --------------------------------------------------------------------------
 * YOUR TASKS
 * 
 * QUESTION 2:
 * a. implement indexOf method
 * b. test it using JUnit test class provided BinarySearchStringTest.java
 *
 * QUESTION 3:
 * a. Implement main method to read data from a file, calling indexOf or contains method
 *    and print the search result and execution time
 * b. Perform several measurements using data sets provided:
 *    run the program (this class) several times, i.e. with each of the data sets provided,
 *    and record the results
 * c. implement a step counter and perform measurements again. Record your results.
 *  
 * --------------------------------------------------------------------------
 *
 * @author Whitecliffe
 * @author Peter Stanger 92020362
 */
public class BinarySearchString {

    private static int stepCounter=0;

     /**
    * Checks if collection contains an item.
    * @param term the search term, in this case a String
    * @param collection the collection to be searched, in this case a SORTED array of Strings
    * @return true if collection contains the term, false otherwise
    * 
    */    
    public static boolean contains(String term, String[] collection){   
        // Reuses the algorithm implementation in indexOf()
        return (indexOf(term, collection) != -1);
    }
     
     
 /**
 * Searches for a term in a sorted collection, and returns the index of 
 * the item , if it is found.
 * The input collection MUST BE PRE-SORTED
 * 
 * @param term the search term, in this case a String
 * @param collection the SORTED collection to be searched, in this case an array of Strings
 * @return int index of item in the array if found, otherwise -1
 * 
 */    
    public static int indexOf(String term, String[] collection) {
        
      // ========== YOUR TASK =========================================================
      // QUESTION 2
      // YOUR TASK:
      // IMPLEMENT THE BINARY SEARCH
     
      // QUESTION 3
      // - IMPLEMENT STEP COUNTER  
      //   Note: you will need to comment it out when doing time measurements, 
      //         because the step counter impacts the execution time
      // ===============================================================================

        stepCounter = 0;

        int min = 0;
        int max = collection.length-1;  //initial - last element of array
        int guess = (min + max) / 2;   //initial guess - middle element of array


        while( min <= max ){

            stepCounter++;

            if (collection[guess].compareTo(term) < 0){
                min = guess + 1;
            } else if (collection[guess].compareTo(term) == 0){
                return guess;
            } else {
                max = guess - 1;
            }
            guess = (min + max) / 2;
        }

        if ( min > max ){
            return -1;
        }

        return -1; // default implementation - change this when you implement the search.
      }
    
    
     /**
     * Reads in 
     * - a search term (String)
     * - a sequence of Strings from a file (.txt file), one string per line
     * both specified as a command-line argument;
     * searches for the term in the collection of integers
     * prints the result of the search and the time in seconds
     *
     * @param args the command-line arguments
     * @param arg[0] is the search term
     * @param arg[1] is the name of an input file, containing one item per line.
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

            // collection must be sorted first (eg A-Z)
            sort(collection);

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

            //Stopwatch watch = new Stopwatch();
            long watchStart = System.nanoTime();

            searchResult = indexOf(term, collection);

            long timeTaken = System.nanoTime()-watchStart;
            //double timeTaken = watch.elapsedTime();

            if(searchResult >= 0){
                System.out.println(term + " was found at index " + searchResult);
            } else {
                System.out.println("Could not find " + term + " in the collection");
            }
            System.out.println("The search took " + timeTaken + " nanoseconds to complete.");
            System.out.println("The search took " + stepCounter + " steps to complete");


        } catch (java.lang.IllegalArgumentException e) {
            // Error with input data file
            System.out.println(e+ ": Incorrect data file as argument: " + args[1]);
        }

    } 
    
}
