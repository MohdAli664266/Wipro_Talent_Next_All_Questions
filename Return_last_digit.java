package wipro_talent_next;

import java.util.Scanner;

public class Return_last_digit {
    public int lastDigit(int num){
        if(num<0)
        {
            return (num%10)/-1;
        }
        return num%10;
    }
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        int last = new Return_last_digit().lastDigit(num);
        System.out.println("Last digit is : "+last);
    }
}
