package javaDailyProctice;



import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * java中的IO流
 */
public class Test0413 {
    @Test
    public  void TestA() throws IOException {
         File file=new File("D:\\aa.txt");
         boolean a=file.createNewFile();
         System.out.println(a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        //6
        //1 2 3 2 2 1    6  5  4  7  8  9
        int count=1;
        int flag=0;
        for(int i=0;i<arr.length-1;i++) {
            if (arr[i] < arr[i + 1]) {
                 if(flag==0){
                     flag=1;
                 }
                 if(flag==-1){
                     flag=0;
                     count++;
                 }
            } else if (arr[i] > arr[i+1]) {
                if(flag==0){
                    flag=-1;
                }
                if(flag==1){
                    flag=0;
                    count++;
                }
            }
        }
        sc.close();
        System.out.println(count);
}

//I like beijing.
     public  static void myTest(){

         Scanner in = new Scanner(System.in);
         while (in.hasNext()) {
             String str = in.nextLine();
             String[] strs = str.split(" ");
             reverse(strs);
             for(int i = 0; i < strs.length; i++) {
                 System.out.print(strs[i]);
                 if(i != strs.length - 1) {
                     System.out.print(" ");
                 }
             }
         }
     }
    private static void reverse(String[] strs) {
        int i = 0;
        int j = strs.length - 1;
        while(i < j) {
            String temp = strs[i];
            strs[i] = strs[j];
            strs[j] = temp;
            i++;
            j--;
        }
     }

}
