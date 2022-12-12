package com.cse.ds.sort;

import com.cse.ds.Comparator;
import com.cse.ds.Sorting;

/**
 * Author: Julian Wai San Yan 
 * Date: 4/24/19
 * File: BubbleSort.java 
 *
 * This file includes a class that implements the Sorting interface and using
 * the Bubble Sort algorithm to sort objects.
 */

/** 
 * This class implements the Sorting interface to sort objects. This class
 * includes an override of the sort method from the Sorting interface and 
 * uses the Bubble Sort algorithm to sort the objects.
 */

public class BubbleSort<T> implements Sorting<T> {
	
	private Comparator<T> comparator;
   
    /**
     * Creates a BubbleSort Object
     *
     * @param comparator comparator object
     * @return           BubbleSort object
     */

	public BubbleSort(Comparator<T> comparator) {
        this.comparator = comparator;
	}
	
    /**
     * Sort through an array
     *
     * @param array     array to sort
     * @param ascending the order to sort
     * @return          void
     */

	@Override
	public void sort(T[] array, boolean ascending) throws NullPointerException {
        
        // if array is null, throw a NullPointer
        if(array == null) {
            throw new NullPointerException();
        }
        
        // use boolean to check if swap has been made
        boolean swapped = false;
        for(int i = 1; i < array.length && swapped == false; i++) {
            swapped = true;
            // loop through the entire array
            for(int j = 0; j < array.length - i; j++) { 
                // compares the values of i and i + 1
                if(comparator.comparison(array[j], array[j + 1], ascending)
                        == false) {
                    // swap if comparison is true
                    swap(array, j, j + 1);
                    swapped = false;
                }
            }
        }
	}

}
