package com.cse.ds.sort;

import com.cse.ds.Sorting;

/**
 * Author: Julian Wai San Yan 
 * Date: 4/24/19
 * File: CountSort.java 
 *
 * This file includes a class that implements the Sorting interface and using
 * the Count Sort algorithm to sort objects.
 */

/** 
 * This class implements the Sorting interface to sort objects. This class
 * includes an override of the sort method from the Sorting interface and 
 * uses the Count Sort algorithm to sort the objects.
 */
public class CountSort<T> implements Sorting<T> {
	
	private T[] order;
	
    /**
     * Creates a CountSort Object
     *
     * @param order order object
     * @return      CountSort object
     */
    
	public CountSort(T[] order) {
	    this.order = order;
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
       
        // if element in array is null, throw a NullPointer
        for(int i = 0; i < array.length; i++) {
            if(array[i] == null) {
                throw new NullPointerException();
            }
        }

        // initialize count array
        int[] count = new int[this.order.length];
        for(int i = 0; i < this.order.length; i++) {
            count[i] = 0;
        }
        
        // increment the count of each element in the array
        for(int i = 0; i < count.length; i++) {
            for(int j = 0; j < array.length; j++) {
                if(array[j].equals(order[i])) {
                    count[i]++;
                }
             }
        }
        
        // if ascending is true, add the elements from the beginning of the
        // array
        if(ascending == true) { 
            int index = 0;
            for(int i = 0; i < order.length; i++) {
                for(int j = 0; j < count[i]; j++) {
                    array[index] = order[i];
                    index++;
                }                
            }
        }
        
        // if ascending is false, add the elements from the end of the array
        if(ascending == false) {
            int index = array.length - 1;
            for(int i = 0; i < order.length; i++) {
                for(int j = 0; j < count[i]; j++) {
                    array[index] = order[i];
                    index--;
                }
            }
        }
    }
}
