package searchassessment;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * YOUR TASK: adjust these tests for your own purposes.
 *
 * @author Computer Power Plus
 */
public class SequentialSearchStringTest {
    
    public SequentialSearchStringTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of contains method, of class SequentialSearchString.
     */
    @Test
    public void testContains() {
        System.out.println("SequentialSearchString - Testing method: contains()");
        String[] collection;
 
        // Test case: very small array of single words
        collection = new String[] {"Hello", "World"};
        assertEquals(true, SequentialSearchString.contains("Hello", collection));
        assertEquals(false, SequentialSearchString.contains("Goodbye", collection));
        // Test case: case sensitivity
        // YOUR TASK: decide whether the sequential search should be case sensitive or not
        // and set the following assertions to false or true
//        assertEquals(true, SequentialSearchString.contains("hello", collection));
//        assertEquals(true, SequentialSearchString.contains("wORLD", collection));
        
        // Test case: array of 1 string
        collection = new String[] {"Hello"};
        assertEquals(true, SequentialSearchString.contains("Hello", collection));
        assertEquals(false, SequentialSearchString.contains("Goodbye", collection));

        // Test case: small array of phrases - exact match of entire phrase
        collection = new String[] {"A Wrinkle in Time", "Avengers: Infinity War", "Star Wars", "Thor: Rognarok"};
        assertEquals(true, SequentialSearchString.contains("Star Wars", collection));
        assertEquals(true, SequentialSearchString.contains("Thor: Rognarok", collection));
        assertEquals(false, SequentialSearchString.contains("Thor", collection));
        assertEquals(false, SequentialSearchString.contains("War", collection));
    }

    /**
     * Test of indexOf method, of class SequentialSearchString.
     */
    @Test
    public void testIndexOf() {
        System.out.println("SequentialSearchString - Testing method: indexOf()");
        String[] collection;
    
        // Test case: very small array of single words
        collection = new String[] {"Hello", "World"};
        assertEquals(0, SequentialSearchString.indexOf("Hello", collection));
        assertEquals(1, SequentialSearchString.indexOf("World", collection));
        assertEquals(-1, SequentialSearchString.indexOf("Goodbye", collection));
        
    
        // Test case: small array of SORTED titles - exact match of entire title
        collection = new String[] {"A Wrinkle in Time", "Avengers: Infinity War", "Star Wars", "Thor: Rognarok"};
        assertEquals(0, SequentialSearchString.indexOf("A Wrinkle in Time", collection));
        assertEquals(1, SequentialSearchString.indexOf("Avengers: Infinity War", collection));
        assertEquals(2, SequentialSearchString.indexOf("Star Wars", collection));
        assertEquals(3, SequentialSearchString.indexOf("Thor: Rognarok", collection));      
        assertEquals(-1, SequentialSearchString.indexOf("Gone with the Wind", collection));      

        // Test case: UNSORTED titles - itmes should be found all the same
        collection = new String[] {"Avengers: Infinity War", "Thor: Rognarok", "Star Wars", "A Wrinkle in Time"};
        assertEquals(3, SequentialSearchString.indexOf("A Wrinkle in Time", collection));
        assertEquals(0, SequentialSearchString.indexOf("Avengers: Infinity War", collection));
        assertEquals(2, SequentialSearchString.indexOf("Star Wars", collection));
        assertEquals(1, SequentialSearchString.indexOf("Thor: Rognarok", collection));      
        assertEquals(-1, SequentialSearchString.indexOf("Gone with the Wind", collection));      
       
    }

    /**
     * Test of main method, of class SequentialSearchString.
     */
    @Test
    public void testMain() {
        System.out.println("SequentialSearchString - Testing main method: ");
        String[] args = null;
        
        // YOUR TASK: 
        // - change the tests below to suit your situation, 
        // - create further tests for larger collections
        // - implement measurements in main class and write results to system.out
        // - when you run the file, copy-paste the test output listing 
        //   as evidence of your measurements

        // Test 100
        System.out.println("== 100 items == 1. found, 2. not found");
        args = new String[] {"Viens voir papa!", "data\\searchassessment\\movieTitles100.txt"};
        SequentialSearchString.main(args);
        args = new String[] {"The Professor and His Field Glass", "data\\searchassessment\\movieTitles100.txt"};
        SequentialSearchString.main(args);

        // Test 1000
        System.out.println("== 1000 items == found ");
        args = new String[] {"The Professor and His Field Glass", "data\\searchassessment\\movieTitles1K.txt"};
        SequentialSearchString.main(args);

        // Test 100K
        System.out.println("== 100K items ===");
        args = new String[] {"The Professor and His Field Glass", "data\\searchassessment\\movieTitles100K.txt"};
        SequentialSearchString.main(args);
        args = new String[] {"The Orange Cat", "data\\searchassessment\\movieTitles100K.txt"};
        SequentialSearchString.main(args);

        // Test 2Million
        System.out.println("== 2Million items ===");
        args = new String[] {"The Professor and His Beloved Equation", "data\\searchassessment\\movieTitles_2million.txt"};
        SequentialSearchString.main(args);
        args = new String[] {"The Professor and His Field Glass", "data\\searchassessment\\movieTitles_2million.txt"};
        SequentialSearchString.main(args);


    }
    
}
