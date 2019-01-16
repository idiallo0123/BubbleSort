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
                    SortUtil.stringSwap(list1, i, j);
                    swap = true;
                }
            }
        }
    }

    /*Selection sort finds the lowest element and moves it to the front
    of the array. Then searches the rest of the array for the next element,
    and repeats.*/
    public static void selectionSort(int[] list2)
    {
        int min = list2[0], Bindex, Findex, hold;
        for(Bindex = 0; Bindex < list2.length; Bindex++)
        {
            for(Findex = Bindex; Findex < list2.length-1; Findex++);
            {
                if (min > list2[Findex])
                {
                    min = list2[Findex];
                }
                hold = list2[Bindex];
                SortUtil.intSwap(list2, list2[Bindex], min);
                list2[Bindex+1] = hold;
                for(int i = Bindex+1; i < list2.length-1; i++)
                {
                    list2[i] = list2[(i+1)];
                }
                min = list2[Bindex];
            }
        }
    }

    /*Insertion takes each element from the array, and adds it to the front of
    the array in the correct order. We need to keep track of where we are inserting
    inserting elements as we sort. */
    /*public static void insertionSort(double[] list3)
    {

    }*/
}
