

//Get an input from the user and find the factors of the number

import  java.util.*;
public class day17 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number ");
        int a=sc.nextInt();
        for (int i=1;i<=a;i++){
            if (a%i==0){
                System.out.print(i+" ");
            }
        }
    }
}
