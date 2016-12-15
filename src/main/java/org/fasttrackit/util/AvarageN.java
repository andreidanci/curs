package org.fasttrackit.util;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Diana on 12/13/2016.
 */


public class AvarageN {

    public static void main(String[] args) {

        DecimalFormat df2 = new DecimalFormat(".##");
        // create a scanner so we can read the command-line input
        Scanner scanner = new Scanner(System.in);

        //  prompt for the user's name
        System.out.print("n: ");

        // get their input as a String
        int n = scanner.nextInt();

        double sum = 0;


        for (int i = 1; i <= n; i++) {

            System.out.print("Numarul " + i + " este = ");
            double numar = scanner.nextDouble();
            sum = sum + numar;

        }


        double avrg = sum / n;

        System.out.println("Media aritmetica este " + df2.format(avrg));

        // prompt for their age

        // get the age as an int
        int secondNumber = scanner.nextInt();


    }


}





