package cww517;
public class Thread4 {
    public static  class MyRunnable implements Runnable{
        @Override
        public void run() {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
////
//                System.out.println("收到异常情况！");
//            }
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.interrupted());
            }
        }
    }

    public static void main(String[] args) {
        MyRunnable target = new MyRunnable();
        Thread thread = new Thread(target, "李四");
        thread.start();
        thread.interrupt();
    }
}
