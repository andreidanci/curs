package org.fasttrackit.util;

import org.apache.commons.collections.bag.SynchronizedSortedBag;

/**
 * Created by Diana on 12/13/2016.
 */
public class FtoC {

    public static void main(String[] args) {

        float fahrenheit = 180;
        float celsius = 5 / 9 * (fahrenheit - 32);

        System.out.println("Temperatura in celsius este " + celsius);


    }

}
