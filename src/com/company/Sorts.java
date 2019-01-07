package com.company;

public class Sorts
{
    public static void bubbleSort(int[] arr, int i, int j)
    {
        int swapcount = 1;
        //It should be 0 but I set it to one here so that I can move
        //into the while loop
        while(swapcount != 0)
        {
            swapcount = 0;
            for(i=0; i < arr.length-1; i++)
            {
                j = i + 1;
                if(arr[i] > arr[j])
                {
                    SortUtil.swap(arr, arr[i], arr[j]);
                    swapcount++;
                }
            }
        }
    }

    /*Select the smallest value in the array and put it first.
    Select the 2nd smallest value in the array and put it second.
    Etcetera... */
    public static void selectionSort()
    {

    }
}
