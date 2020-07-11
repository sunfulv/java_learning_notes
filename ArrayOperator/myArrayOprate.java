package ArrayOperator;
/**
 * Arrays类中提供的用于操作数组的静态方法
 * 
 */

import java.util.Arrays;
public class myArrayOprate {
    public static void main(String[] args){
        int[] a = {1,2,5,4,3};
        System.out.println(Arrays.toString(a)); //使用Arrays.toString()来输出数组元素字符串(直接输出数组字符串得到的是数组的地址)
        Arrays.sort(a);  //Arrays.sort()方法对数组进行排序（从小到大排序）
        System.out.println(Arrays.toString(a));
        Arrays.fill(a,10); //Arrays.fill()方法将数组使用同一个元素进行填充
        System.out.println(Arrays.toString(a));
    }
}