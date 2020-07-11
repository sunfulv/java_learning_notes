package code.IO;
/**
 * 这里创建一个Scanner对象来读取文件
 * 可以使用PrintWriter类将数据写入文件（如果文件不存在就穿件一个新文件）
 */

import java.util.Scanner;

import java.io.IOException;
import java.io.PrintWriter;

import java.nio.file.Paths;

public class myScannerReadFile {
    public static void main(String[] args) throws IOException {
        String file_name = "file.txt";
        PrintWriter out = new PrintWriter(file_name,"UTF-8"); //创建一个PrintWriter对象，如果文件不存在，就创建
        out.println("Hello World!"); //这里构造了一个像文件输出的对象out后，就能使用对应的各种print()方法了
        out.println("你好 世界!");
        out.close();
        Scanner sc = new Scanner(Paths.get(file_name),"UTF-8");
        //同理，创建了一个关联文件的Scanner对象sc,就可以使用Scanner的相关方法来读取文件中的数据
        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());//将文件中的每一行输出到控制台上
        }
        sc.close();
    }
    
}