package javaDailyProctice.Test0610;



import java.util.Scanner;

/**
 入 两 个 字 符 串， 从 第 一 字 符 串 中 删 除 第 二 个 字 符 串 中 所 有 的
 * 字 符。 例 如， 输 入” They are students.” 和” aeiou ”， 则 删 除 之 后 的 第 一 个
 * 字 符 串 变 成” Thy r stdnts.”
 *
 */
  //   hello  o
//  They are students.   aeiou

public class Test0610_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNextLine()){
            String str1=sc.nextLine();
            String str2=sc.nextLine();
            StringBuilder result=new StringBuilder("");
            for(int i=0;i<str1.length();i++){
                int count=0; //标记位，用于计数
                for (int j=0;j<str2.length();j++){
                    //判断第一个字符串中的字符是否存在于第二字符串
                    if(str1.charAt(i)!=str2.charAt(j)){
                        count++; //若不存在就++
                        if(count==str2.length()){  //判断count的值是否等于第二个字符串的长度，若等于说明可以添加到结果字符串中
                            result.append(str1.charAt(i));
                        }
                    }
                }
            }
            System.out.println(result);
        }
    }
}
