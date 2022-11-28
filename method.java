//A method is a function written inside a class
public class method {
    static int logic(int x,int y) {
        int z;
        if (x > y) {
            z = x + y;
        } else {
            z = (x + y) + 5;
        }
        return z;
    }
        public static void main(String[] args)
        {
            int a=1;
            int b=2;
            int c;
            c=logic(a,b);
            System.out.println(c);
            int a1=2;
            int b1=1;
            int c1;
            c1=logic(a1,b1);
            System.out.println(c1);
        }
    }

