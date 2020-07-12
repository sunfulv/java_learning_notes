package ClassAndOOP;
/**
 * 第一次加载一个类的初始化化过程（包括父类的静态块，构造函数，子类的静态块，构造函数)
 */
public class myInitClass {
    public static void main(String[] args){
        FC cc = new CC();
    }
}

class FC{ //父类
    static{
        System.out.println("写在类定义最前面的静态代码块");
    }

    {
        System.out.println("写在类定义最前的代码块");
    }
    private static int count = 1;
    private int f_id = -1;
    //父类的代码块
    {
        System.out.println("加载父类的代码块,f_id为"+f_id);
        f_id++;
        System.out.println("在代码块中给f_id赋值为"+f_id);
        
    }
    //父类的静态代码块
    static{
        System.out.println("加载父类的静态代码块,静态属性 count为"+count);
        count++;
        System.out.println("在静态代码块中给count赋值为"+count);
    }

    public FC(){
        System.out.println("加载父类的构造函数");
        System.out.println("父类的静态变量count的值"+count+" "+"父类的变量f_id的值"+f_id);
        
    }

}

class CC extends FC{ //继承FC的子类

    private static int c_count = 1;
    private int c_id = -1;

    {//子类的代码块
        System.out.println("加载子类的代码块，属性c_id的值为"+c_id);
        c_id++;
        System.out.println("在子类中为c_id赋值为"+c_id);
    }

    static{ //子类的静态代码块
        System.out.println("加载子类的代码块，静态属性c_count值为"+c_count);
        c_count++;
        System.out.println("在静态代码块中为c_count赋值为"+c_count);
    }

    public CC(){ //子类的构造函数
        System.out.println("执行子类的构造函数");
        System.out.println("静态属性c_count的值为"+c_count+" "+"子类属性c_id的值为"+c_id);
    }
}