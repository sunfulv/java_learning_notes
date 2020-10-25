import java.util.concurrent.atomic.AtomicInteger;

/*
定义两个线程A和B，让两个线程按顺序交替输出偶数和奇数(A输出偶数，B输出奇数)
*/
class Num{
    private int value;
    public Num(int value){
        this.value = value;
    }
    public int get(){
        return this.value;
    }
    public int incrementAndGet(){
        this.value=this.value+1;
        return this.value;
    }
}
public class ThreadPrint {
    public static void main(String[] args) {
        //AtomicInteger flag = new AtomicInteger(0);
        Num flag = new Num(0);
        Thread r1 = new Thread( //线程A用来输出偶数
            ()->{
                while(flag.get()<=100){
                    while(flag.get()%2==1&&flag.get()<=100);           //循环判断当前flag是否是偶数
                    //lock.lock(); //先获取锁
                    System.out.println(Thread.currentThread().getName()+"打印:"+flag.get());
                    flag.incrementAndGet();//自增1
                    //lock.unlock();//释放锁
                }
            }
        );

        Thread r2 = new Thread(//线程B用来输出奇数
            ()->{
                while(flag.get()<100){
                    while(flag.get()%2==0&&flag.get()<100);
                    //lock.lock();
                    System.out.println(Thread.currentThread().getName()+"打印:"+flag.get());
                    flag.incrementAndGet();
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