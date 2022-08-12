package com.ujjwal;

public class FindFirstOccuranceOfAElementInSortedArray {


        public static int firstOccurance(int[] array,int element) {
            int index = check(array,0,array.length-1,element);
            if(index==-1)
            {
                return -1;
            }
            while (array[index-1]==element)
            {
                index--;
            }
            return index;
        }
        public static int check(int[] array,int start,int end,int find) {
            int mid = start + (end - start)/2;
            if(array[mid] == find)
                return mid;
            if(start>=mid)
                return -1;
            if(array[mid]<find)
                return check(array,mid+1,end,find);
            return check(array,start,mid-1,find);
        }
        public static void main(String[] args) {
            int[] array = new int[]{1,2,2,3,3,4};
            int find = 2;
            int index = firstOccurance(array,find);
            System.out.println(index);
        }
    }