package BookSystem.operation;

import BookSystem.BookList;

import java.util.Scanner;

public class FindOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        // 实现查找某个书籍的信息
        System.out.println("查找书籍");
        System.out.println("请输入你要查找的书籍名称：");
        Scanner  scanner=new Scanner(System.in);
        String name=scanner.nextLine();
        for(int i=0;i<bookList.getSize();i++){
            if(bookList.getBook(i).getName().contains(name)){
                System.out.println(bookList.getBook(i));
            }
        }
    }
}