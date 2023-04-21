/*
 Given an integer array of size N. Write Program to find sum of positive square elements in the array.

Sample input 1 :

4 1 2 3 4

Sample output 1 :

30

Explanation :

(1 + 4 + 9 + 16) = 30


Sample input 2 :

4 -1 -2 -3 -4

Sample output 2 :

30

Explanation :

(1 + 4 + 9 + 16) = 30
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class day50 {
    public static void sumSquare(int [] arr){

        for (int i=0;i< arr.length;i++){
            arr[i]=Math.abs(arr[i]);
        }

        Arrays.sort(arr);

        ArrayList<Integer> al= new ArrayList<>();
        for (int i=0;i<arr.length;i++) {
            while (i < arr.length - 1 && arr[i] == arr[i + 1]) {
                i++;
            }
            al.add(arr[i]);
        }
        int p=al.size()-1;
        int sum=0;
        while (p>=0){
            sum=sum+(int)(Math.pow(al.get(p),2 ));
            p--;
        }

        System.out.println(sum);

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of the array ");
        int size=sc.nextInt();
        int [] arr=new int[size];
        System.out.println("enter the array elements ");
        for (int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        sumSquare(arr);

    }
}
