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

public class MergeTest {
	
	static MergeSort<Integer> MergeSortInteger;
    static MergeSort<String> MergeSortString;
    static MergeSort<String> MergeSortStringColor;
    static MergeSort<String> MergeSortStringReverse;

    Integer arr1[], arr1r[];// = new Integer[10];
	Integer arr2[], arr2r[];

    String string1[], string1R[];
    String arr1Color[], arr1ColorR[];

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

    String emptyC[];
    String oneC[];
    String twoC[];

    String emptyCR[];
    String oneCR[];
    String twoCR[];

    Integer tester[];

	@BeforeClass
    public static void setUpBeforeClass() {		
		MergeSortInteger = new MergeSort<>(new IntegerComparator());
        MergeSortString = new MergeSort<>(new StringComparator());
        MergeSortStringReverse = new MergeSort<>(new StringComparatorReverse());
        MergeSortStringColor = new MergeSort<>(new ColorComparator());
     }

    @Before
    public void populatePlayList() {
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

        emptyC = new String[]{};
        oneC = new String[]{"white"};
        twoC = new String[]{"red","blue"};

        emptyCR = new String[]{};
        oneCR = new String[]{"white"};
        twoCR = new String[]{"blue","red"};


    	arr1 = new Integer[]{5,6,7,3,2,4,5,5,5,3,2,6,7,8,10};
		arr2 = new Integer[]{1,2,0,1,0,2};
		arr1r = new Integer[]{2,2,3,3,4,5,5,5,5,6,6,7,7,8,10};
		arr2r = new Integer[]{2,2,1,1,0,0};

        string1 = new String[]{"Mango","Apple","Apple","Lime","Banana","Lime","Pear"};
        string1R = new String[]{"Apple","Apple","Banana","Lime","Lime","Mango","Pear"};
        
        arr1Color = new String[]{"red","RED","white","blue"};
        arr1ColorR = new String[]{"blue","white","RED","red"}; 

    }


    /*// tests MergeSort for Integers, ascending is true, empty array
    @Test
    public void testMergeIntegerEmpty() {
    	MergeSortInteger.sort(empty, true);
    	Assert.assertArrayEquals(empty, emptyR);
    }

    // tests MergeSort for Integers, ascending is true, one in array
    @Test
    public void testMergeIntegerOne() {
    	MergeSortInteger.sort(one, true);
    	Assert.assertArrayEquals(one, oneR);
    }

    // tests MergeSort for Integers, ascending is true, two in array
    @Test
    public void testMergeIntegerTwo() {
    	MergeSortInteger.sort(two, true);
    	Assert.assertArrayEquals(two, twoR);
    }

    // tests MergeSort for Integers, ascending is true
    @Test
    public void testMergeIntegerTrue() {
    	MergeSortInteger.sort(arr1, true);
    	Assert.assertArrayEquals(arr1r, arr1);
    }

    // tests MergeSort for Integers, ascending is false    
    @Test
    public void testMergeIntegerFalse() {
        Integer[] arr1Sort = new Integer[]{10,8,7,7,6,6,5,5,5,5,4,3,3,2,2};
    	MergeSortInteger.sort(arr1, false);
    	Assert.assertArrayEquals(arr1Sort, arr1);
    }

    // tests MergeSort for Strings, ascending is true, empty array
    @Test
    public void testMergeStringEmpty() {
    	MergeSortString.sort(emptyS, true);
    	Assert.assertArrayEquals(emptyS, emptySR);
    }

    // tests MergeSort for Strings, ascending is true, one in array
    @Test
    public void testMergeStringOne() {
    	MergeSortString.sort(oneS, true);
    	Assert.assertArrayEquals(oneS, oneSR);
    }

    // tests MergeSort for Strings, ascending is true, two in array
    @Test
    public void testMergeStringTwo() {
    	MergeSortString.sort(twoS, true);
    	Assert.assertArrayEquals(twoS, twoSR);
    }

    // tests MergeSort for Strings, ascending is true
    @Test
    public void testMergeStringTrue() {
    	MergeSortString.sort(string1, true);
    	Assert.assertArrayEquals(string1, string1R);
    }
    
    // tests MergeSort for Strings, ascending is false
    @Test
    public void testMergeStringFalse() {
        String[] stringArraySort = new String[]{"Pear","Mango","Lime","Lime","Banana","Apple","Apple"};
    	MergeSortString.sort(string1, false);
    	Assert.assertArrayEquals(string1, stringArraySort);
    }

    // tests MergeSort for reverseStrings, ascending is true, empty array
    @Test
    public void testMergeStringReverseEmpty() {
    	MergeSortStringReverse.sort(emptyS, true);
    	Assert.assertArrayEquals(emptyS, emptySR);
    }

    // tests MergeSort for reverseStrings, ascending is true, one in array
    @Test
    public void testMergeStringReverseOne() {
    	MergeSortStringReverse.sort(oneS, true);
    	Assert.assertArrayEquals(oneS, oneSR);
    }

    // tests MergeSort for reverseStrings, ascending is true, two in array
    @Test
    public void testMergeStringReverseTwo() {
    	MergeSortStringReverse.sort(twoS, true);
    	Assert.assertArrayEquals(twoS, twoSR);
    }

    // tests MergeSort for reverseStrings, ascending is true
    @Test
    public void testMergeStringReverseTrue() {
        String[] stringArraySort = new String[]{"Banana","Apple","Apple","Lime","Lime","Mango","Pear"};
    	MergeSortStringReverse.sort(string1, true);
    	Assert.assertArrayEquals(string1, stringArraySort);
    }

    // tests MergeSort for reverseStrings, ascending is true
    @Test
    public void testMergeStringReverseFalse() {
        String[] stringArraySort = new String[]{"Pear","Mango","Lime","Lime","Apple","Apple","Banana"};
    	MergeSortStringReverse.sort(string1, false);
    	Assert.assertArrayEquals(string1, stringArraySort);
    }
    
    // tests MergeSort for Color, ascending is true, empty array
    @Test
    public void testMergeColorEmpty() {
    	MergeSortStringColor.sort(emptyC, true);
    	Assert.assertArrayEquals(emptyC, emptyCR);
    }

    // tests MergeSort for Color, ascending is true, one in array
    @Test
    public void testMergeColorOne() {
    	MergeSortStringColor.sort(oneC, true);
    	Assert.assertArrayEquals(oneC, oneCR);
    }

    // tests MergeSort for Color, ascending is true, two in array
    @Test
    public void testMergeColorTwo() {
    	MergeSortStringColor.sort(twoC, true);
    	Assert.assertArrayEquals(twoC, twoCR);
    }

    // tests MergeSort for Color, ascending is true
    @Test
    public void testMergeColorTrue() {
    	MergeSortStringColor.sort(arr1Color, true);
   	    Assert.assertArrayEquals(arr1Color, arr1ColorR);
    }

    // tests MergeSort for Color,ascending is false
    @Test
    public void testMergeColorFalse() {
        String[] arr1ColorRR = new String[]{"RED","red","white","blue"};
    	MergeSortStringColor.sort(arr1Color, false);
      	Assert.assertArrayEquals(arr1Color, arr1ColorRR);
    }*/
}
