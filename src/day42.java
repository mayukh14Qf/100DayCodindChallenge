

/*
Get two arrays as the input from the user and check whether it is the same or not.

Input

Enter the size of first array :
3

Enter the size of second array :
3

Enter elements of first array :
1 2 3

Enter elements of second array :
1 2 3

Output
Same

 */

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class day42 {
    public static  boolean isEqual(int [] arr1 , int [] arr2){
        if(arr1.length!=arr2.length){
            return false;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0;i<arr1.length;i++){
            if (arr1[i]!=arr2[i]){
                return  false;
            }
        }
        return  true;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of first array :");
        int s1=sc.nextInt();
        System.out.println("Enter the size of second array :");
        int s2=sc.nextInt();
        int [] arr1=new int[s1];
        System.out.println("Enter elements of first array :");
        for(int i=0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();
        }
        int [] arr2=new int[s2];
        System.out.println("Enter elements of second array :");
        for(int j=0;j<arr2.length;j++){
            arr2[j]=sc.nextInt();
        }
        if (isEqual(arr1,arr2)){
            System.out.println("same");
        }
        else {
            System.out.println("not same");
        }
    }
}
