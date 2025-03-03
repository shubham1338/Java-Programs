package core_java_programs;

import java.util.Scanner;

public class LargestStringNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int [] arr={8,2,9,5,1,3,6};

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int temp_largest = arr[0]; //temp_largest=8
        for (int i = 1; i < arr.length; i++) {
            if (temp_largest < arr[i]) {
                temp_largest = arr[i]; //temp_largest=9
            }
        }
        System.out.println(temp_largest);
    }
}

