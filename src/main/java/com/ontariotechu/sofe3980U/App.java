package com.ontariotechu.sofe3980U;

import org.joda.time.LocalTime;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
	/**
	* Main program:  The entry point of the program. The local time will be printed first,
	*      Then it will create two binary variables, add them and print the result.
	*
	* @param args: not used
	*/
    public static void main( String[] args )
    {
    	LocalTime currentTime = new LocalTime();
        System.out.println("The current local time is: " + currentTime);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first binary number: ");
        String binary1Input = scanner.nextLine();
        Binary binary1 = new Binary(binary1Input);

        System.out.print("Enter the second binary number: ");
        String binary2Input = scanner.nextLine();
        Binary binary2 = new Binary(binary2Input);

        Binary sum = Binary.add(binary1, binary2);
        System.out.println("Summation: " + sum.getValue());

        Binary orResult = Binary.or(binary1, binary2);
        System.out.println("Bitwise OR: " + orResult.getValue());

        Binary andResult = Binary.and(binary1, binary2);
        System.out.println("Bitwise AND: " + andResult.getValue());

        Binary multiplyResult = Binary.multiply(binary1, binary2);
        System.out.println("Multiplication: " + multiplyResult.getValue());
    }
}
