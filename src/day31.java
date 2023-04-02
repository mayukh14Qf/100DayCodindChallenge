
/*
Get an input string from user and then convert the lower case of alphabets to upper case and all upper-case alphabets into lower case.

Input:
Hello

Output:
hELLO

 */

import java.util.Scanner;

public class day31 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your String");
        String s=sc.nextLine();
        sc.close();

        // Using String

        String p="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a' && 'z'>=s.charAt(i)){
                p += s.toUpperCase().charAt(i);
            } else {
                p += s.toLowerCase().charAt(i);
            }
        }
        System.out.println(p);


        System.out.println();

        // Using StringBuilder

        StringBuilder sb= new StringBuilder("");
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a' && 'z'>=s.charAt(i)){
                sb.append(Character.toUpperCase(s.charAt(i)));
            }
            else {
                sb.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        System.out.println(sb.toString()); // Converting our StringBuilder into String

    }
}
