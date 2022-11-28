public class fibonacci_series {
    public static void main(String[] args)
    {
        System.out.println("Fibonacci series:");
        int a=0;
        System.out.println(a);
        int b=1;
        System.out.println(b);
        int fib;
        for(int i=1;i<9;i++)
        {
            fib=a+b;
            System.out.println(fib);
            a=b;
            b=fib;
        }
    }
}
