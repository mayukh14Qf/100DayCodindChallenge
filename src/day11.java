
//Fibonacci series is a special series where nth term is the sum of previous two terms in the series. The series starts with 0 and 1 as the first and second term of the series respectively.
//Here you need to get the value for nth term from user and then print Fibonacci series containing n terms.

import java.util.*;
public class day11 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("type your range ");
        int n=sc.nextInt();
        int a=0;
        int b=1;
        System.out.print(a+" "+b);
        int r1;
        while(n>2){
            r1=a+b;
            System.out.print(" "+r1);
            a=b;
            b=r1;
            n--;
        }
    }
}
