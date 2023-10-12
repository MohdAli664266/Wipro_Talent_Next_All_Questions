package wipro_talent_next;

import java.util.Scanner;

public class Even_function {
    public static int checkNumber(int number)
    {
        if(number%2==0)
        {
            return 2;
        }else
        {
            return 1;
        }
    }
    public static void main(String[] args)
    {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();
        int checked_number = checkNumber(number);
        System.out.println(checked_number);
    }
}
