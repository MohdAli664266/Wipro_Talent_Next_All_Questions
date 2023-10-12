package wipro_talent_next;

import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        if(num%2==0)
        {
            System.out.println("Given number is even");
        }else
        {
            System.out.println("Given number is odd");
        }
    }
    
}
