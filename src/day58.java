/*
Bucket Filling

Nejiya has a bucket having a capacity of K liters. It is already filled with X liters of water.

Find the maximum amount of extra water in liters that Nejiya can fill in the bucket without overflowing.

Input Format

The first line will contain T - the number of test cases. Then the test cases follow.

The first and only line of each test case contains two space separated integers K and X - as mentioned in the problem.

Output Format

For each test case, output in a single line, the amount of extra water in liters that Nejiya can fill in the bucket without overflowing.

Sample Input 1

2

5 4

15 6

Sample Output 1

1

9
 */


import java.util.ArrayList;
import java.util.Scanner;
public class day58 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        ArrayList<Integer> al1= new ArrayList<>();
        for (int i=0; i<num;i++){
            int k=sc.nextInt();
            int x=sc.nextInt();
            if (k>x){
                al1.add(k-x);
            }
            else {
                al1.add(x-k);
            }
        }
        for (int ans: al1){
            System.out.println(ans);
        }
    }
}
