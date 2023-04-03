/*
Get a string as the input from the user and then remove all the vowel letters from the string and give the output.

Input
remove

Output
rmv                                                              */

import java.util.Scanner;
public class day32 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your String ");
        String s=sc.nextLine();
        StringBuilder sb= new StringBuilder("");
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a' ||s.charAt(i)=='e' || s.charAt(i)=='i' ||s.charAt(i)=='o' ||s.charAt(i)=='u' || s.charAt(i)=='A' ||s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' ||s.charAt(i)=='U' ){
                continue;
            }
            else {
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
}
