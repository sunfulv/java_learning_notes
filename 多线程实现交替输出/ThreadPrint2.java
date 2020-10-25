import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/*
定义两个线程A和B，让两个线程按顺序交替输出偶数和奇数(A输出偶数，B输出奇数)
*/
public class ThreadPrint2 {
    public static volatile int flag = 0;
    private static final int N  = 50;
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        Condition c = lock.newCondition();

        Thread r1 = new Thread( //线程A用来输出偶数
            ()->{
                while(flag<=N){
                    try{
                        lock.lock();//首先获取锁
                        if(flag%2==1){//如果当前值为奇数，就将线程阻塞挂起
                            c.await();
                        }
                        System.out.println(Thread.currentThread().getName()+"打印:"+flag);
                        flag++;//自增1
                        c.signal();
                    }catch(InterruptedException e){
                            e.printStackTrace();
                    }finally{
                        lock.unlock();
                    }
                }
            }
        );

        Thread r2 = new Thread(//线程B用来输出奇数
            ()->{
                while(flag<N){
                    try{
                        lock.lock();//首先获取锁
                        if(flag%2==0){//如果当前值为偶数，就将线程阻塞挂起
                            c.await();
                        }
                        System.out.println(Thread.currentThread().getName()+"打印:"+flag);
                        flag++;//自增1
                        c.signal();
                    }catch(InterruptedException e){
                            e.printStackTrace();
                    }finally{
                        lock.unlock();
                    }
                }
            }
        );
        r1.setName("线程A");
        r2.setName("线程B");
        r1.start();
        r2.start();
    }
}