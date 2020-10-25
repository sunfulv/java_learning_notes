/*
定义两个线程A和B，让两个线程按顺序交替输出偶数和奇数(A输出偶数，B输出奇数)
*/
public class ThreadNum {
    public static volatile int flag = 0;
    private static final int N  = 200;
    public static void main(String[] args) {
        //AtomicInteger flag = new AtomicInteger(0);

        Thread r1 = new Thread( //线程A用来输出偶数
            ()->{
                while(flag<=N){
                    while(flag%2==1&&flag<=N);           //循环判断当前flag是否是偶数
                    //lock.lock(); //先获取锁
                    System.out.println(Thread.currentThread().getName()+"打印:"+flag);
                    flag++;//自增1
                    //lock.unlock();//释放锁
                }
            }
        );

        Thread r2 = new Thread(//线程B用来输出奇数
            ()->{
                while(flag<N){
                    while(flag%2==0&&flag<N);
                    //lock.lock();
                    System.out.println(Thread.currentThread().getName()+"打印:"+flag);
                    flag++;
                   // lock.unlock();
                }
            }
        );
        r1.setName("线程A");
        r2.setName("线程B");
        r1.start();
        r2.start();
    }
}