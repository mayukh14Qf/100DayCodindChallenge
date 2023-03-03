import java.util.*;
public class day2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your character");
        char c=sc.next().charAt(0);
        if(('A'<=c && 'z'>=c)||('a'<=c && 'z'>=c)){
            System.out.println("Alphabet");
        }
        else {
            System.out.println("Not an alphabet");
        }
    }
}
