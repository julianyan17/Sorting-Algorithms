package com.cse.ds;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cse.ds.comparator.IntegerComparator;
import com.cse.ds.comparator.ColorComparator;
import com.cse.ds.comparator.StringComparator;
import com.cse.ds.comparator.StringComparatorReverse;
import com.cse.ds.sort.MergeSort;
import com.cse.ds.sort.BubbleSort;
import com.cse.ds.sort.CountSort;
import com.cse.ds.sort.SelectionSort;

/**
 * 
 * @author harsh
 *
 */
public class GenericTest {
	
	static BubbleSort<Integer> bubbleSortInteger;
    static BubbleSort<String> bubbleSortString;
	static SelectionSort<Integer> selectionSortInteger;
    static SelectionSort<String> selectionSortString;
    static SelectionSort<String> selectionSortStringColor;
    static SelectionSort<String> selectionSortStringReverse;
    static MergeSort<Integer> mergeSortInteger;
    static MergeSort<String> mergeSortColor;

	static CountSort<Integer> countSortInteger;
    static CountSort<Integer> countSortInteger1;
	
	Integer arr1[], arr1r[];// = new Integer[10];
	Integer arr2[], arr2r[];

    String arr1String[], arr1StringSort[];
    String arr1Color[], arr1ColorSort[];

    Integer arr[];
    MergeSort<Integer> sorting;

    Integer empty[];
    Integer one[];
    Integer two[];
   
    Integer emptyR[];
    Integer oneR[];
    Integer twoR[];

    String emptyS[];
    String oneS[];
    String twoS[];

    String emptySR[];
    String oneSR[];
    String twoSR[];

	
	@BeforeClass
    public static void setUpBeforeClass() {
		Integer order[] = {0,1,2};
        Integer order1[] = {0,1};
		
		bubbleSortInteger = new BubbleSort<>(new IntegerComparator());
        bubbleSortString = new BubbleSort<>(new StringComparator());
		selectionSortInteger = new SelectionSort<>(new IntegerComparator());
        selectionSortString = new SelectionSort<>(new StringComparator());
        selectionSortStringReverse = new SelectionSort<>(new StringComparatorReverse());
        selectionSortStringColor = new SelectionSort<>(new ColorComparator()); 
        mergeSortInteger = new MergeSort<>(new IntegerComparator());
        mergeSortColor = new MergeSort<>(new ColorComparator());
		countSortInteger = new CountSort<>(order);
        countSortInteger1 = new CountSort<>(order1);
    }
	
    @Before
    public void populatePlayList(){
        empty = new Integer[]{};
        one = new Integer[]{1};
        two = new Integer[]{2,1};
        
        emptyR = new Integer[]{};
        oneR = new Integer[]{1};
        twoR = new Integer[]{1,2};

        emptyS = new String[]{};
        oneS = new String[]{"hi"};
        twoS = new String[]{"hi","bye"};

        emptySR = new String[]{};
        oneSR = new String[]{"hi"};
        twoSR = new String[]{"bye","hi"};


    	arr1 = new Integer[]{5,6,7,3,2,4,5,5,5,3,2,6,7,8,10};
		arr2 = new Integer[]{1,2,0,1,0,2};
		arr1r = new Integer[]{2,2,3,3,4,5,5,5,5,6,6,7,7,8,10};
		arr2r = new Integer[]{2,2,1,1,0,0};
        arr = new Integer[]{0,1,0,1,0,1,0,1,0,1,0,1};

        arr1String = new String[]{"hello","goodbye","bye","apple"};
        arr1StringSort = new String[]{"apple","bye","goodbye","hello"};

        arr1Color = new String[]{"red","white","blue"};
        arr1ColorSort = new String[]{"blue","white","red"};
    }
    
    // tests SelectionSort for Integers, ascending is true, empty array
    @Test
    public void testSelectionIntegerEmpty() {
    	selectionSortInteger.sort(empty, true);
    	Assert.assertArrayEquals(empty, emptyR);
    }

    // tests SelectionSort for Integers, ascending is true, one in array
    @Test
    public void testSelectionIntegerOne() {
    	selectionSortInteger.sort(one, true);
    	Assert.assertArrayEquals(one, oneR);
    }

    // tests SelectionSort for Integers, ascending is true, two in array
    @Test
    public void testSelectionIntegerTwo() {
    	selectionSortInteger.sort(two, true);
    	Assert.assertArrayEquals(two, twoR);
    }

    // tests SelectionSort for Integers, ascending is true
    @Test
    public void testSelectionIntegerTrue() {
    	selectionSortInteger.sort(arr1, true);
    	Assert.assertArrayEquals(arr1r, arr1);
    }

    // tests SelectionSort for Integers, ascending is false    
    @Test
    public void testSelectionIntegerFalse() {
        Integer[] arr1Sort = new Integer[]{10,8,7,7,6,6,5,5,5,5,4,3,3,2,2};
    	selectionSortInteger.sort(arr1, false);
    	Assert.assertArrayEquals(arr1Sort, arr1);
    }

    // tests SelectionSort for Strings, ascending is true, empty array
    @Test
    public void testSelectionStringEmpty() {
    	selectionSortString.sort(emptyS, true);
    	Assert.assertArrayEquals(emptyS, emptySR);
    }

    // tests SelectionSort for Strings, ascending is true, one in array
    @Test
    public void testSelectionStringOne() {
    	selectionSortString.sort(oneS, true);
    	Assert.assertArrayEquals(oneS, oneSR);
    }

    // tests SelectionSort for Strings, ascending is true, two in array
    @Test
    public void testSelectionStringTwo() {
    	selectionSortString.sort(twoS, true);
    	Assert.assertArrayEquals(twoS, twoSR);
    }

