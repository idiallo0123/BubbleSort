package com.company;

public class BubbleSort
{
    public static void swap(int[] arr, int i, int j)
    {
        int h = arr[j];
        arr[j] = arr[i];
        arr[i] = h;
    }

    public static void sort(int[] arr, int swapcount, int i, int j)
    {
        swapcount = 1;
        //It should be 0 but I set it to one here so that I can move
        //into the while loop
        while(swapcount != 0)
        {
            swapcount = 0;
            for(i=0; i < arr.length; i++)
            {
                j = i + 1;
                if()
            }
        }
    }
}
