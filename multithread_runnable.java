class Mythreadrunnable1 implements Runnable{
    public void run()
    {
        int i=0;
        while (i<1000)
        {
        System.out.println("I am a thread 1 not a threat 1");
        i++;
        }
    }
}
class Mythreadrunnable2 implements Runnable{
    public void run()
    {
        int i=0;
        while (i<1000)
        {
        System.out.println("I am a thread 2 not a threat 2");
        i++;
        }
    }
}
public class multithread_runnable {
    public static void main(String[] args)
    {
        Mythreadrunnable1 Bullet1=new Mythreadrunnable1();
        Thread gun1=new Thread(Bullet1);
        Mythreadrunnable2 Bullet2=new Mythreadrunnable2();
        Thread gun2=new Thread(Bullet2);

        gun1.start();
        gun2.start();

    }
}