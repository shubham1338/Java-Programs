package core_java_programs;

import java.util.Scanner;

public class FindSmallestNumberFromArray {
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int arr[]={12,83,32,21,45};
            int temp=arr[0];
            for(int i=1;i<arr.length;i++){
                if(arr[i]<temp){     //for greatest just change sign > here
                    temp=arr[i];
                }
            }
            System.out.println(temp);
        }
}
