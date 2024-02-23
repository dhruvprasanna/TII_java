package threads;

public class thread {
    public static void main(String[] args) throws InterruptedException {
        mythread mt = new mythread();
        mt.start();
        rthread mt2 = new rthread();
        Thread t2 = new Thread(mt2);
        t2.setDaemon(true);
        t2.start();
        for (int i = 3;i<10000;i*=i){
            System.out.println(i+" B");
            Thread.sleep(200);
        }
    }
}
