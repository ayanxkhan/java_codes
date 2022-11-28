public class palindrome_number {
    public static void main(String[] args)
    {
        int num=121;
        int temp=num;
        int rev_no=0;
        while (num>0)
        {
            rev_no=rev_no*10 + num%10;
            num=num/10;
        }
        if(rev_no==temp)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not a palindrome");
        }


    }
}
