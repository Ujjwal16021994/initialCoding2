package com.ujjwal;
public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{0, 1, 2, 0, 1, 0, 2, 1, 0, 0, 2, 1, 0, 0, 1, 1};
        int n = array.length;
        int i = 0;
        int k = 0;
        int l = n-1;
        while (i <= l) {
            if (array[i] == 0) {
                int temp = array[i];
                array[i] = array[k];
                array[k] = temp;
                i++;
                k++;
            }
            else if(array[i] == 1)
            {
                i++;
            }
            else
            {
                int temp = array[i];
                array[i] = array[l];
                array[l] = temp;
                l--;
            }
        }
        for(int m=0;m<n;m++)
        {
            System.out.print(array[m]+"   ");
        }
    }
}
