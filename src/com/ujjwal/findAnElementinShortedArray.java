package com.ujjwal;
import java.util.*;
public class findAnElementinShortedArray {

            public static int findTheNumber(int[] array,int start,int end,int find) {
                int mid = start + (end - start +1)/2;
                if(array[mid]==find)
                {
                    return array[mid];
                }
                if(mid-start<1 )
                {
                    return -1;
                }
                if(array[mid]<find)
                {
                    return findTheNumber(array,mid+1,end,find);
                }
                if(array[mid]>find)
                {
                    return findTheNumber(array,start,mid-1,find);
                }
                return -1;
            }
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int length = sc.nextInt();
                int[] array = new int[length];
                for(int i=0;i<length;i++)
                {
                    array[i] = sc.nextInt();
                }
                int find = sc.nextInt();
                int result = findTheNumber(array,0,length,find);
                System.out.print(result);
            }
    }
