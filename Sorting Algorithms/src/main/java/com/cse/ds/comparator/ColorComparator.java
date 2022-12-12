package com.cse.ds.comparator;

import com.cse.ds.Comparator;
import java.util.*;

/**
 * Author: Julian Wai San Yan
 * Date: 4/24/19
 * File: ColorComparator.java
 *
 * This file includes a class that implements the Comparator interface to 
 * compare colors, specfically red, white and blue.  
 */

/**
 * This class implements the Comparator interface in order to compare colors,
 * specifically red, white and blue. This class includes a override of the
 * comparison method from the Comparator interface. 
 */

public class ColorComparator<String> implements Comparator<String> {
	
    /**
     * Compares two colors in the order of blue, white, red
     *
     * @param x         first color to compare
     * @param y         second color to compare
     * @param ascending the order of colors to follow
     * @return          whether the colors are in proper order
     */

    @Override
	public boolean comparison(String x, String y, boolean ascending) throws NullPointerException {
        
        if(x == null || y == null) {
            throw new NullPointerException();
        }

        // if ascending is true
        if(ascending == true) {
            // if x is red, return false
            if(x.toString().toLowerCase().equals("red")) {
                return false;
            }
            // if x is blue and y is white, return true
            if(x.toString().toLowerCase().equals("blue") 
                    && (y.toString().toLowerCase().equals("white") || 
                        y.toString().toLowerCase().equals("red"))) {
                return true;
            }
            // if x is white and y is red, return true
            if(x.toString().toLowerCase().equals("white") 
                    && y.toString().toLowerCase().equals("red")) {
                return true;
            }
        }

        // if ascending is false
        if(ascending == false) {
            // if x is blue, return false
            if(x.toString().toLowerCase().equals("blue")) {
                return false;
            }
            // if x is white and y is blue, return true
            if(x.toString().toLowerCase().equals("white") 
                    && y.toString().toLowerCase().equals("blue")) {
                return true;
            }
            // if x is red and y is white, return true
            if(x.toString().toLowerCase().equals("red") 
                    && (y.toString().toLowerCase().equals("white") ||
                        y.toString().toLowerCase().equals("blue"))) {
                return true;
            }
        }
        return false;
    }
}
