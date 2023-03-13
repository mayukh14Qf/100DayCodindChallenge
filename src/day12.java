
//Get a number from user and then find the sum of the digits in the given number.
//E.g. let the number = 341
//Sum of digits is 3+4+1= 8


import  java.util.*;
public class day12 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your number");
        int n=sc.nextInt();
        int res=0;
        while (n>0){
            res=res+n%10;
            n=n/10;
        }
        System.out.println(res);
    }
}
