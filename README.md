Author: Julian Yan  
Date: 4/24/2019 
Title: Sorting Algorithms  
Summary: This program implements and tests sorting algorithms.

Contents: 
* src
  * main
    * comparator
      * ColorComparator.java 
        * This file includes a class that implements the Comparator interface to compare colors, specfically red, white and blue. 
          * boolean comparison(String x, String y, boolean ascending)
      * IntegerComparator.java 
        * This file includes a class that implements the Comparator interface to compare Integers.
          * boolean comparison(Integer x, Integer y, boolean ascending) 
      * StringComparator.java 
        * This file includes a class that implements the Comparator interface to compare Strings based on their unicode.
          * boolean comparison(String x, String y, boolean ascending)
      * StringComparatorReverse.java 
        * This file includes a class that implements the Comparator interface to compare Strings that are reversed based on their unicode.
          * boolean comparison(String x, String y, boolean ascending)
      * StudentComparator.java 
        * This file includes a class that implements the Comparator interface in order to compare Students based on their CGPA.
          * boolean comparison(Student x, Student y, boolean ascending) 
    * models
      * Student.java
        * This file includes a class that implements a Serializable to create Student objects.
    * sort
      * BubbleSort.java
        * This file includes a class that implements the Sorting interface and using the Bubble Sort algorithm to sort objects.
          * BubbleSort(Comparator<T> comparator)
          * void sort(T[] array, boolean ascending)
      * CountSort.java
        * This file includes a class that implements the Sorting interface and using the Count Sort algorithm to sort objects.
          * CountSort(T[] order)
          * void sort(T[] array, boolean ascending)
      * MergeSort.java
        * This file includes a class that implements the Sorting interface and using the Merge Sort algorithm to sort objects.
          * MergeSort(Comparator<T> comparator)
          * void sort(T[] array, boolean ascending)
      * SelectionSort.java
        * This file includes a class that implements the Sorting interface and using the Selection Sort algorithm to sort objects.
          * SelectionSort(Comparator<T> comparator)
          * void sort(T[] array, boolean ascending)
    * Comparator.java
      * This file includes a Comparator interface.
        * boolean comparison(E x, E y, boolean ascending)
    * Sorting.java
      * This file includes a Sorting interface.
        * void sort(T[] array, boolean ascending)
        * void swap(T array[],int i,int j)
        * void print(T array[])
  * test
      * BubbleTest.java
      * CountTest.java
      * GenericTest.java
      * MergeTest.java
      * SelectionTest.java



