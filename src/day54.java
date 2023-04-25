/*
 Given an integer array of size N. Write Program to find whether Arrays are disjoint or not. Two arrays are said to be disjoint if they have no elements in common.

Sample input 1:

4

2 -4 -1 -3

3

1 3 5

Sample output 1:

Disjoint

Sample input 2:

5

1 5 -7 6 3

4

2 4 6 8

Sample output 2:
Not disjoint. ( 6 is common)
 */

import java.util.Scanner;
public class day54 {
    public static String checkDisJoint(int [] arr1, int [] arr2){
        for (int i=0;i< arr1.length;i++){
            for (int j=0;j<arr2.length;j++){
                if (arr1[i]==arr2[j]){
                    return "Not disjoint";
                }
            }
        }
        return "Disjoint";
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter 1st Array size");
        int size1=sc.nextInt();
        int [] arr1=new int[size1];
        System.out.println("enter 1st Array elements");
        for (int i=0;i<size1;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("enter 2nd array size");
        int size2=sc.nextInt();
        int [] arr2=new int[size2];
        System.out.println("enter 2nd array elements");
        for (int i=0;i<size2;i++){
            arr2[i]=sc.nextInt();
        }
        System.out.println(checkDisJoint(arr1,arr2));
    }
}
