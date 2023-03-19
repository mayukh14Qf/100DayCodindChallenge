

//Get the values for numerator and denominator of two fractions, then add that fractions. Consider the following format

//x3/y3 = (x1/y1) + (x2/y2)

//here x3 = (x1*y2) + (x2*y1) and y3 = (y1*y2)


import java.util.*;
public class day18 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your x1: ");
        int x1=sc.nextInt();
        System.out.println("enter your x2: ");
        int x2=sc.nextInt();
        System.out.println("enter your y1: ");
        int y1=sc.nextInt();
        System.out.println("enter your y2: ");
        int y2=sc.nextInt();

        int x3=(x1*y2)+(x2*y1);
        int y3=y1*y2;
        int div;
        if(x3>y3){
            div=y3;
        }
        else {
            div=x3;
        }
        for(int i=div;i>0;i--){
            if(x3%i==0 && y3%i==0){
                x3=x3/i;
                y3=y3/i;
            }
        }
        System.out.println(x3+"/"+y3);
    }
}
