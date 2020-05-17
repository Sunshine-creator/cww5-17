package cww517;

public class ThreadJoin {
    public static void main(String[] args) throws InterruptedException {
        Runnable target = (()->{
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName()+"我还在工作！");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }  
        });
        Thread thread1 = new Thread();
        Thread thread2=  new Thread();
        System.out.println("先让李四开始工作");
        thread1.start();
        thread1.join();
        System.out.println("李四工作结束了，让王五开始工作");
        thread2.start();
        thread2.join();
        System.out.println("王五工作结束了");
    }
//    public static void main(String[] args) {
//
//    }
}
