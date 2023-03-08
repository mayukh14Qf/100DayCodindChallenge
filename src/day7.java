import java.util.*;
public class day7 {
    static int leap(int a){
        if(a%4==0 && a%100!=0){
            return 1;
        } else if (a%400==0) {
            return 1;
        }
        else {
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter month : ");
        int m=sc.nextInt();
        System.out.println("enter year : ");
        int y=sc.nextInt();
        if (m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12){
            System.out.println(31);
        } else if (m==4 || m==6 || m==9 || m==11) {
            System.out.println(30);
        } else if (m==2 && leap(y)==1) {
            System.out.println(29);
        } else if (m==2 && leap(y)==0) {
            System.out.println(28);
        }
    }
}
