


import  java.util.*;
public class day20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your number");
        int a=sc.nextInt();
        int count=0;
        if (a<2){
            System.out.println(a+" is not a prime number");
        }
        for(int i=1;i<=a;i++){
            if(a%i==0){
                count=count+1;
            }
        }
        if(count>2){
            System.out.println(a+ " is not a prime number");
        }
        else {
            System.out.println(a+" is a prime number");
        }
    }
}
