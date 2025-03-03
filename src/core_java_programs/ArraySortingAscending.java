package core_java_programs;

import java.util.Scanner;

public class ArraySortingAscending
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr={8,2,9,5,1,3,6};


/*System.out.print("Enter size of array: ");
int size=sc.nextInt();
int [] arr=new int [size];
System.out.print("Enter array elements: ");
for(int i=0;i<size;i++) {
   arr[i]=sc.nextInt();
}
*/

        int temp;
        for(int i=0;i<arr.length;i++) {
            for(int j=i+1;j<arr.length;j++) {
                if(arr[i]>arr[j]) {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}