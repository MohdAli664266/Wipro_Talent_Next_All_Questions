package wipro_talent_next;

import java.util.Scanner;

public class Return_Second_last_digit {
    public int second_last_digit(int num)
    {
        num = num/10;
        if(num<0)
        {
            return (num%10)/-1;
        }
        return num%10;
    }
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num  =  sc.nextInt();
        sc.close();
        if(String.valueOf(num).length()<2)
        {
            System.out.println("Sorry! input is wrong");
        }else
        {
            System.out.println(new Return_Second_last_digit().second_last_digit(num));
        }
    }
}
