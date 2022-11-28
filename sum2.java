import java.util.Scanner;
public class sum2 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int c=num1+num2;
        System.out.println("The sum of two numbers="+c);
    }
}
