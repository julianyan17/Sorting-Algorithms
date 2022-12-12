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
import com.cse.ds.sort.BubbleSort;

public class BubbleTest {
	
	static BubbleSort<Integer> BubbleSortInteger;
    static BubbleSort<String> BubbleSortString;
    static BubbleSort<String> BubbleSortStringColor;
    static BubbleSort<String> BubbleSortStringReverse;

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

	@BeforeClass
    public static void setUpBeforeClass() {		
		BubbleSortInteger = new BubbleSort<>(new IntegerComparator());
        BubbleSortString = new BubbleSort<>(new StringComparator());
        BubbleSortStringReverse = new BubbleSort<>(new StringComparatorReverse());
        BubbleSortStringColor = new BubbleSort<>(new ColorComparator());
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

    // tests BubbleSort for Integers, ascending is true, empty array
    @Test
    public void testBubbleIntegerEmpty() {
    	BubbleSortInteger.sort(empty, true);
    	Assert.assertArrayEquals(empty, emptyR);
    }

    // tests BubbleSort for Integers, ascending is true, one in array
    @Test
    public void testBubbleIntegerOne() {
    	BubbleSortInteger.sort(one, true);
    	Assert.assertArrayEquals(one, oneR);
    }

    // tests BubbleSort for Integers, ascending is true, two in array
    @Test
    public void testBubbleIntegerTwo() {
    	BubbleSortInteger.sort(two, true);
    	Assert.assertArrayEquals(two, twoR);
    }

    // tests BubbleSort for Integers, ascending is true
    @Test
    public void testBubbleIntegerTrue() {
    	BubbleSortInteger.sort(arr1, true);
    	Assert.assertArrayEquals(arr1r, arr1);
    }

    // tests BubbleSort for Integers, ascending is false    
    @Test
    public void testBubbleIntegerFalse() {
        Integer[] arr1Sort = new Integer[]{10,8,7,7,6,6,5,5,5,5,4,3,3,2,2};
    	BubbleSortInteger.sort(arr1, false);
    	Assert.assertArrayEquals(arr1Sort, arr1);
    }

    // tests BubbleSort for Strings, ascending is true, empty array
    @Test
    public void testBubbleStringEmpty() {
    	BubbleSortString.sort(emptyS, true);
    	Assert.assertArrayEquals(emptyS, emptySR);
    }

    // tests BubbleSort for Strings, ascending is true, one in array
    @Test
    public void testBubbleStringOne() {
    	BubbleSortString.sort(oneS, true);
    	Assert.assertArrayEquals(oneS, oneSR);
    }

    // tests BubbleSort for Strings, ascending is true, two in array
    @Test
    public void testBubbleStringTwo() {
    	BubbleSortString.sort(twoS, true);
    	Assert.assertArrayEquals(twoS, twoSR);
    }

    // tests BubbleSort for Strings, ascending is true
    @Test
    public void testBubbleStringTrue() {
    	BubbleSortString.sort(string1, true);
    	Assert.assertArrayEquals(string1, string1R);
    }
    
    // tests BubbleSort for Strings, ascending is false
    @Test
    public void testBubbleStringFalse() {
        String[] stringArraySort = new String[]{"Pear","Mango","Lime","Lime","Banana","Apple","Apple"};

    	BubbleSortString.sort(string1, false);
    	Assert.assertArrayEquals(string1, stringArraySort);
    }

    // tests BubbleSort for reverseStrings, ascending is true, empty array
    @Test
    public void testBubbleStringReverseEmpty() {
    	BubbleSortStringReverse.sort(emptyS, true);
    	Assert.assertArrayEquals(emptyS, emptySR);
    }

    // tests BubbleSort for reverseStrings, ascending is true, one in array
    @Test
    public void testBubbleStringReverseOne() {
    	BubbleSortStringReverse.sort(oneS, true);
    	Assert.assertArrayEquals(oneS, oneSR);
    }

    // tests BubbleSort for reverseStrings, ascending is true, two in array
    @Test
    public void testBubbleStringReverseTwo() {
    	BubbleSortStringReverse.sort(twoS, true);
    	Assert.assertArrayEquals(twoS, twoSR);
    }

    // tests BubbleSort for reverseStrings, ascending is true
    @Test
    public void testBubbleStringReverseTrue() {
        String[] stringArraySort = new String[]{"Banana","Apple","Apple","Lime","Lime","Mango","Pear"};
    	BubbleSortStringReverse.sort(string1, true);
    	Assert.assertArrayEquals(string1, stringArraySort);
    }

    // tests BubbleSort for reverseStrings, ascending is true
    @Test
    public void testBubbleStringReverseFalse() {
        String[] stringArraySort = new String[]{"Pear","Mango","Lime","Lime","Apple","Apple","Banana"};
    	BubbleSortStringReverse.sort(string1, false);
    	Assert.assertArrayEquals(string1, stringArraySort);
    }
    
    // tests BubbleSort for Color, ascending is true, empty array
    @Test
    public void testBubbleColorEmpty() {
    	BubbleSortStringColor.sort(emptyC, true);
    	Assert.assertArrayEquals(emptyC, emptyCR);
    }

    // tests BubbleSort for Color, ascending is true, one in array
    @Test
    public void testBubbleColorOne() {
    	BubbleSortStringColor.sort(oneC, true);
    	Assert.assertArrayEquals(oneC, oneCR);
    }

    // tests BubbleSort for Color, ascending is true, two in array
    @Test
    public void testBubbleColorTwo() {
    	BubbleSortStringColor.sort(twoC, true);
    	Assert.assertArrayEquals(twoC, twoCR);
    }

    // tests BubbleSort for Color, ascending is true
    @Test
    public void testBubbleColorTrue() {
    	BubbleSortStringColor.sort(arr1Color, true);
   	    Assert.assertArrayEquals(arr1Color, arr1ColorR);
    }

    // tests BubbleSort for Color,ascending is false
    @Test
    public void testBubbleColorFalse() {
        String[] arr1ColorRR = new String[]{"RED","red","white","blue"};
    	BubbleSortStringColor.sort(arr1Color, false);
      	Assert.assertArrayEquals(arr1Color, arr1ColorRR);
    }
}
