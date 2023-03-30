
//Get an input string from user and print it in reverse order.

import java.util.*;
public class day28 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your String");
        String s=sc.nextLine();
        String p="";
        int ptr=s.length()-1;
        while (ptr>=0){
            p=p+s.charAt(ptr);
            ptr--;
        }
        System.out.println(p);
    }
}