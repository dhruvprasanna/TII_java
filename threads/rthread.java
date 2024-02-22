package threads;

public class rthread implements Runnable{
    @Override
    public void run() {
        try {
            int i = 5;
            while (5 < 1000){
                Thread.sleep(200);
                i*=5;
                System.out.println(i + " C");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
