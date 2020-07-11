package ArrayOperator;
/**
 * 对于一个固定长度的数组，利用Arrays中的数组复制方法CopyOf来为数组扩容
 */
import java.util.Scanner;
import java.util.Arrays;
public class myArrayExpand {
    public static void main(String[] args){
        System.out.println("输入一个特定的整数值作为初始长度:");
        Scanner sc = new Scanner(System.in);
        int N0 = sc.nextInt();
        int[] array = new int[N0];
        int[] new_array = Arrays.copyOf(array, array.length*2);
        System.out.println("旧数组地址:"+array+"新数组的地址:"+new_array);
        System.out.println("旧数组地址:"+array.length+"新数组的长度"+new_array.length);
    }
}