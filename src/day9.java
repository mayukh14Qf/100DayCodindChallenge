import java.util.*;
public class day9 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your number ");
        int n= sc.nextInt();
        int count=0;
        while(n!=0){
            n=n/10;
            count=count+1;
        }
        System.out.println(count);
    }
}
