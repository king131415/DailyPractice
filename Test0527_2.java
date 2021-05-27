package Test0527;

import java.util.Scanner;

public class Test0527_2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()){
            String s=scanner.next();
            String t=scanner.next();
            int count=0;
            while(s.contains(t)){
                s=s.replaceFirst(t,"");
                count++;
            }
            System.out.println(count);
        }
    }
}
