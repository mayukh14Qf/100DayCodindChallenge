/*
Good Weather

The weather report of Magicland is Good if the number of sunny days in a week is strictly greater than the number of rainy days.

Given 7 integers A1,A2,A3,A4,A5,A6,A7 where Ai=1 denotes that the ith day of week in Magicland is a sunny day, Ai=0 denotes that the ith day in Magicland is a rainy day. Determine if the weather report of Magicland is Good or not.

Input Format

First line will contain T, number of testcases. Then the testcases follow.

Each testcase contains of a single line of input, 7 space separated integers A1,A2,A3,A4,A5,A6,A7.

Output Format

For each testcase, print "YES" if the weather report of Magicland is Good, otherwise print "NO". Print the output without quotes.

You may print each character of the string in uppercase or lowercase (for example, the strings "yEs", "yes", "Yes" and "YES" will all be treated as identical).

Sample Input 1

4

1 0 1 0 1 1 1

0 1 0 0 0 0 1

1 1 1 1 1 1 1

0 0 0 1 0 0 0

Sample Output 1

YES

NO

YES

NO
 */

import java.util.ArrayList;
import java.util.Scanner;
public class day60 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        ArrayList<String>al= new ArrayList<>();
        for (int i=0;i<num;i++){
            int count1 =0;
            int count2 =0;
            ArrayList<Integer>al1=new ArrayList<>();
            int a1=sc.nextInt();
            al1.add(a1);
            int a2=sc.nextInt();
            al1.add(a2);
            int a3=sc.nextInt();
            al1.add(a3);
            int a4=sc.nextInt();
            al1.add(a4);
            int a5=sc.nextInt();
            al1.add(a5);
            int a6=sc.nextInt();
            al1.add(a6);
            int a7=sc.nextInt();
            al1.add(a7);
            for (int j=0;j<7;j++){
                if (al1.get(j)==1){
                    count1 ++;
                }
                else {
                    count2 ++;
                }
            }
            if (count1>count2){
                al.add("YES");
            }
            else {
                al.add("NO");
            }
        }
        for (String elements: al){
            System.out.println(elements);
        }
    }
}
