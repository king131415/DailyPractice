package BookSystem.operation;

import BookSystem.BookList;

import java.util.Scanner;

public class DelOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        // 实现删除一本指定书籍的操作
        System.out.println("删除书籍");
        System.out.println("请输入你要删除书籍的名称：");
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();
        for(int i=0;i<bookList.getSize();i++){
            if(bookList.getBook(i).getName().equals(name)){
                bookList.setBook(i,bookList.getBook(bookList.getSize()-1));
                bookList.setSize(bookList.getSize()-1);
                System.out.println("删除成功！");
                return;
            }
        }
        System.out.println("你输入的["+name+"]在图书馆中没有!");
    }
}