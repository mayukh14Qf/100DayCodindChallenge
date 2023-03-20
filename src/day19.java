

//Get an input number from user and check whether the given number is an Armstrong number or not.

//E.g. Let the number be 1634,

//Here 1^4 + 6^4 + 3 ^4 + 4^4 = 1634

//Therefore, this is an Armstrong number


import java.util.*;
public class day19 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your number");
        int num= sc.nextInt();
        int n1=num; int count=0;
        while(n1>0){
            count=count+1;
            n1=n1/10;
        }
        int n2=num; int result=0;
        while (n2>0){
            result=result+(int)(Math.pow((n2%10),count));
            n2=n2/10;
        }
        if(result==num){
            System.out.println("Armstrong number");
        }
        else {
            System.out.println("Not an Armstrong number");
        }
    }
}
