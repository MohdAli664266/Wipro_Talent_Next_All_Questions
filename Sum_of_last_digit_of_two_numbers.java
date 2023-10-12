package wipro_talent_next;

import java.util.Scanner;

public class Sum_of_last_digit_of_two_numbers {
    public static int last_digit(int num)
    {
        if(num<0)
        {
            return (num%10)/-1;
        }
        return num%10;
    }
    public static void main(String[] args) {
        System.out.println("Enter first number");
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();
        System.out.println("Enter second number");
        int s = sc.nextInt();
        sc.close();
        int sum = last_digit(f)+last_digit(s);
        System.out.println("Sum of the last digits : "+sum);
    }
}
