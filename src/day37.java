
/*
Get a string as the input from the user and find the frequency of characters in the string.

Input:
program

Output:
The frequency of a is 1

The frequency of g is 1

The frequency of m is 1

The frequency of o is 1

The frequency of p is 1

The frequency of r is 2
 */




import java.util.Arrays;
import java.util.Scanner;
public class day37 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your String ");
        String s=sc.nextLine();
        char [] arr=s.toCharArray();
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            int count=1;
            while (i<arr.length-1 && arr[i]==arr[i+1]){
                count++;
                i++;
            }
            System.out.println("The frequency of "+arr[i]+" is "+count);
        }
    }
}
