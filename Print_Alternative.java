package wipro_talent_next;

public class Print_Alternative {
    public static void main(String[] args) {
        System.out.println("Alternative from 1 to 99 series is written below");
        for(int i=1; i<=100; i=i+2)
        {
            System.out.println(i);
        }
        System.out.println("Alternative from 0 to 100 series is written below");
        for(int i=0; i<=100; i=i+2)
        {
            System.out.println(i);
        }
        System.out.println("Alternative backward from 100 to 0 series is written below");
        for(int i=100; i>=0; i=i-2)
        {
            System.out.println(i);
        }
        System.out.println("Alternative backward from 100 to 1 skiping by 2 series is written below");
        for(int i=100; i>=0; i=i-3)
        {
            System.out.println(i);
        }
    }
}
