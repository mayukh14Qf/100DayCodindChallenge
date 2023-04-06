
/*
Get a string from the user and find the sum of numbers in the string.

Input
Hello56

Output
11
 */



import java.util.Scanner;
public class day35 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your String With number ");
        String s=sc.nextLine();
        int result=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0' || s.charAt(i)=='1' || s.charAt(i)=='2' || s.charAt(i)=='3' || s.charAt(i)=='4' || s.charAt(i)=='5' || s.charAt(i)=='6' || s.charAt(i)=='7' || s.charAt(i)=='8' || s.charAt(i)=='9' ){
                String p= String.valueOf(s.charAt(i));
                result= result+ Integer.parseInt(p);
            }
        }
        System.out.println(result);
    }
}
