
/*
Get a string as the input from the user and print the non-repeating characters in a string.

Input
Hello

Output
H e o
 */

import java.util.Scanner;
public class day38 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your String ");
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++){
            int count=1;
            for(int j=0;j<s.length();j++){
                if (s.charAt(i)==s.charAt(j) && i!=j ){
                    count ++;
                }
            }
           if(count==1){
               System.out.print(s.charAt(i)+" ");
           }
        }
    }
}
