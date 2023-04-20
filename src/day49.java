/*
Given 2 integer arrays X and Y of same size. Consider both arrays as vectors and print the minimum scalar product (Dot product) of 2 vectors.

Sample input :
4

1 2 3 4

5 6 7 8

Sample output 1 :
60

Explanation :
(4*5 + 3*6 + 2*7 + 1*8) = 60
 */

import java.util.Scanner;
public class day49 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("size of the 2 Arrays ");
        int size=sc.nextInt();
        int [] arr1=new int[size];
        int [] arr2=new int[size];
        System.out.println("enter 1st Array elements");
        for (int i=0;i<size;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("enter 2nd array elements ");
        for (int i=0;i<size;i++){
            arr2[i]=sc.nextInt();
        }
        int start=0;
        int end=arr1.length-1;
        int sum=0;
        while (start<arr1.length && end>=0 ){
            sum=sum+(arr1[start]*arr2[end]);
            start++;
            end --;
        }
        System.out.println(sum);
    }
}
