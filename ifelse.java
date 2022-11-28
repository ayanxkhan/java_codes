import java.util.Scanner;
public class ifelse {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your age:");
        int age=sc.nextInt();
        System.out.printf("You have entered %d as your age\n",age);
        if (age>18)
        {
            System.out.println("You can vote");
        }
        else
        {
            System.out.println("You cannot vote");
        }

    }
}
