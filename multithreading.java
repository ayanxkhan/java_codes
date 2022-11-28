class mythread1 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<1000)
        {
            System.out.println("My cooking thread is running");
            System.out.println("I am happy");
            i++;
        }
    }
}
class mythread2 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 1000) {
            System.out.println("Thread 2 for chatting with her");
            System.out.println("I am sad");
            i++;
        }
    }
}
public class multithreading {
    public static void main(String[] args)
    {
        mythread1 t1=new mythread1();
        mythread2 t2=new mythread2();
        t1.start();
        t2.start();
    }
}
