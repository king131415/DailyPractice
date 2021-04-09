package BookSystem.operation;

import BookSystem.BookList;

import java.util.Scanner;

public class BorrowOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        // 实现借书操作
        System.out.println("借阅书籍");
        System.out.println("请输入你要借阅书籍的名称：");
        Scanner scanner =new Scanner(System.in);
        String name=scanner.nextLine();
        for(int i=0;i<bookList.getSize();i++){
            if(bookList.getBook(i).getName().equals(name)){
                if(bookList.getBook(i).isBorrowed()){
                    System.out.println("此书已借出去！");
                }else {
                    bookList.getBook(i).setBorrowed(true);
                    System.out.println("借书成功！");
                    return;
                }
            }
        }
         System.out.println("图书馆没有["+name+"]这本书！");
    }
}