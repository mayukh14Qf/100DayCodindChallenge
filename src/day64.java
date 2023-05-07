/*
Lots of geeky customers visit our Amit's restaurant everyday. So, when asked to fill the feedback form, these customers represent the feedback using a binary string (i.e a string that contains only characters '0' and '1'.

Now since Amit is not that great in deciphering binary strings, he has decided the following criteria to classify the feedback as Good or Bad :

If the string contains the substring "010" or "101", then the feedback is Good, else it is Bad. Note that, to be Good it is not necessary to have both of them as substring.

So given some binary strings, you need to output whether according to the Amit, the strings are Good or Bad.

Input

The first line contains an integer T denoting the number of feedbacks. Each of the next T lines contains a string composed of only '0' and '1'.

Output

For every test case, print in a single line Good or Bad as per the Amit's method of classification.

Input:

2

11111110

10101010101010

Output:

Bad

Good
 */


import java.util.ArrayList;
import java.util.Scanner;
public class day64 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        ArrayList<String> al = new ArrayList<>();
        for (int i=0;i<num;i++){
            String s=sc.next();
            if (s.contains("101") || s.contains("010")){
                al.add("GOOD");
            }
            else {
                al.add("BAD");
            }
        }
        al.forEach(System.out::println);
    }
}
