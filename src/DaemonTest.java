
public class DaemonTest extends Thread {

    public void run() {
        System.out.println("In Run...");
        try {
            while (true) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ie) {
                }
                System.out.println("in run current thread is " + Thread.currentThread());
            }

        } finally { //เท็จ
            System.out.println("in run stop");
        }
    }

    public static void main(String[] args) {
        System.out.println("In main..");
        DaemonTest t1 = new DaemonTest();
        t1.setDaemon(true);
        t1.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ie) {

        }
        System.out.println("main exit...");
    }
}
