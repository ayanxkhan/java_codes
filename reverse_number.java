import java.util.Scanner;
public class reverse_number {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any number:");
        int num=sc.nextInt();
        int rev_no=0;
        while (num>0)
        {
            rev_no=rev_no*10 + num%10;
            num=num/10;
        }
        System.out.println("Reversed number="+rev_no);
    }
}
