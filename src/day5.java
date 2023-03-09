//Get a number as an input from the user and check whether the given number is odd or even

import java.util.*;
public class day5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int a=sc.nextInt();
        if(a%2==0){
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }
    }
}
