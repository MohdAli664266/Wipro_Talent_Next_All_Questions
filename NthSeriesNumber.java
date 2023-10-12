package wipro_talent_next;
public class NthSeriesNumber
{
    public static int nthSerialNumber(int a, int b, int c, int num)
    {
        if(num==0)
        {
            return 0;
        }
        int[] arr = new int[num];
        arr[0] = a;
        arr[1] = b;
        arr[2] = c;
        for(int i=3; i<num; i++)
        {
            int diff = arr[i-2]-arr[i-3];
            int addAble = arr[i-1]+diff;
            arr[i] = addAble;
        }
        for(int val:arr)
        {
            System.out.print(val+" ");
        }
        System.out.println();
        return arr[num-1];
    }
    public static void main(String[] args)
    {
        int nth = nthSerialNumber(1, 3, 8, 9);
        System.out.println(nth);
        
    }
}