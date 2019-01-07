package com.company;

public class SortRunner {

    public static void main(String[] args)
    {
        //Create a random array of integers
        int[] testArr = {8,6,7,5,3,0,9,10,1,2,3};

        //Print it out before you sort.
        System.out.print("Before: ");
        for (int num:testArr)
            System.out.print(num+" ");
        System.out.println();

        //Sort it using bubbleSort
        Sorts.bubbleSort(testArr, 0, 1);

        //Print it out after you sort
        System.out.print("After: ");
        for (int num:testArr)
            System.out.print(num+" ");
        System.out.println();
    }
}
