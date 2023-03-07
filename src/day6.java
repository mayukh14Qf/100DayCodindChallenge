import java.util.*;
public class day6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your points/coordinates (x,y) ");
        int a=sc.nextInt(), b=sc.nextInt();
        if(a==0 && b==0){
            System.out.println("point is origin");
        } else if (a>0 && b>0) {
            System.out.println("This point lies in first quadrant.");
        } else if (a<0 && b>0) {
            System.out.println("This point lies in second quadrant.");
        } else if (a<0 && b<0) {
            System.out.println("This point lies in third quadrant.");
        } else if (a>0 && b<0) {
            System.out.println("This point lies in fourth quadrant.");
        }
    }
}
