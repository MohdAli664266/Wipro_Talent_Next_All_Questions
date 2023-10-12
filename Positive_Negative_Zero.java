package wipro_talent_next;

import java.util.Scanner;

public class Positive_Negative_Zero {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        if(num>0)
        {
            System.out.println("Positive");
        }else if(num<0)
        {
            System.out.println("Negative");
        }else
        {
            System.out.println("Zero");
        }
    }
    
}
