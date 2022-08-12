package com.ujjwal;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] array = new int[]{2,6,5,23,74,74,2,15};
        int max =Integer.MIN_VALUE;
        int max1 = Integer.MIN_VALUE;
        for(int i=0;i< array.length;i++)
        {
            if(array[i]>max)
            {
                max = array[i];
            }
        }
        for(int i=0;i<array.length;i++)
        {
            if(array[i]<max)
            {
                max1 = Math.max(max1,array[i]);
            }
        }
        System.out.println(max1);
    }
}
