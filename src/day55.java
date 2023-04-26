/*
 Given 2 integer arrays X and Y of same size. Consider both arrays as vectors and print the sum of maximum scalar product (Dot product) of 2 vectors.

Sample input 1:

4

1 2 3 4

5 6 7 8

Sample output 1:

70

Explanation :

(8*4 + 7*3 + 6*2 + 1*5) = 70

Sample input 2:

4

-1 -2 -3 -4

5 6 -7 -8

Sample output 2:

37

Explanation :

(-4*-8 + -3*-7 + -2*5 + -1*6) = 37
 */


import java.util.Arrays;
import java.util.Scanner;
public class day55 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter size of the Array , same for both");
        int size=sc.nextInt();
        int [] arr1= new int[size];
        System.out.println("enter 1st Array Elements");
        for (int i=0;i<size;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("enter 2nd Array element");
        int [] arr2= new int[size];
        for (int i=0;i<size;i++){
            arr2[i]=sc.nextInt();
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int value=0;
        for (int i=0;i<arr1.length;i++){
            value=value+(arr1[i]*arr2[i]);
        }
        System.out.println(value);
    }
}
