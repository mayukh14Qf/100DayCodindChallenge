import java.util.*;
public class day10 {
    static int fac(int n){
        if(n>=1) {
            return  n * fac(n - 1);
        }
        else{
            return 1;
        }
    }
    public static void main(String[] args) {
        System.out.println("enter a number ");
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println(fac(a));
    }
}
