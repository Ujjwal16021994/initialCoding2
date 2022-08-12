package com.ujjwal;

import java.util.LinkedList;
import java.util.Queue;

public class SmallestElementInEachWindowOfKSize {
    public static void main(String[] args) {
        int[] array = new int[]{2,4,5,1,2,3,9,1,2,3,4,5,7,8,5,4,2};
        int windowSize = 4;
        int[] result = new int[array.length-windowSize+1];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(array[0]);
        for(int i=0;i< array.length;i++)
        {
            if(!queue.isEmpty() && array[i]<=queue.peek())
            {
                 while (!queue.isEmpty())
                    {
                        queue.poll();
                    }
                    queue.add(array[i]);
            }
            else if(!queue.isEmpty() && array[i]>queue.peek())
                {
                    queue.add(array[i]);
                }
            if(i>=windowSize-1)
            {
                result[i-windowSize+1] = queue.peek();
            }
            if (queue.size()>=4)
                queue.poll();

        }
        for(int i=0;i< result.length;i++)
            System.out.print(result[i]);
    }
}




