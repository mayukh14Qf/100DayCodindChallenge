/*
Anoop likes strings a lot but he likes palindromic strings more. Today, Anoop has two strings A and B, each consisting of lower case alphabets.

Anoop is eager to know whether it is possible to choose some non empty strings s1 and s2 where s1 is a substring of A, s2 is a substring of B such that s1 + s2 is a palindromic string.

Here '+' denotes the concatenation between the strings.

Input

First line of input contains a single integer T denoting the number of test cases.

For each test case:

First line contains the string A

Second line contains the string B.

Output

For each test case, Print "Yes" (without quotes) if it possible to choose such strings s1 & s2. Print "No" (without quotes) otherwise.

Input

3

abc

abc

a

b

abba

baab

Output

Yes

No

Yes
 */




import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class day66 {
    public static String check(String str1, String str2){
        char [] arr1=str1.toCharArray();
        char [] arr2=str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for (int i=0;i< arr1.length;i++){
            for (int j=0;j< arr2.length;j++) {
                if (arr2[i] == arr1[j]) {
                    return "YES";
                }
            }
        }
        return "NO";
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // Solution 1
        ArrayList<String>al=new ArrayList<>();
        int num=sc.nextInt();
        for (int i=0;i<num;i++){
            String str1=sc.next();
            String str2=sc.next();
            al.add(check(str1,str2));
        }
        al.forEach(System.out::println);

        // Solution 2
        ArrayList<String> al1=new ArrayList<>();
        int num1=sc.nextInt();
        for (int i=0;i<num1;i++){
            String str1=sc.next();
            String str2=sc.next();
            int count=0;
            for (int j=0;j<str1.length();j++){
                if (str1.contains(String.valueOf(str2.charAt(j)))){
                    count++;
                }
            }
            if (count==0){
                al1.add("NO");
            }
            else {
                al1.add("YES");
            }
        }
        al1.forEach(System.out::println);
    }
}
