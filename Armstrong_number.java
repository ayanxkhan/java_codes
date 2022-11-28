public class Armstrong_number {
    public static void main(String[] args)
    {
        int num=153;
        int temp=num;
        int rem;
        int b=0;
        while(num>0)
        {
            rem=num%10;
            b=b+(rem*rem*rem);
            num=num/10;
        }
        if(b==temp)
        {
            System.out.println("Armstrong number");
        }
        else
        {
            System.out.println("Not an Armstrong number");
        }
    }
}
