package cww517;
public class Thread2 {
//    private static volatile boolean Thread.interrupted = false;
    public static void main(String[] args) throws InterruptedException {
        while (!Thread.interrupted()) {
            Thread t = new Thread(() -> {
                try {
                    System.out.println(Thread.currentThread().getName());
                    Thread.sleep(1000);    //
                } catch (InterruptedException e) {
                    e.printStackTrace();    //线程是阻塞状态，剖出异常中断线程，职位False;
                }
            });
            t.start();
            Thread.sleep(1000);
            t.interrupt();
        }
    }

}
