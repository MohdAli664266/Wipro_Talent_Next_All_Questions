package wipro_talent_next;
public class NthFibonacci {
    public static int fibonacci(int a)
   {
      if(a == 1)
      {
         return 0;
      }else if(a==2)
      {
         return 1;
      }else if(a ==3)
      {
         return 1;
      }else
      {
         return fibonacci(a-1) + fibonacci(a-2);
      }
      
   }
   public static void main(String[] args) {
      System.out.print(fibonacci(5)+" ");
   }
    
}
