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
import com.cse.ds.sort.CountSort;

public class CountTest {
	
	static CountSort<Integer> CountSortInteger;
    static CountSort<String> CountSortString;
    static CountSort<String> CountSortStringColor;
    static CountSort<String> CountSortStringReverse;

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
        Integer[] orderInteger = new Integer[]{0,1,2,3,4,5,6,7,8,9,10};
        String[] orderString = new String[]{"Apple","Banana","Lime","Mango","Pear"};
        String[] orderReverse = new String[]{"Banana","Apple","Lime","Mango","Pear"};
        String[] orderColor = new String[]{"blue","white","red"};

        Integer[] order = new Integer[]{0,1,2,3,4,5,6,7,8,9};            

		CountSortInteger = new CountSort<>(orderInteger);
        CountSortString = new CountSort<>(orderString);
        CountSortStringReverse = new CountSort<>(orderReverse);
        CountSortStringColor = new CountSort<>(orderColor);
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
        oneS = new String[]{"Apple"};
        twoS = new String[]{"Banana","Apple"};

        emptySR = new String[]{};
        oneSR = new String[]{"Apple"};
        twoSR = new String[]{"Banana","Apple"};

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
        
        arr1Color = new String[]{"red","red","white","blue"};
        arr1ColorR = new String[]{"blue","white","red","red"}; 
    }


    /*// tests CountSort for Integers, ascending is true, empty array
    @Test
    public void testCountIntegerEmpty() {
    	CountSortInteger.sort(empty, true);
    	Assert.assertArrayEquals(empty, emptyR);
    }

    // tests CountSort for Integers, ascending is true, one in array
    @Test
    public void testCountIntegerOne() {
    	CountSortInteger.sort(one, true);
    	Assert.assertArrayEquals(one, oneR);
    }

    // tests CountSort for Integers, ascending is true, two in array
    @Test
    public void testCountIntegerTwo() {
    	CountSortInteger.sort(two, true);
    	Assert.assertArrayEquals(two, twoR);
    }

    // tests CountSort for Integers, ascending is true
    @Test
    public void testCountIntegerTrue() {
    	CountSortInteger.sort(arr1, true);
    	Assert.assertArrayEquals(arr1r, arr1);
    }

    // tests CountSort for Integers, ascending is false    
    @Test
    public void testCountIntegerFalse() {
        Integer[] arr1Sort = new Integer[]{10,8,7,7,6,6,5,5,5,5,4,3,3,2,2};
    	CountSortInteger.sort(arr1, false);
    	Assert.assertArrayEquals(arr1Sort, arr1);
    }

    // tests CountSort for Strings, ascending is true, empty array
    @Test
    public void testCountStringEmpty() {
    	CountSortString.sort(emptyS, true);
    	Assert.assertArrayEquals(emptyS, emptySR);
    }

    // tests CountSort for Strings, ascending is true, one in array
    @Test
    public void testCountStringOne() {
    	CountSortString.sort(oneS, true);
    	Assert.assertArrayEquals(oneS, oneSR);
    }

    // tests CountSort for Strings, ascending is true, two in array
    @Test
    public void testCountStringTwo() {
        String[] twoSRR = new String[]{"Apple","Banana"};
    	CountSortString.sort(twoS, true);
    	Assert.assertArrayEquals(twoS, twoSRR);
    }

    // tests CountSort for Strings, ascending is true
    @Test
    public void testCountStringTrue() {
    	CountSortString.sort(string1, true);
    	Assert.assertArrayEquals(string1, string1R);
    }
    
    // tests CountSort for Strings, ascending is false
    @Test
    public void testCountStringFalse() {
        String[] stringArraySort = new String[]{"Pear","Mango","Lime","Lime","Banana","Apple","Apple"};

    	CountSortString.sort(string1, false);
    	Assert.assertArrayEquals(string1, stringArraySort);
    }

    // tests CountSort for reverseStrings, ascending is true, empty array
    @Test
    public void testCountStringReverseEmpty() {
    	CountSortStringReverse.sort(emptyS, true);
    	Assert.assertArrayEquals(emptyS, emptySR);
    }

    // tests CountSort for reverseStrings, ascending is true, one in array
    @Test
    public void testCountStringReverseOne() {
    	CountSortStringReverse.sort(oneS, true);
    	Assert.assertArrayEquals(oneS, oneSR);
    }

    // tests CountSort for reverseStrings, ascending is true, two in array
    @Test
    public void testCountStringReverseTwo() {
    	CountSortStringReverse.sort(twoS, true);
    	Assert.assertArrayEquals(twoS, twoSR);
    }

    // tests CountSort for reverseStrings, ascending is true
    @Test
    public void testCountStringReverseTrue() {
        String[] stringArraySort = new String[]{"Banana","Apple","Apple","Lime","Lime","Mango","Pear"};
    	CountSortStringReverse.sort(string1, true);
    	Assert.assertArrayEquals(string1, stringArraySort);
    }

    // tests CountSort for reverseStrings, ascending is true
    @Test
    public void testCountStringReverseFalse() {
        String[] stringArraySort = new String[]{"Pear","Mango","Lime","Lime","Apple","Apple","Banana"};
    	CountSortStringReverse.sort(string1, false);
    	Assert.assertArrayEquals(string1, stringArraySort);
    }
    
    // tests CountSort for Color, ascending is true, empty array
    @Test
    public void testCountColorEmpty() {
    	CountSortStringColor.sort(emptyC, true);
    	Assert.assertArrayEquals(emptyC, emptyCR);
    }

    // tests CountSort for Color, ascending is true, one in array
    @Test
    public void testCountColorOne() {
    	CountSortStringColor.sort(oneC, true);
    	Assert.assertArrayEquals(oneC, oneCR);
    }

    // tests CountSort for Color, ascending is true, two in array
    @Test
    public void testCountColorTwo() {
    	CountSortStringColor.sort(twoC, true);
    	Assert.assertArrayEquals(twoC, twoCR);
    }

    // tests CountSort for Color, ascending is true
    @Test
    public void testCountColorTrue() {
    	CountSortStringColor.sort(arr1Color, true);
   	    Assert.assertArrayEquals(arr1Color, arr1ColorR);
    }

    // tests CountSort for Color,ascending is false
    @Test
    public void testCountColorFalse() {
        String[] arr1ColorRR = new String[]{"red","red","white","blue"};
    	CountSortStringColor.sort(arr1Color, false);
      	Assert.assertArrayEquals(arr1Color, arr1ColorRR);
    }*/
}
