package org.fasttrackit.util;

import java.io.Console;
import java.util.Scanner;

/**
 * @author flo
 * @since 08/12/2016.
 */
public class SuccessiveAddition {
    public static void main(String[] a) {

        // create a scanner so we can read the command-line input
        Scanner scanner = new Scanner(System.in);

        //  prompt for the user's name
        System.out.print("Enter first number: ");

        // get their input as a String
        int firstNumber = scanner.nextInt();

        // prompt for their age
        System.out.print("Enter second number: ");

        // get the age as an int
        int secondNumber = scanner.nextInt();
        int sum = 0;


        for (int i=0; i< secondNumber; i++ ){

            sum = sum + firstNumber;

        }


        System.out.println(String.format("sum is : %d", sum));

    }

}
