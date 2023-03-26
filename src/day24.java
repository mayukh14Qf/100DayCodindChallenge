
/*Get the number of lines as the input and print stars in that many lines or rows in a pyramid shape.

Input
4

Output
   *
  ***
 *****
*******                                                                       */



import java.util.*;
public class day24 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number of lines");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for (int j=i+1;j<=n;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int j=2;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
