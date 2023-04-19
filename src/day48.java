/*
Get an array as input from the user and then remove all the duplicate elements in that array.

Input:
Enter the size of array
5

Enter the elements of array
35 35 45 60 60

Output:
35 45 60
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class day48 {
    public static void checkDuplicate(int [] arr1){
        Arrays.sort(arr1);
        ArrayList<Integer> list1=new ArrayList<>();
        for(int i=0;i<arr1.length;i++){
            while (i<arr1.length-1 && arr1[i]==arr1[i+1]){
                i++;
            }
            list1.add(arr1[i]);
        }
        Object[] object=list1.toArray();
        for (Object obj: object){
            System.out.print(obj+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        int [] arr1=new int[size];
        System.out.println("Enter the elements of array");
        for (int i=0;i<size;i++){
            arr1[i]=sc.nextInt();
        }
        checkDuplicate(arr1);
    }
}
