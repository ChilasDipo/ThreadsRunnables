public class runnable implements Runnable {
    int tal = 0;
    int sleeptime = 0;

    public runnable(int tal, int sleeptime) {
        this.tal = tal;
        this.sleeptime = sleeptime;

    }

    @Override
    public void run() {
        try {
            Thread.sleep(sleeptime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(tal);
    }
}
