package com.company;

public class Sorts
{
    /*Bubble sort iterates through the list, swapping any out of order elements.
    We continue iterating until no swaps are required. Then the array is sorted! */
    public static void bubbleSort(String[] list1)
    {
        int i, j;
        boolean swap = true;
        while(swap)
        {
            swap = false;
            for(i=0; i < list1.length-1; i++)
            {
                j = i + 1;
                if(list1[i].compareTo(list1[j]) > 0)
                {
                    SortUtil.stringSwap(list1, list1[i], list1[j]);
                    swap = true;
                }
            }
        }
    }

    /*Selection sort finds the lowest element and mose it to the front
    of the array. Then searches the rest of the array for the next element,
    and repeats.*/
    public static void selectionSort(int[] list2)
    {
        int index = 0;
        boolean sorted = false;
        while(sorted = false)
        {
            for(index = 0; index < list2.length; index++);
            {
                int min = SortUtil.minimum(list2, index);
                if(min > list2[index])
                {
                    SortUtil.intSwap(list2, index, (index+1));
                }
            }
            sorted = SortUtil.isSorted(list2);
        }
    }

    /*Insertion takes each element from the array, and adds it to the front of
    the array in the correct order. We need to keep track of where we are inserting
    inserting elements as we sort. */
    /*public static void insertionSort(double[] list3)
    {

    }*/
}
