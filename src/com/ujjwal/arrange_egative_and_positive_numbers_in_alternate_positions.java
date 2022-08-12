package com.ujjwal;

public class arrange_egative_and_positive_numbers_in_alternate_positions {
//    arrange negative and positive numbers in alternate positions
//    if there are some extra positive or negative numbers plase at the end of the array
    public static void main(String[] args) {
        int[] array = new int[] {1, 2, -3, -4, -5, 6, -7, -8, 9, 5, 10, -11, -12, -13, 14};
        int n = array.length;
        int j=n-1;
        int i=0;
        while(i+1<j)
        {
            if(array[i]<0)
            {
                i++;
            }
            if(array[j]>0)
            {
                j--;
            }
            if(array[i]>0 && array[j]<0)
            {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if(j>n/2)
        {
            int b=n-1;
            for(int a=0;a<n/2;a++,b--)
            {
                int temp = array[a];
                array[a] = array[b];
                array[b] = temp;

            }
            j = n-j;
        }
        System.out.println(j);
        for(int m=0;m< array.length;m++)
        {
            System.out.print(array[m]+"  ");
        }
        System.out.println();
        System.out.println();
        int k=j*2-1;
        for(int l=0;l<j;l=l+2,k=k-2)
        {
            int temp = array[k];
            array[k] = array[l];
            array[l] = temp;
        }
        for(int m=0;m< array.length;m++)
        {
            System.out.print(array[m]+"  ");
        }
    }
}
