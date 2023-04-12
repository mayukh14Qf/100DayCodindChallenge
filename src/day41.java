/*
Get two strings as input from the user, first with wildcard characters (* and ?) and second without wildcard characters.
Then check whether they match or not.

Input
Ta**nt

Talent

Output
Yes


 */

import java.util.Scanner;
public class day41 {
    public static boolean match(String first, String second){
        if(first.length()==second.length()){
            return true;
        }
        if (first.length()>1 && first.charAt(0)=='*'){
            int i=0;
            while ((i+1)<first.length() && first.charAt(i+1)=='*'){
                i++;
            }
            first=first.substring(i);
        }
        if(first.length()>1 && first.charAt(0)=='*' && second.length()==0){
            return  false;
        }
        if((first.length()>1 && first.charAt(0)=='?')||(first.length()!=0 && second.length() !=0 && first.charAt(0)==second.charAt(0))){
            return match(first.substring(1),second.substring(1));
        }
        if (first.length()>0 && first.charAt(0)=='*'){
            return match(first.substring(1),second) || match(first,second.substring(2));
        }
        return  false;
    }
    public static void check(String first,String second){
        if(match(first,second)){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter 1stString with Wild card");
        String s= sc.nextLine();
        System.out.println("enter your 2nd String");
        String p=sc.nextLine();
        check(s,p);

    }
}
