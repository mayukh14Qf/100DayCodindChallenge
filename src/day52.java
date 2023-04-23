/*
Given an integer array of size N, write a program to reverse the array;

Sample input 1:
size:
4
elements:
2 4 1 3

Sample output 1:
3 1 4 2
 */
import java.util.Scanner;
public class day52 {
    public static void reverse(int [] arr){
        int start=0;
        int end=arr.length-1;
        int temp;
        while (start<end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        for (int element : arr){
            System.out.print(element+" ");
        }
    }

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of the Array");
        int size=sc.nextInt();
        System.out.println("enter Array elements");
        int [] arr=new int[size];
        for (int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        reverse(arr);
    }
}
