
/*
Get a string from the user and then change the first and last letter to uppercase.

Input
programming

Output
ProgramminG
 */






import java.util.Scanner;
public class day36 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your String ");
        String s=sc.nextLine();
        StringBuilder sb= new StringBuilder("");
        for (int i=0;i<s.length();i++){
            if(i==0){
                sb.append(Character.toUpperCase(s.charAt(i)));
            }
            else if(i==(s.length()-1)){
                sb.append(Character.toUpperCase(s.charAt(i)));
            }
            else {
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
}
