
/*
Get an array as input from the user and then find the smallest and largest element in the array.

Input:
Enter the size of array :
5

Enter the elements :
10 20 5 40 30

Output:
Smallest Number :
5

Largest Number :
40
 */





import java.util.Arrays;
import java.util.Scanner;
public class day45 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int size=sc.nextInt();
        int [] arr=new int[size];
        System.out.println("Enter the elements :");
        for (int i=0;i<size;i++){
            arr[i]= sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Smallest Number :");
        System.out.println(arr[0]);
        System.out.println("Largest Number :");
        System.out.println(arr[arr.length-1]);
    }
}
