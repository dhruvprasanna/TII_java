package threads;

public class mythread extends Thread{
    @Override
    public void run() {
        int i = 2;
        while (2<1000){
            try {
                Thread.sleep(100);
                i+=i;
                System.out.println(i + " A " + Thread.currentThread().isDaemon());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
