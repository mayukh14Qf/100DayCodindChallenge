/*
 Given an integer array of size N. Write Program to find maximum product sub array in a given array.
Sample input 1:
size:
4
elements:
2 -4 -1 -3

Sample output 1:
8

Explanation:
8 = {2, -4, -1}
 */
import java.util.Scanner;
public class day53 {
    public static void maximumProductSubArray(int [] arr){
        int mp=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int cp=1;
                for (int k=i;k<=j;k++){
                    cp=cp*arr[k];
                }
                if(cp>mp){
                    mp=cp;
                }
            }
        }
        System.out.println(mp);
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
        maximumProductSubArray(arr);
    }
}
