package com.company;

public class BubbleSort
{
    public static void swap(int[] arr, int i, int j)
    {
        int h = arr[j];
        arr[j] = arr[i];
        arr[i] = h;
    }

    public static void sort(int[] arr, int i, int j)
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
                    swap(arr, arr[i], arr[j]);
                    swapcount++;
                }
            }
        }
    }
}
