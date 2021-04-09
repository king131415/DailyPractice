package BookSystem.operation;
import BookSystem.Book;
import BookSystem.BookList;

import java.util.Scanner;

public class ReturnOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        // 实现还书
        System.out.println("归还书籍");
        System.out.println("请输入要归还的书籍名称：");
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();
        int pos=0;
        for(int i=0;i<bookList.getSize();i++){
            pos=i;
            Book book=bookList.getBook(i);
            if(book.getName().equals(name)){
                if(!book.isBorrowed()){
                    System.out.println("这本书没有借出，无法归还！");
                }else {
                    book.setBorrowed(false);
                    System.out.println("归还书籍成功！");
                    return;
                }
            }
        }
        if(pos>=bookList.getSize()) {
            System.out.println("没有此书籍，无法归还！");
            return;
        }
    }
}