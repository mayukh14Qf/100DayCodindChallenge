/*
you will be given queries. Each query is of one of the following three types: :

Add an element to the set. :

Delete an element from the set. (If the number is not present in the set, then do nothing). :

If the number is present in the set, then print "Yes"(without quotes) else print "No"(without quotes).

Input Format

The first line of the input contains where is the number of queries. The next lines contain query each. Each query consists of two integers and where is the type of the query and is an integer.

Constraints



Output Format

For queries of type print "Yes"(without quotes) if the number is present in the set and if the number is not present, then print "No"(without quotes).

Each query of type should be printed in a new line.

Sample Input

8

1 9

1 6

1 10

1 4

3 6

3 14

2 6

3 6

Sample Output

Yes

No

No
 */


import java.util.*;
public class day68 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        Set<Integer> s=new TreeSet<>();
        ArrayList<String> al= new ArrayList<>();
        for (int i=0;i<num;i++){
            int c=sc.nextInt();
            int n=sc.nextInt();
            if (c==1){
                s.add(n);
            }
            if (c==2){
                if (s.contains(n)) {
                    s.remove(n);
                }
                else {
                    continue;
                }
            }
            if (c==3){
                if (s.contains(n)){
                    al.add("YES");
                }
                else {
                    al.add("NO");
                }
            }
        }
        al.forEach(System.out::println);
    }
}
