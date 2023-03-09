import java.util.*;
public class day8 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your a");
        double a=sc.nextDouble();
        System.out.println("enter your b");
        double b=sc.nextDouble();
        System.out.println("enter your c");
        double c=sc.nextDouble();
        double p=(b*b)-(4*a*c);
        double q=Math.pow(p,0.5);
        double x=(-b-q)/(2*a);
        double y=(-b+q)/(2*a);
        if(x==y){
            System.out.println("Roots are equal");
            System.out.println("Root 1= root 2 = " + x);
        }
        else {
            System.out.println("Root 1= "+x);
            System.out.println("root 2 = "+y);
        }
    }
}
