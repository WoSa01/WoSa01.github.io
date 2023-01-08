package edu.uqu.cs;

/*
 * Lab 1
 * CS11211
 */

/*
* After the completion of this assignment, students should be able to: 
* Fix the basic class structure in Java program
* Read an integer from the user as an input
* Print a shape based on the input and the given requirement
*/


//write an import statement to include the Scanner class
import java.util.Scanner;

/**
 * There is an issue with the class name.
 * For this exercise, you are not allowed to change the file name!
 * However, the filename should MATCH the class name!
 */
public class App {
  
    /*
     * main()
     *
     * Program execution begins with this method.
     * Unforunately, the main method declaration has some issue. Fix them!
     */
     
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // A variable called base
        int base;
        // Declare another variable called head to store the second digit
  

        int head;
        // NEVER XcQ
        // The following prompts and reads the first digit from the user
        System.out.println("Enter the base digit: ");
        base = scnr.nextInt();

        // Write the code to read the second digit similar to above but
        // store the digit into head
        System.out.println("Enter the head digit: ");
        head = scnr.nextInt();

        // Print an arrow on the screen using the above digits
        //Ex: If the input is:

        // 0 1
        // the output is:

        //      1
        //      11
        // 00000111
        // 000001111
        // 00000111
        //      11
        //      1

        System.out.println("     "+ head);
        System.out.println("     "+ head + head);
        System.out.println("" + base + base + base + base + base + head + head + head);
        System.out.println("" + base + base + base + base + base + head + head + head + head);
        System.out.println("" + base + base + base + base + base + head + head + head);
        System.out.println("     " + head + head);
        System.out.println("     " + head);
        /***** Do NOT MODIFY BELOW! *******/
        scnr.close();     
    }
}