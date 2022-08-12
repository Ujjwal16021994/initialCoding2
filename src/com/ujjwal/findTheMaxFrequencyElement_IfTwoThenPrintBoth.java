package com.ujjwal;

import java.util.HashMap;

public class findTheMaxFrequencyElement_IfTwoThenPrintBoth {
    public static void main(String[] args) {
        int[] array = new int[]{2,3,1,2,3,2,5,2,1,42,1,2,6,6,6,6,6};
        HashMap<Integer,Integer> set = new HashMap<Integer,Integer>();
        for(int i=0;i<array.length;i++)
        {
            if(set.containsKey(array[i]))
            {
                set.put(array[i],set.get(array[i])+1);
            }
            else{
                set.put(array[i],1);
            }
        }
        int max = 0;
        int repeatingelement = 0;
        for(int element : set.keySet())
        {
            if(set.get(element)>=max)
            {
                max = set.get(element);
                repeatingelement = element;
            }
        }
        for(int element : set.keySet()) {
            if (set.get(element) == max) {
                System.out.println(element + " is the element occururing " + max +" times");
            }
        }
    }
}
