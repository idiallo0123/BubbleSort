package com.company;

public class SortUtil
{
    public static void swap(int[] arr, int i, int j)
    {
        int h = arr[j];
        arr[j] = arr[i];
        arr[i] = h;
    }

    public static boolean isSorted(int[] arr)
    {
        int i, j;
        for(i = 0; i <= arr.length; i++)
        {
            j = i + 1;
            if(arr[i] > arr[j])
            {
                return false;
            }
        }
        return true;
    }

    public static boolean checkSum(int[] before, int[] after)
    {
        int sumBefore, sumAfter;
        for(int i = 0; i <= before.length; i++)
        {
            sumBefore = sumBefore + before[i];
        }
        for(int i = 0; i <= after.length; i++)
        {
            sumAfter = sumAfter + after[i];
        }
    }
}
