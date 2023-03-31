
/*
Get the number of people in the room as input from the user. Then calculate the maximum number of handshakes possible among that people.

        For e.g. If there are N people in the room then the first person has to shake hand with N-1 people and second person has to shake hand with N-1-1 people i.e., N-2 handshakes are possible. Thus, it goes on.

        So total hand shakes = N-1 + N-2 + N-3 +………+1 + 0                                                                                                                                                     */


import java.util.*;
public class day26 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number of people ");
        int n=sc.nextInt();
        int result=0;
        while (n>0){
            n=n-1;
            result=result+n;
        }
        System.out.println(result);
    }
}
