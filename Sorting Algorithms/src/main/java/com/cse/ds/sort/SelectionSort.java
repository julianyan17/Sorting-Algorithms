package com.cse.ds.sort;

import com.cse.ds.Comparator;
import com.cse.ds.Sorting;

/**
 * Author: Julian Wai San Yan 
 * Date: 4/24/19
 * File: SelectionSort.java 
 *
 * This file includes a class that implements the Sorting interface and using
 * the Selection Sort algorithm to sort objects.
 */

/** 
 * This class implements the Sorting interface to sort objects. This class
 * includes an override of the sort method from the Sorting interface and 
 * uses the Selection Sort algorithm to sort the objects.
 */

public class SelectionSort<T> implements Sorting<T> {
	
	private Comparator<T> comparator;
	
    /**
     * Creates a SelectionSort Object
     *
     * @param comparator comparator object
     * @return           SelectionSort object
     */

	public SelectionSort(Comparator<T> comparator) {
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
        
        // get the initial value
		for(int i = 0; i < array.length - 1; i++) {
            T mini = array[i];
            int minIndex = i;
            // loop through the values after i
            for(int j = i + 1; j < array.length; j++) {
                // compare the values 
                if (comparator.comparison(mini, array[j], ascending) 
                        == false) {
                    // change mini and minIndex if comparison is true
                    mini = array[j];
                    minIndex = j;
                }
            }
            // swap the values
            swap(array, i, minIndex);
        }
	}
}
