
//Get a number as an input from the user and find the zeros present in that number.

//Then convert the zeros into one and then print it.
//Input
//310020

//Output
//311121


import  java.util.*;
public class day23 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your number : ");
        int n=sc.nextInt();
        int result=0;
        while(n>0){
            if(n%10==0){
                result=(result*10)+1;
            }
            else {
                result=(result*10)+(n%10);
            }
            n=n/10;
        }
        int result1=result;
        int rel=0;
        while (result1>0) {
            rel=(rel*10)+(result1%10);
            result1=result1/10;
        }
        System.out.println(rel);
    }
}
