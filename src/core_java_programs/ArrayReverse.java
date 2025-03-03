package core_java_programs;

import java.util.*;
public class ArrayReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr2=new int[10];

        //for taking input
        for(int i=0;i<arr2.length;i++) {
            arr2[i]=sc.nextInt();
        }

        //for swapping
        for(int i=0;i<arr2.length/2;i++) {
            int temp=arr2[i];
            arr2[i]=arr2[arr2.length-1-i];
            arr2[arr2.length-1-i]=temp;
        }

        //for printing array in reverse
        for(int i=0;i<arr2.length;i++) {
            System.out.print(arr2[i]+" ");
        }
    }
}