    // tests SelectionSort for Strings, ascending is true
    @Test
    public void testSelectionStringTrue() {
    	selectionSortString.sort(arr1String, true);
    	Assert.assertArrayEquals(arr1String, arr1StringSort);
    }

    // tests SelectionSort for Strings, ascending is false
    @Test
    public void testSelectionStringFalse() {
        String[] stringArraySort = new String[]{"hello","goodbye","bye",
            "apple"};

    	selectionSortString.sort(arr1String, false);
    	Assert.assertArrayEquals(arr1String, stringArraySort);
    }

    /*// tests SelectionSort for reverseStrings, ascending is true, empty array
    @Test
    public void testSelectionStringReverseEmpty() {
    	selectionSortStringReverse.sort(emptyS, true);
    	Assert.assertArrayEquals(emptyS, emptySR);
    }

    // tests SelectionSort for reverseStrings, ascending is true, one in array
    @Test
    public void testSelectionStringReverseOne() {
        String[] oneSRR = new String[]{"hi"};
    	selectionSortStringReverse.sort(oneS, true);
    	Assert.assertArrayEquals(oneS, oneSRR);
    }

    // tests SelectionSort for reverseStrings, ascending is true, two in array
    @Test
    public void testSelectionStringReverseTwo() {
        String[] twoSRR = new String[]{"bye", "hi"};
    	selectionSortStringReverse.sort(twoS, true);
    	Assert.assertArrayEquals(twoS, twoSRR);
    }

    // tests SelectionSort for reverseStrings, ascending is true
    @Test
    public void testSelectionStringReverseTrue() {
        String[] stringArraySort = new String[]{"apple","bye","goodbye",
            "hello"};
    	selectionSortStringReverse.sort(arr1String, true);
    	Assert.assertArrayEquals(arr1String, stringArraySort);
    }*/

   /* // tests SelectionSort for reverseStrings, ascending is false
    @Test
    public void testSelectionStringReverseFalse() {
        String[] stringArraySort = new String[]{"hello","goodbye","bye",
            "apple"};
    	selectionSortStringReverse.sort(arr1String, false);
        System.out.println(Arrays.toString(arr1String));
        System.out.println(Arrays.toString(stringArraySort));
        Assert.assertArrayEquals(arr1String, stringArraySort);
    }*/

    // tests SelectionSort for Color, ascending is true
    @Test
    public void testSelectionColorTrue() {
    	selectionSortStringColor.sort(arr1Color, true);
   	    Assert.assertArrayEquals(arr1Color, arr1ColorSort);
    }

    // tests SelectionSort for Color,  2, 2,ascending is false
    @Test
    public void testSelectionColorFalse() {
    	selectionSortStringColor.sort(arr1ColorSort, false);
      	Assert.assertArrayEquals(arr1Color, arr1ColorSort);
    }

    // tests BubbleSort for Integer, ascending is true
    @Test
    public void testBubbleIntegerTrue(){
    	bubbleSortInteger.sort(arr1, true);
    	Assert.assertArrayEquals(arr1r, arr1);
    }
    
    // tests BubbleSort for Integer, ascending is false
    @Test
    public void testBubbleIntegerFalse() {
        Integer[] arr1Sort = new Integer[]{10,8,7,7,6,6,5,5,5,5,4,3,3,2,2};
    	bubbleSortInteger.sort(arr1, false);
    	Assert.assertArrayEquals(arr1Sort, arr1);
    }
    
    // tests BubbleSort for String, ascending is true
    @Test
    public void testBubbleStringTrue() {

    	bubbleSortString.sort(arr1String, true);
    	Assert.assertArrayEquals(arr1String, arr1StringSort);
    }

    // tests BubbleSort for String, ascending is false
    @Test
    public void testBubbleStringFalse() {
        String[] stringArraySort = new String[]{"hello","goodbye","bye",
            "apple"};

    	bubbleSortString.sort(arr1String, false);
    	Assert.assertArrayEquals(arr1String, stringArraySort);
    }

    @Test
    public void testBubbleStringReverseTrue() {
        String[] stringArraySort = new String[]{"apple","bye","goodbye",
            "hello"};
    	bubbleSortString.sort(arr1String, true);
    	Assert.assertArrayEquals(arr1String, stringArraySort);
    }

    @Test
    public void testBubbleStringReverseFalse() {
        String[] stringArraySort = new String[]{"hello","goodbye","bye",
            "apple"};

    	bubbleSortString.sort(arr1String, false);
    	Assert.assertArrayEquals(arr1String, stringArraySort);
    }

    @Test
    public void testMergeIntegerTrue() {
    	mergeSortInteger.sort(arr1, true);
    	Assert.assertArrayEquals(arr1r, arr1);
    }

    @Test
    public void testMergeIntegerFalse() {
        Integer[] arr1Sort = new Integer[]{10,8,7,7,6,6,5,5,5,5,4,3,3,2,2};

    	mergeSortInteger.sort(arr1, false);
    	Assert.assertArrayEquals(arr1Sort, arr1);
    }


    @Test
    public void testMergeColorTrue() {

    	mergeSortColor.sort(arr1Color, true);
    	Assert.assertArrayEquals(arr1Color, arr1ColorSort);
    }
    
    @Test
    public void testCountIntegerFalse() {

    	countSortInteger.sort(arr2, false);
    	Assert.assertArrayEquals(arr2r, arr2);
    }

    @Test
    public void testCountIntegerTrue() {   
        Integer[] integerSortArray = new Integer[] {1,1,1,1,1,1,0,0,0,0,0,0};

    	countSortInteger1.sort(arr, false);
     	Assert.assertArrayEquals(integerSortArray, arr);
    }  
}
