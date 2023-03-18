
//Get the input from the user and check whether that number is a perfect number or not.

//E.g. Let number is 28, factors of 28 are 1,2,4,7,14(not the number itself. Now the sum of all these factors are 28 itself.


import  java.util.*;
public class day16 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your number ");
        int n=sc.nextInt();
        int result=0;
        for(int i=1;i<n;i++){
            if (n%i==0){
                result=result+i;
            }
        }
        System.out.println(result);
        if (n==result){
            System.out.println("Perfect Number");
        }
        else {
            System.out.println("Not a perfect number ");
        }
    }
}
