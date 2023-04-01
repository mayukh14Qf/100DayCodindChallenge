
//Get a string as input from user and print the length of the string without using length() function.

import java.util.Scanner;
public class day30 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your String ");
        String s=sc.nextLine();
        char [] arr=s.toCharArray();
        System.out.print("[ ");
        for( char i: arr){
            System.out.print(i+" ");
        }
        System.out.print("]");
        System.out.println();
        int count=arr.length;
        System.out.println(count);
    }
}
