
/*
Get a string as input from the user and then get another string which has to be removed from the string.
Get the third input, the new substring which is placed in that substring position.
Finally print the output by replacing the substring with new string.

Enter a string
talentbattle

Enter the substring to be removed :
talent

Enter the new substring :
student

Output
The new string :
studentbattle
 */




import java.util.Scanner;
public class day40 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your String");
        String s=sc.nextLine();
        System.out.println("Enter the substring to be removed :");
        String p=sc.nextLine();
        System.out.println("Enter the new substring :");
        String q= sc.nextLine();
        String r= s.replace(p,q);
        System.out.println("The new string : \n "+r);
    }
}
