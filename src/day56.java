/*
Check whether the numbers of array be made equal or not

For eg, for the following input it should print yes because

50*2*3 , 75*2*2 and 150*2 are equal to 300 in all cases. So array numbers can be made equal

Input

3

50 75 150

Output

Yes
 */
import java.util.Scanner;
public class day56 {
    public static String checkMadeEqual(int [] arr){
        for (int i=0;i< arr.length;i++){
            while (arr[i]%2==0){
                arr[i]=arr[i]/2;
            }
            while (arr[i]%3==0){
                arr[i]=arr[i]/3;
            }
        }
        for (int i=1;i<arr.length;i++){
            if (arr[i]!=arr[0]){
                return "No";
            }
        }
        return "Yes";
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter size of the Array");
        int size=sc.nextInt();
        int [] arr=new int[size];
        System.out.println("enter Array element");
        for (int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(checkMadeEqual(arr));
    }
}
