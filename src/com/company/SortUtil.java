package com.company;

public class SortUtil
{
    public static void intSwap(int[] arr, int i, int j)
    {
        int hold = arr[j];
        arr[j] = arr[i];
        arr[i] = hold;
    }

    public static void stringSwap(String[] arr, String i, String j)
    {
        String hold = arr[j];
        arr[j] = arr[i];
        arr[i] = hold;
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

    /*public static boolean checkSum(int[] before, int[] after)
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
        if(sumBefore == sumAfter)
        {
            return true;
        }
        return false;
    }*/

    public static int minimum(int[] arr, int index)
    {
        int min = arr[index];
        for(int i = index; i < arr.length; i++)
        {
            if (arr[i] < arr[index])   min = arr[i];
        }
        return min;
    }

    public String[] randomStringArr(int num, int length)
    {
        String [] arr = new String [num];
        while(num > 0)
        {
            int i = 0;
            String s = "";
            while(i < length)
            {
                char c = (char)((Math.random()*26)+97);
                s = s + c;
                i++;
            }
            num--;
            arr[num] = s;
        }
        return arr;
    }
    public static int[] randomIntArr(int length)
    {
        int[] arr = null;
        for(int i = 0; i < length; i++)
        {
            arr[i] = (int)(Math.random()*11);
        }
        return arr;
    }
}
