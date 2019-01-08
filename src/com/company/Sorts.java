package com.company;

public class Sorts
{
    /*Bubble sort iterates through the list, swapping any out of order elements.
    We continue iterating until no swaps are required. Then the array is sorted! */
    public static void bubbleSort(String[] list1)
    {
        int i, j;
        int swapcount = 1;
        //Swapcount should be 0 but I set it to one here so that I can move
        //into the while loop
        while(swapcount != 0)
        {
            swapcount = 0;
            for(i=0; i < list1.length-1; i++)
            {
                j = i + 1;
                if(list1[i] > list1[j])
                {
                    SortUtil.swap(list1, list1[i], list1[j]);
                    swapcount++;
                }
            }
        }
    }

    /*Selection sort finds the lowest element and mose it to the front
    of the array. Then searches the rest of the array for the next element,
    and repeats.*/
    public static void selectionSort(int[] list2)
    {

    }

    /*Insertion takes each element from the array, and adds it to the front of
    the array in the correct order. We need to keep track of where we are inserting
    inserting elements as we sort. */
    public static void insertionSort(double[] list3)
    {

    }
}
