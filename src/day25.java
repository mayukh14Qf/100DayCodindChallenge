
//Get the value for radius from the user and calculate the area of the circle for the given radius.

//Area of circle = 3.14*radius*radius


import  java.util.*;
public class day25 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your radius ");
        double r=sc.nextDouble();
        double a=Math.pow(r,2);
        double ans=(3.14*a);
        System.out.println(ans);
    }
}
