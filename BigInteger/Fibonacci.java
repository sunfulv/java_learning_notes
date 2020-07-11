package BigInteger;

/**
 * 利用java的大数类BigTnteger来计算斐波那契数列，看能计算多大
 * 
 */

import java.math.BigInteger;
import java.util.Scanner;
public class Fibonacci {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("输入要计算的斐波那契的项数");
        int N = sc.nextInt(); //从控制面板输入要计算的斐波那契项数
        sc.close();
        // int_Fibonacci(N);
        BigInteger_fibonacci(N);
    }

    public static void int_Fibonacci(int N){
       
        if(N<=1) {
            System.out.println(N);
            return ;
        }

        long f0 = 0;
        long f1 = 1;
        long fn = 0;
        for(int i=2;i<=N;i++){
            fn = f1+f0;
            f0 = f1;
            f1 = fn;
            if(fn<0) {
                System.out.printf("计算F_%d时超出最大范围",i);
                break;
            }
        }
        System.out.println(fn);
    }

    public static void BigInteger_fibonacci(int N){
        BigInteger f0 = BigInteger.valueOf(0);
        BigInteger f1 = BigInteger.valueOf(1);
        BigInteger f2 = BigInteger.valueOf(0);
        if(N<=1) {
            System.out.println(N);
            return;
        }
        for(int i=2;i<=N;i++){
            f2 = f1.add(f0);
            f0 = f1;
            f1 = f2;

        }
        System.out.println(f2);
    }
}