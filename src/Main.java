public class Main
{
    public static void main(String[] args) {
   Thread thread1 = new Thread( new runnable(8,6000));
        Thread thread2 = new Thread( new runnable(1,3000));
        Thread thread3 = new Thread( new runnable(2,12000));
        Thread thread4 = new Thread( new runnable(5,9000));
         thread2.start();
        thread1.start();
        thread4.start();
        thread3.start();
        int n = 50;
        for (int i = 0; i <n ; i++) {
            Thread thread = new Thread(new runnable2("name" + i, i*1000 ));
            thread.start();
        }


    }
}
