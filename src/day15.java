
//Get a number as an input from user and then check whether that number is a strong number or not. A number is said to be strong number if the sum of the factorial of each digit in the number is same as that of the number.

//E.g. let the number be 145

//Here 1! + 4! + 5! is 1 + 24 + 120 which is equal to 145 itself.


import java.util.*;
public class day15 {
    static int fac(int i){
        if(i==0 || i==1){
            return 1;
        }
        else{
            return i*fac(i-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your number ");
        int a1= sc.nextInt();
        sc.close();
        int a=a1;
        int result=0;
        while (a>0){
            result=result+fac(a%10);
            a=a/10;
        }

        if(result==a1){
            System.out.println("Strong number");
        }
        else {
            System.out.println("Not a strong number");
        }
    }
}
