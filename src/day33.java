
/*
Get an input string from the user and then check whether it is a palindrome string or not.

Input
noon

Output
Palindrome
 */



import java.util.Scanner;
public class day33 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your String ");
        String s1=sc.nextLine();
        String s=s1;
        String p="";
        int ptr=s.length()-1;
        while (ptr>=0) {
            p=p+s.charAt(ptr);
            ptr --;
        }
        System.out.println(p);
        if(p.equals(s1)){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("not a palindrome");
        }
    }
}
