
//Get an input from the user and the print the reverse of the given number as the output
//E.g. let the number be 324 then the reverse of the number is 423

import java.util.*;
public class day14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your number");
        int a =sc.nextInt();
        sc.close();
        int result=0;
        while (a>0){
            result=(result*10)+(a%10);
            a=a/10;
        }
        System.out.println(result);
    }
}
