package com.cse.ds.comparator;

import com.cse.ds.Comparator;
import java.util.*;

/**
 * Author: Julian Wai San Yan
 * Date: 4/24/19
 * File: IntegerComparator.java
 *
 * This file includes a class that implements the Comparator interface to 
 * compare Integers.
 */

/**
 * This class implements the Comparator interface in order to compare Integers.
 * This class includes a override of the comparison method from the Comparator
 * interface. 
 */

public class IntegerComparator implements Comparator<Integer> {

    /**
     * Compares two colors in the order of blue, white, red
     *
     * @param x         first Integer to compare
     * @param y         second Integer to compare
     * @param ascending the order of Integers to follow
     * @return          whether the Integers are in proper order
     */

	@Override
	public boolean comparison(Integer x, Integer y, boolean ascending) 
        throws NullPointerException {
        
        if(x == null || y == null) {
            throw new NullPointerException();
        }

        // if ascending is true
        if(ascending == true) {
            // if x is less than y, return true
            if(x < y) {
                return true;
            }
            else {
                return false;
            }
        }

        // if ascending is false
        if(ascending == false) {
            // if x is greater than y, return true
            if(x > y) {
                return true;
            }
            else {
                return false;
            }
        }
		return false;
	}
}
