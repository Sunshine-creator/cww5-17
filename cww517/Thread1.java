package cww517;
public class Thread1 {
    private static class MyRunnable implements Runnable{
        public volatile boolean isQuit = false;
        @Override
        public void run() {
            while (!isQuit){
                System.out.println(Thread.currentThread().getName()+"赶紧！给我个少将干干");
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName()+"差点凉了！");
        }
        public static void main(String[] args) throws InterruptedException {      //终止线程
            MyRunnable target = new MyRunnable();
            Thread thread = new Thread(target,"陈大将");
            System.out.println(Thread.currentThread().getName()+"赶紧发布任命状！");
            thread.start();
            Thread.sleep(10*1000);
            System.out.println(Thread.currentThread().getName()+"梦醒了，起来搬砖了！");
            target.isQuit=true;
        }
    }


}
