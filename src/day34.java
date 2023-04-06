/*
Get an algebraic expression as input from the user and then remove all the brackets in that.

Input
7x+(2*y)

Output
7x+2*y

 */

import java.util.Scanner;
public class day34 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your Equation");
        String s=sc.nextLine();
        StringBuilder sb= new StringBuilder("");
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)==')' || s.charAt(i)=='{' || s.charAt(i)=='}' || s.charAt(i)=='[' || s.charAt(i)==']'){
                continue;
            }
            else {
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb.toString());

        // using replaceAll Function in java

        String newStr=s.replaceAll("[{()}]","");
        System.out.println(newStr);
    }
}
