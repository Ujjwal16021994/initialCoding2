package com.ujjwal;

public class FindFrequencyOfElementInSortedArray {
    public static int count(int[] array,int element) {
        int index = find(array,0, array.length-1,3);
        int i=index;
        int j= index;
        while (array[i+1] == 3 || array[j-1] == 3)
        {
            if(array[i+1] == 3)
                i++;
            if(array[j-1] == 3)
                j--;
        }
        int value = i-j+1;
        return value;
    }
    public static int find(int[] array ,int start,int end,int x) {
        int mid = start + (end-start)/2;
        if(array[mid]==3)
            return mid;
        else if(array[mid]<3)
            return find(array,mid,end,3);
        return find(array,start,end,3);
    }
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,3,3,4,4,5,6};
        int value1 = count(array,3);
        System.out.println(value1);
    }
}
