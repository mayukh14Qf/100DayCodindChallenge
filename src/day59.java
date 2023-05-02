/*
Body Mass Index

You are given the height H (in metres) and mass M (in kilograms) of Anusree. The Body Mass Index (BMI) of a person is computed as M/H^2.

Report the category into which Anusree falls, based on his BMI:

Category 1: Underweight if BMI ≤18

Category 2: Normal weight if BMI ∈{19, 20,…, 24}

Category 3: Overweight if BMI ∈{25, 26,…, 29}

Category 4: Obesity if BMI ≥30

Input:

The first line of input will contain an integer, T, which denotes the number of testcases. Then the testcases follow.

Each testcase contains a single line of input, with two space separated integers, M,H, which denote the mass and height of Anusree respectively.

Output:

For each testcase, output in a single line, 1,2,3 or 4, based on the category in which Anusree falls.

Sample Input:

3

72 2

80 2

120 2

Sample Output:

1

2

4
 */



import java.util.ArrayList;
import java.util.Scanner;
public class day59 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        ArrayList<Integer> al=new ArrayList<>();
        for (int i=0;i<num;i++){
            int M=sc.nextInt();
            int H=sc.nextInt();
            double bmi=M/Math.pow(H,2);
            if (bmi<=18){
                al.add(1);
            }
            else if (19<=bmi && bmi<=24){
                al.add(2);
            }
            else if (25<=bmi && bmi<=29){
                al.add(3);
            }
            else {
                al.add(4);
            }
        }
        for (int answer: al){
            System.out.println(answer);
        }
    }
}
