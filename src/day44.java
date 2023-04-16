
/*
Get an array as input from the user and then count the number of even and odd elements present in the array.

Input:
Enter size of array
4

Enter the elements :
1 3 4 5

Output:
Number of even elements :
1

Number of odd elements :
3
 */
import java.util.Scanner;
public class day44 {
    public static void check(int [] arr){
        int even=0;
        int odd=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                even++;
            }
            else {
                odd ++;
            }
        }
        System.out.println("Number of even elements :");
        System.out.println(even);
        System.out.println("Number of odd elements :");
        System.out.println(odd);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of array");
        int size= sc.nextInt();
        System.out.println("Enter the elements :");
        int [] arr=new int[size];
        for (int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        check(arr);
    }
}
