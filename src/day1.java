import java.util.*;
public class day1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your character");
        char c=sc.next().charAt(0);
        if( c=='a' || c=='e' || c=='i' || c=='o'|| c=='u' || c=='A' || c=='E' || c=='I' || c=='O'|| c=='U'){
            System.out.println("Vowel");
        } else if (c=='0' || c=='1' || c=='2' || c=='3'|| c=='4' || c=='5' || c=='6' || c=='7' || c=='8' || c=='9') {
            System.out.println("Invalid input");
        }
        else {
            System.out.println("Consonant");
        }
    }
}
