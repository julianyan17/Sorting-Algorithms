package com.cse.ds.comparator;

import com.cse.ds.Comparator;
import java.util.*;

/**
 * Author: Julian Wai San Yan 
 * Date: 4/24/19
 * File: StringComparatorReverse.java 
 *
 * This file includes a class that implements the Comparator interface to 
 * compare Strings that are reversed based on their unicode.
 */

/**
 * This class implements the Comparator interface in order to compare Strings
 * that are reversed based on their unicode. This class includes a override of 
 * the comparison method from the Comparator interface. 
 */
 
public class StringComparatorReverse implements Comparator<String> {

    /**
     * Compares two String in the order of the unicodes
     *
     * @param x         first String to compare
     * @param y         second String to compare
     * @param ascending the order of Strings to follow
     * @return          whether the Strings are in proper order
     */

	@Override
	public boolean comparison(String x1, String y1, boolean ascending)
        throws NullPointerException {
        
        if(x1 == null || y1 == null) {
            throw new NullPointerException();
        }

        // create new StringBuilders
        StringBuilder xReverse = new StringBuilder();
        StringBuilder yReverse = new StringBuilder();
        
        // reverse x1
        xReverse.append(x1);
        xReverse = xReverse.reverse();
        String xComparison = xReverse.toString();

        // reverse y1
        yReverse.append(y1);
        yReverse = yReverse.reverse();
        String yComparison = yReverse.toString();
        
        // if ascending is true
        if(ascending == true) {
            // if the comparison between x and y is less than 0, return true
            if(xComparison.compareTo(yComparison) < 0) {
                return true;
            }
            else {
                return false;
            }
        }

        // if ascending is false
        if(ascending == false) {
            // if the comparison between x and y is greater than 0, return false            
            if(xComparison.compareTo(yComparison) > 0) {
                return true;
            }
            else {
                return false;
            }
        }
		return false;
	}
}
