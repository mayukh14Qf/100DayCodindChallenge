/*
Given the time control of a chess match as a+b, determine which format of chess out of the given 4 it belongs to.

1) Bullet if a+b<3

2) Blitz if 3≤a+b≤10

3) Rapid if 11≤a+b≤60

4) Classical if 60<a+b

Input Format

First line will contain T, number of testcases. Then the testcases follow.

Each testcase contains a single line of input, two integers a,b

Output Format

For each testcase, output in a single line, answer 1 for bullet, 2 for blitz, 3 for rapid, and 4 for classical format.

Sample Input 1

4

1 0

4 1

100 0

20 5

Sample Output 1

1

2

4

3
 */
import java.util.ArrayList;
import java.util.Scanner;
public class day61 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<Integer>al = new ArrayList<>();
        int num=sc.nextInt();
        for (int i=0;i<num;i++){
            int a=sc.nextInt();
            int b= sc.nextInt();
            if (a+b<3){
                al.add(1);
            }
            else if ((a+b)>=3 && (a+b)<=10) {
                al.add(2);
            }
            else if ((a+b)>=11 && (a+b)<=60) {
                al.add(3);
            }
            else {
                al.add(4);
            }
        }
        al.forEach(n-> System.out.println(n));
    }
}
