package code.IO;
/**
 * 测试Scanner类的各种方法来进行输入，以及java中的格式化输出方法 System.out.printf()
 * @author sunfulv
 * 
 */
import java.util.Scanner;

public class myScanner {
    public static void main(String[] atgs){
        Scanner sc = new Scanner(System.in);
        // String s = sc.nextLine(); //读取控制台输入的一行数据，以字符串的形式
        // s=s.trim(); //trim()方法去掉读入的字符串中的前后空格
        // System.out.print(s);

        
        // System.out.println("输入一行单词，单词之间用空格隔开");
        // String word = null;
        // while(sc.hasNext()){
        //     //next()方法迭代的读取下一个字符序列，每个字符序列之间由空格隔开   
        //     word = sc.next();
        //     System.out.println(word);
        // }

        System.out.println("输入一行数字，数字之间用空格隔开");
        double digit = 0;
        int i = 0;
        while(sc.hasNextDouble()){
            digit = sc.nextDouble();
            String s = String.format("输入的第%d个数字,%4.2f\n",++i,digit); //这里构造了一个格式化字符串，很有用
            System.out.print(s);
            System.out.printf("输入的第%d个数字,%4.2f\n",i,digit); //格式化输出
        }

        sc.close();

    

    }
}