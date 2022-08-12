package com.ujjwal;

public class findTheLongestAlternatingSequenceInAnArray {
    public static void main(String[] args) {
        int[] array = new int[]{10, 8, 10, 9, 20, 30, 12, 15, 5};
        int count=1;
        int temp = array[0];
        boolean high = true;
        for(int i=0;i< array.length-1;i++)
        {
            if(high==true)
            {
                if(temp>array[i+1])
                {
                    temp = array[i+1];
                    count++;
                    high=false;
                }
            }
            if(high == false)
            {
                if(temp<array[i+1])
                {
                    temp = array[i+1];
                    count++;
                    high = true;
                }
            }
        }

        int count1=1;
        int temp1 = array[0];
        boolean low = true;
        for(int i=1;i< array.length;i++)
        {
            if(low==true)
            {
                if(temp1<array[i])
                {
                    temp1 = array[i];
                    count1++;
                    low=false;
                }
            }
            if(low == false)
            {
                if(temp1>array[i])
                {
                    temp1 = array[i];
                    count1++;
                    low = true;
                }
            }
        }
        if(count<count1)
            System.out.println(count1);
        else
            System.out.println(count);
    }
}
