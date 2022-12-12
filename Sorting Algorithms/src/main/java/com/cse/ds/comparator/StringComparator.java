package com.cse.ds.comparator;

import com.cse.ds.Comparator;
import java.util.*;

/**
 * Author: Julian Wai San Yan
 * Date: 4/24/19
 * File: StringComparator.java
 *
 * This file includes a class that implements the Comparator interface to 
 * compare Strings based on their unicode.
 */

/**
 * This class implements the Comparator interface in order to compare Strings 
 * based on their unicode. This class includes a override of the comparison 
 * method from the Comparator interface. 
 */

public class StringComparator implements Comparator<String> {

    /**
     * Compares two String in the order of the unicodes
     *
     * @param x         first String to compare
     * @param y         second String to compare
     * @param ascending the order of Strings to follow
     * @return          whether the Strings are in proper order
     */

	@Override
	public boolean comparison(String x, String y, boolean ascending)
        throws NullPointerException {

        if(x == null || y == null) {
            throw new NullPointerException();
        }

        // if ascending is true
        if(ascending == true) {
            // if the comparison between x and y is less than 0, return true
            if(x.compareTo(y) < 0) {
                return true;
            }
            else {
                return false;
            }
        }
        if(ascending == false) {
            // if the comparison between x and y is greater than 0, return true
            if(x.compareTo(y) > 0) {
                return true;
            }
            else {
                return false;
            }
        }
		return false;
	}
}
