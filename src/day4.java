import java.util.*;
public class day4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter you number");
        int a=sc.nextInt();
        if (a==0){
            System.out.println("Neither positive nor negative");
        } else if (a>0) {
            System.out.println("Positive");
        }
        else {
            System.out.println("Negative");
        }
    }
}
