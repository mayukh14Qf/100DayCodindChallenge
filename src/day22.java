
//Get a number as an input from the user and express that number as sum of two prime numbers.

//Input

//4

//Output

//4 can be expressed as sum of 2 and 2


import java.util.*;
public class day22 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your number : ");
        int a=sc.nextInt();
        List<Integer> nums= new ArrayList<>();
        int count=0;
        if(a<2){
            System.out.println("put something 2 or more than 2");
        }
        for(int i=2;i<=a;i++){
            for (int j=1;j<=i;j++){
                if(i%j==0){
                    count=count+1;
                }
            }
            if(count==2){
                nums.add(i);
            }
            count=0;
        }
        System.out.println(nums);
        int j,i;
        for(i=0;i<=nums.size()-1;i++){
            for(j=i;j<=nums.size()-1;j++){
                if((nums.get(i)+ nums.get(j))==a){
                    System.out.println(a+" can be expressed as sum of "+ nums.get(i)+" and "+nums.get(j));
                }
            }
        }
    }
}
