package cww517;
public class ThreadInterrupted {
    Thread t = new Thread(()->{
        for (int i = 0; i <10 ; i++) {
            System.out.println(Thread.interrupted());  //true ,false,false,false  返回中断线程，并且重置
            System.out.println(Thread.currentThread().isInterrupted());//true,true,true,true,返回中断线程，并且不重置
//            Thread.sleep();
        }
    });
}
