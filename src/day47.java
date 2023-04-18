
/*
Get an array as the input from the user and find the longest palindrome in that array.

Input:
Enter the size of array
3

Enter the elements of array
121 10456 1000001

Output:
1000001
 */


import java.util.Scanner;
public class day47 {
    public static  boolean isPalindrome(int n1){
        int n=n1;
        int rev=0;
        while (n>0){
            rev=(rev*10)+(n%10);
            n=n/10;
        }
        if (n1==rev){
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size= sc.nextInt();
        int [] arr= new int[size];
        System.out.println("Enter the elements of array");
        for (int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int currentMax=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if( isPalindrome(arr[i]) && arr[i]>currentMax){
                currentMax=arr[i];
            }
        }
        System.out.println(currentMax);
    }
}
