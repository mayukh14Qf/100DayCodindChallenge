
//Get an input character from the user and give the ASCII value of the given input as the output.

import java.util.*;
public class Day3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your character");
        char c=sc.next().charAt(0);
        int i=(int) c;
        System.out.println(i);
    }
}
