
//Get the input from the user for the value of n and then find the sum of first n natural numbers.
//
//e.g. let the n value = 5
//
//then first 5 natural numbers are 1,2,3,4,5 for which we need to find the sum
//
//Therefore sum of first 5 natural numbers is 1+2+3+4+5 = 15

import java.util.*;
public class day13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your range ");
        int a= sc.nextInt();
        int n=(a*(a+1))/2; // using the formula
        System.out.println(n);

    }
}
