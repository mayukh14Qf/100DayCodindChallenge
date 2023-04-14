
/*
Get an array as input from the user and check the type of the array, whether it is odd, even or mixed type.

Input
Enter size of array :
3

Enter elements
1 3 5

Output
Odd

 */



import java.util.Scanner;
public class day43 {
    public static void check1(int [] arr){
        int odd=0;
        int even=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                even++;
            }
            else {
                odd ++;
            }
        }
        if(odd==arr.length){
            System.out.println("odd");
        }
        else if(even==arr.length){
            System.out.println("even");
        }
        else {
            System.out.println("mixed");
        }
    }
    public static String check(int [] arr){
        int flag=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                continue;
            }
            else {
                flag=1;
            }
            while (i<arr.length-1){
                if ((arr[i]%2==0 && arr[i+1]%2!=0 ) || (arr[i]%2!=0 && arr[i+1]%2==0 )) {
                return "mixed";
                }
                i++;
            }
        }
        if (flag==1) {
            return "odd";
        }
        else {
            return "even";
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of array :");
        int size=sc.nextInt();
        int [] arr=new int[size];
        System.out.println("Enter elements ");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(check(arr));
        check1(arr);
    }
}
