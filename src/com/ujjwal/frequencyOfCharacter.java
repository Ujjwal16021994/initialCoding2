package com.ujjwal;

import java.util.HashMap;

public class frequencyOfCharacter {
    public static void main(String[] args) {
        int[] array = new int[]{2,5,2,5,6,4,6,1,4};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<array.length;i++)
        {
            {
                if(map.containsKey(array[i]))
                {
                    map.put(array[i],map.get(array[i])+1);
                }
                else
                {
                    map.put(array[i],1);
                }
            }
        }
        System.out.println(map);
        for(int i: map.keySet())
        {
            if(map.containsValue(1))
            {
                System.out.println(i);
                break;
            }
        }
    }
}
