package wipro_talent_next;

import java.util.Scanner;

public class Sum_Even_Odd {
    public static void main(String[] args) {
        System.out.println("Enter first number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        System.out.println("Enter second number");
        int b = sc.nextInt();

        int sum = a+b;
        if(sum%2==0)
        {
            System.out.println("Sum is even");
        }else
        {
            System.out.println("Sum is odd");
        }
    }
}
