
//
//package com.ujjwal;
//
//import java.util.Scanner;
//
//public class NextPermutation {
//    public static int lengthOfLongestSubstring(String s) {
//
//        int n = s.length();
//
//        int start = 0;
//        int end = 0;
//        int str[] = new int[128];
//        int max = 0;
//
//        while(end < n) {
//            char curr = s.charAt(end);
//            str[curr]++;
//            System.out.println("end = "+end+str[curr]+" "+curr);
//
//            while( str[curr] > 1) {
//                str[s.charAt(start)]--;
//                start++;
//                System.out.println("str[curr] = "+str[curr]+str[s.charAt(start)]+" "+start);
//            }
//            max = Math.max(max, end - start + 1);
//            end++;
//        }
//
//        return max;
//    }
//    public static void main(String[] args) {
//        String s = "jaaistirama";
//        int a = lengthOfLongestSubstring(s);
//        System.out.println(a);
//    }
//}



//
//
//package com.ujjwal;
//
//public class NextPermutation {
//    public static void main(String[] args) {
//  ...find the maximum possible product of an subset of the array...
//   ... here subset is a set of continuous elements of an array...
//        int[] array = new int[]{ -6, 4, -5, 8, -10, 0, 8 };
//        int countNegative =0;
//        int countZero =0;
//        int product=1;
//        int maxproduct =1;
//        int zeroindex =-1;
//        for(int i=0;i< array.length;i++)
//        {
//            if(array[i]<0)
//            {
//                countNegative++;
//            }
//            if(array[i] ==0)
//            {
//                countZero++;
//                if(countNegative%2!=0)
//                {
//                    if(array[zeroindex+1]<0 && array[i-1]>0)
//                        product /= array[zeroindex+1];
//                    if(array[i-1]<0 && array[zeroindex+1]>0)
//                        product /= array[i-1];
//                    if(array[i-1]<0 && array[zeroindex+1]<0)
//                    {
//                        if(array[i-1]<array[zeroindex+1])
//                          product /= array[zeroindex+1];
//                        else
//                            product /= array[i-1];
//                    }
//                }
//                maxproduct = Math.max(product,maxproduct);
//                countNegative = 0;
//                zeroindex = i;
//            }
//            if(array[i]!=0)
//            {
//                product *= array[i];
//            }
//        }
//        System.out.println(product);
//    }
//
//}






//
//
//package com.ujjwal;
//
//import java.util.HashMap;
//
//public class SmallestElementInEachWindowOfKSize {
//......find all subset which sum up to zero... and print first and last index.......
//    public static void add(HashMap<Integer,Integer> map,int element,int index) {
//        if(index ==0)return;
//        map.put()
//        return add(map,element,index-1);
//
//    }
//    public static void main(String[] args) {
//        int[] array = new int[]{6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7};
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for(int i=0;i< array.length;i++)
//        {
//            map.put(i,array[i]);
//            add(map,array[i],i);
//        }
//
//    }
//    }







//package com.ujjwal;
//
//public class HashTableImplimentation {
//    public static void main(String[] args) {
//   ....find first positive number missing from the array.....
//        int[] array = new int[]{2, 3, 7, 6, 8, 1, -1, -10, 15};
//        int min = Integer.MAX_VALUE;
//        int max = Integer.MIN_VALUE;
//        int sum=0;
//        for(int i=0;i< array.length;i++)
//        {
//            if(array[i]>0)
//            {
//                max = Math.max(array[i],max);
//                min = Math.min(array[i],min);
//                sum += array[i];
//            }
//        }
//        if(min!=1)
//        {
//            System.out.println(1);
//            return;
//        }
//        else
//        {
//            int c=min;
//            for(int i=min;i<=max;i++)
//            {
//
//            }
//        }
//
//    }
//
//}








//
//package com.ujjwal;
//// split the array  in k parts so that each has sum as minimum....
//public class HashTableImplimentation {
//    public static void main(String[] args) {
//        int[] array = new int[]{3,1,2,4};
//        int k=3;
//
//
//    }
//
//    }
//
//  1...      https://www.geeksforgeeks.org/split-the-given-array-into-k-sub-arrays-such-that-maximum-sum-of-all-sub-arrays-is-minimum/
//
//  2...      https://www.techiedelight.com/find-peak-element-array/
//
//  3...      https://www.techiedelight.com/search-element-circular-sorted-array/
//  4...      https://leetcode.com/problems/koko-eating-bananas/


//package com.ujjwal;
//
//public class NextPermutation {
//    public static void main(String[] args) {
//        int[] numbers = new int[]{2,3,4};
//        int target = 6;
//            int i = 0;
//            int mid1 = i + 1;
//            int n = numbers.length-1;
//            int m = n;
//            int[] result = new int[2];
//            while (i<m) {
//                int mid = (mid1 + n+1) / 2;
//                if (numbers[i] + numbers[mid] == target && i != mid) {
//                    result[0] = i;
//                    result[1] = mid;
//                    break;
//                }
//                if (numbers[i] + numbers[mid] < target)
//                    mid1 = mid + 1;
//                if (numbers[i] + numbers[mid] > target)
//                    n = mid;
//                if (mid == mid1 || mid == n)
//                    i++;
//            }
//            int g=0;
//            while(g<=1)
//        System.out.println(result[g]);
//        }
//    }


package com.ujjwal;
public class NextPermutation {
    public static void main(String[] args) {
        pen pen1 = new pen();
        pen1.color = "red";
        pen1.type = "gel";
        pen1.write();
        pen1.color();
        pen1.type();
        System.out.println("______*______");
        pen pen2 = new pen();
        pen2.color = "black";
        pen2.type = "ballpen";
        pen2.write();
        pen2.type();
        pen2.color();
        System.out.println("_____________*____________");
        pen1.all();
    }
    }


class pen {
    String color;
    String type;

    public void write() {
        System.out.println("write something");
    }
    public void color() {
        System.out.println(this.color);
    }
    public void type() {
        System.out.println(this.type);
    }
    public void all() {
        System.out.println(this.color);
        System.out.println(this.type);
        System.out.println("kjshfsdfdf");
    }
}