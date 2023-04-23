
/*
Given an integer array of size N, write a program to sort the array;

Sample input 1:
size:
4
elements:
2 4 1 3

Sample output 1:
1 2 3 4
 */
import java.util.Arrays;
import java.util.Scanner;
public class day51 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter size of array");
        int size=sc.nextInt();
        System.out.println("enter array elements");
        int [] arr=new int[size];
        for (int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for (int element : arr){
            System.out.print(element+" ");
        }
    }
}
