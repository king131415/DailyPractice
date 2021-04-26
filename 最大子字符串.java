package javaSePrictice;
public class 最大子字符串 {
    public static void main(String[] args) {
//        给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。如果不存在最后一个单词，
//        请返回 0
        String s="hello world";
        int length=macth(s);
        System.out.println(length);
    }
    public static int macth(String s) {
//        String [] arr=s.trim().split(" ");
//        return arr[arr.length-1].length();
          String str=s;
          int count=0;
          int size=str.trim().length();
          for(int i=size-1;i>=0;i--){
              if(str.trim().charAt(i)==' '){
                 break;
              }
              count++;
          }
          return count;
    }
}
