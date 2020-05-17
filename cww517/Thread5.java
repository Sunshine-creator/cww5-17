package cww517;
public class Thread5 {
    private static class MyRunnable implements Runnable{
        @Override
        public void run() {
//            void runpublic () {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().isInterrupted());
                }
        }
    }
    public static void main(String[] args) throws InterruptedException {
        MyRunnable target = new MyRunnable();
        Thread thread = new Thread(target, "李四");
        thread.start();
        thread.interrupt();
    }
}
