package cww517;
   //有一个共享变量，每次循环++
public class UnsafeThread {
    private  static int sum;
    public static void main(String[] args) {
        for (int i = 0; i <20 ; i++) { new Thread(()->{        //创建20个线程
               for(int j=0;j<10000;j++){
                   sum++;
               }
            }).start();
        }
        while (Thread.activeCount()>2) {     //子线程还存在。idea的run的话就为2
            Thread.yield();  //当前线程main由运行态转变华为就绪态
            System.out.println(sum);
        }
    }
}
