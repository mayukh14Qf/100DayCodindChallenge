
//Get a number as an input from the user and check whether that number is a Palindrome or not.


import  java.util.*;
public class day21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your number");
        int n=sc.nextInt();
        int n1=n;
        int result=0;
        while (n1>0){
            result=(result*10)+(n1%10);
            n1=n1/10;
        }
        if(n==result){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a Palindrome");
        }
    }
}
