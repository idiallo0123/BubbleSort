package com.company;

public class SortRunner {

    public static void main(String[] args)
    {
        //Create a random array of integers
        String[] list1 = SortUtil.randomStringArr(11, 3);
        int[] list2 = SortUtil.randomIntArr(11);
        int[] list3 = {8,6,7,5,3,0,9,10,1,2,3};

        //Print it out before you sort.
        System.out.print("Before: ");
        for (String str:list1)
            System.out.print(str+" ");
        System.out.println();

        //Sort it using bubbleSort
        Sorts.bubbleSort(list1);

        //Print it out after you sort
        System.out.print("After: ");
        for (String str:list1)
            System.out.print(str+" ");
        System.out.println();

        //Print it out before you sort.
        System.out.print("Before: ");
        for (int num:list2)
            System.out.print(num+" ");
        System.out.println();

        //Sort it using selectionSort
        Sorts.selectionSort(list2);

        //Print it out after you sort
        System.out.print("After: ");
        for (int num:list2)
            System.out.print(num+" ");
        System.out.println();

        //Print it out before you sort.
        System.out.print("Before: ");
        for (int num:list3)
            System.out.print(num+" ");
        System.out.println();

        //Sort it using insertionSort
        Sorts.selectionSort(list3);

        //Print it out after you sort
        System.out.print("After: ");
        for (int num:list3)
            System.out.print(num+" ");
        System.out.println();
    }
}
