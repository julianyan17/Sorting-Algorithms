package com.cse.ds.sort;

import com.cse.ds.Comparator;
import com.cse.ds.Sorting;
import java.util.*;

/**
 * Author: Julian Wai San Yan 
 * Date: 4/24/19
 * File: MergeSort.java 
 *
 * This file includes a class that implements the Sorting interface and using
 * the Merge Sort algorithm to sort objects.
 */

/** 
 * This class implements the Sorting interface to sort objects. This class
 * includes an override of the sort method from the Sorting interface and 
 * uses the Merge Sort algorithm to sort the objects.
 */
public class MergeSort<T> implements Sorting<T> {

	private Comparator<T> comparator;
    
    static final int TWO = 2;
    
    /**
     * Creates a MergeSort Object
     *
     * @param comparator comparator object
     * @return           MergeSort object
     */
    
	public MergeSort(Comparator<T> comparator) {
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

        mergeSort(array, 0, array.length - 1, ascending);

	}

    /**
     * Helper method to recursively sort the array
     * 
     * @param array     to sort
     * @param left      left index
     * @param right     right index
     * @param ascending the order to sort
     * @return          none
     */

    private void mergeSort(T[] array, int left, int right, boolean ascending) {
        if(left < right) {
            int mid = (left + right) / TWO;

            // sort the left side of the array
            mergeSort(array, left, mid, ascending);
            // sort the right side of the array
            mergeSort(array, mid + 1, right, ascending);
            // combine both arrays
            merge(array, left, mid, right, ascending);
        }
    }
    
    /**
     * Helper method to sort the array
     *
     * @param array     array to sort
     * @param left      left index 
     * @param mid       middle index
     * @param right     right index
     * @param ascending the order to sort 
     * @return          none
     */

    private void merge(T[] array, int left, int mid, int right, 
            boolean ascending) {
        // create the temp array 
        T[] tempArray = (T[])(new Object[right - left + 1]);

        // assign the left and right indexes
        int leftHalfIndex = left;
        int rightHalfIndex = mid + 1;
        int index = 0;

        // copy the smallest values from either the left or the right side back
        // to the original array
        while(leftHalfIndex <= mid && rightHalfIndex <= right) {
            if(comparator.comparison(array[leftHalfIndex], 
                        array[rightHalfIndex], ascending) == false) {
                tempArray[index] = array[rightHalfIndex];
                rightHalfIndex++;
                index++;
            }
            else {
                tempArray[index] = array[leftHalfIndex];
                leftHalfIndex++;
                index++;
            }
        }

        // add any elements missing to the left
        while(leftHalfIndex <= mid) {
                tempArray[index] = array[leftHalfIndex];
                leftHalfIndex++;
                index++;
        }

        // add any elements missing to the right
        while(rightHalfIndex <= right) {
                tempArray[index] = array[rightHalfIndex];
                rightHalfIndex++;
                index++;
        }

        // copy from temp to original
        for(int i = 0; i < tempArray.length; i++) {
            array[left + i] = tempArray[i];
        }
    }
}
