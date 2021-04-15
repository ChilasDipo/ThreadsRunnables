public class runnable2 implements Runnable {
    String name;
    int sleeptime = 0;

    public runnable2(String name, int sleeptime) {
        this.name = name;
        this.sleeptime = sleeptime;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(sleeptime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name);
    }
}
