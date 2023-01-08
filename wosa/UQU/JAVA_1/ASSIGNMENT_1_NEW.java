package uqu.edu.sa;

/*
 * Programming Assignment 1
 * 
 * An interactive program that performs simple operations 
 * on numbers and characters.
 *
 * CS11211
 *
 */

/*
* After the completion of this assignment, students should be able to: 
*	Declare variables and constants 
*	Declare a variable of type String
*	Declare a constant of type String
*	Use assignment statements 
*	Write simple arithmetic expressions
*	Perform type casting 
*	Read inputs from the keyboard
* 	Print/display formatted messages on the console  
*/


//write an import statement to include the Scanner class

import java.util.Scanner; 
/*
 * Program Class Defintion
 */
public class App {

    // declare a constant named "PROGRAM" of type String and give it the value:
    // "Simple Operations Program"
    final static String PROGRAM = "Simple Operations Program" ;
    
    /*** computeSum method ***/
    /*
     * computeSum that computes the sum of num1,num2,num3 and returns the result. 
     * For example, if num1=2.0,num2=10.0,num3=1.0, the result is 13
    */
    
    public static int computeSum (double num1, double num2, double num3){
    

        // declare a variable named "result" of type integer and initialze it to 0
        int result =0 ;
	    // compute the product of the three variables (num1, num2, num3) 
	    // and store the value in the variable "result"
        result=(int) (num1+num2+num3) ;
        // Hint: you may want to perform type casting from double to integer before storing 
        // the value of the sum operation to the variable "result"

        // write a print statement to display the result's value 
        System.out.println(result);

        
	    return result; 
    }

    /*** computeAverage method ***/
    /*
     * computeAverage that computes the average value of num1,num2,num3 and returns the result. 
     * For example, if num1=2.0,num2=10.0,num3=1.0, the result is 4.3
    */
     
    public static double computeAverage (double num1, double num2, double num3){
        // NEVER XcQ
        // declare a variable named "result" of type double and initialze it to 0
        double result= 0;   
	    // compute the average of the three variables (num1, num2, num3) 
	    // and store the value in the variable "result"
        result= (num1+num2+num3)/3 ;
        // write a print statement to display the result's value 
        System.out.println(result);   
	    return result; 
    }

    /*** computeProduct method ***/
    /*
     * computeProduct that computes the product value of num1,num2,num3 and returns the result. 
     * For example, if num1=2.0,num2=10.0,num3=1.0, the result is 20
    */

    public static int computeProduct (double num1, double num2, double num3){

        // declare a variable named "result" of type integer and initialze it to 0
        int result=0;
	    // compute the product of the three variables and store the value in the variable "result"
        // Hint: you may want to perform type casting from double to integer before storing 
        // the value of the product operation to the variable result
        result = (int)(num1*num2*num3);
        // write a print statement to display the result's value 
        System.out.println(result);
        return result; 
    }

    
    /*** convertCharToAscii method ***/
    /*
     * convertCharToAscii that converts a char value to its Ascii code and returns the value
     * For example, if character is 'A', then the method returns the value 65
    */
    public static int convertCharToAscii (char ch){

        // declare a variable named "result" of type integer and initialze it to 0
        int result=0;
	    // convert ch to its ascii code value and store the value in "result"
        result = (int)ch;
        // write a print statement to display the value of the two variables "ch" and "result"
        // For example, assuming that ch has the value 'A' , 
	    // then the program should display the following message
        // The ASCII code of 'A' is 65
        System.out.println("The ASCII code of '" + ch + "' is "+ result);
	    // Hint: type casting is a must here! 
	    return result; 
    }

    /*** convertToSeconds method ***/
    /**
     * This method takes the value in `timePeriodInMinutes` to be convereted in minutes, convert the minutes to seconds
     * and returns the results.
     * 
     * @param timePeriodInMinutes
     * @return number of seconds
     */

    public static double convertToSeconds(double timePeriodInMinutes){
        // Declare a variable called 'result' of type double
        // Assign to 'result' the value in seconds after converting the value in timePeriodInMinutes 
        double result=timePeriodInMinutes*60;
        return result;
    }


    /*** convertToHours method ***/
    /**
     * This method returns the number of hours from the number of seconds stored in `timePeriodInSeconds`
     * @param timePeriodInSeconds
     * @return number of hours 
     */
    public static double convertToHours(double timePeriodInSeconds){
        // Declare a variable called 'result' of type double
        // Assign to 'result' the value in hours after converting the value in timePeriodInSeconds 
        double result=timePeriodInSeconds/3600;
        return result;
    }

    /*
     * main()
     *
     * Program execution begins with this method.
     */
    public static void main(String[] args) {


        // write a print statment to display the value of the constant "PROGRAM" 
        System.out.println(PROGRAM);



        // declare a variable named "user" of type String 
        String user;


        // declare a Scanner varaible to read the user inputs
        Scanner scnr = new Scanner(System.in);

    
        // Prompt users to enter his/her name and store it in "user"
        // using the Scanner variable you have declared earlier 
        System.out.println("Enter your name: ");
        user = scnr.nextLine();
	
        // write a print statment to display the following 
        // "Hello" and the user's name
        // Example: if the user's name is Ali
        // then the display message is: Hello Ali
        System.out.println("Hello " + user);



        // declare three variables named n1, n2, and n3 of type double
                double n1,n2,n3;

    
        // Prompt users to enter three numbers in n1, n2, and n3
        // using the Scanner variable you have declared earlier 
        System.out.println("Enter three numbers down below: ");
        n1 = scnr.nextInt();
        n2 = scnr.nextInt();
        n3 = scnr.nextInt();

        // declare a variable named ch1 of type char
        char ch1;
	    // and initialize it to any value of your choice
        ch1 = 'F';
        // declare two variables named timePeriodInMinutes and 
         // timePeriodInSeconds, and day of type double
        Double timePeriodInMinutes, timePeriodInSeconds;
         

         //prompet the user to enter number of seconds and minutes separated by space
         // using the Scanner variable you have declared earlier 
        System.out.println("Enter timePeriodInMinutes then timePeriodInSeconds separated by space >> ");
        timePeriodInMinutes = scnr.nextDouble();
        timePeriodInSeconds = scnr.nextDouble();


        /**** Once You Are Done Coding, Un-Comment the following code lines ****/
        /**** That means remove only // ****/

        computeSum (n1, n2, n3);
        computeAverage (n1, n2, n3);
        computeProduct (n1, n2, n3);
        convertCharToAscii (ch1);
        System.out.println ("Converting: "+ timePeriodInMinutes+ " minutes to seconds "+convertToSeconds(timePeriodInMinutes));
        System.out.println ("Converting: "+ timePeriodInSeconds+ " seconds to hours "+convertToHours(timePeriodInSeconds));
              
    }
}
