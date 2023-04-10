
/*
Get two strings as input from the user and check whether it is Anagram or not.

Input
sunlight
thgiluns

Output
Anagram
 */

import java.util.Arrays;
import java.util.Scanner;
public class day39 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your 1st String");
        String s=sc.nextLine();
        System.out.println("Enter your 2nd String ");
        String p=sc.nextLine();

        char [] arr1=s.toCharArray();
        char [] arr2=p.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(arr1.length != arr2.length){
            System.out.println("Not Anagram");
        }
        int b=0;

        for (int i=0;i< arr1.length;i++){
            int a=1;
            if(arr1[i]==arr2[i]){
                b=a;
            }
            else {
                b=0;
                System.out.println("not Anagram");
                break;
            }
        }
        if(b==1){
            System.out.println("Anagram");
        }

    }
}
