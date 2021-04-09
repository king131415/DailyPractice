package BookSystem.operation;
import BookSystem.Book;
import BookSystem.BookList;
import java.util.Scanner;

// 往 BookList 中新增一本书
public class AddOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        // 里面实现具体的新增操作
        System.out.println("新增书籍");
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入你要添加的书籍名称：");
        String name=scanner.nextLine();
        System.out.println("请输入你要添加书籍的作者：");
        String name2=scanner.nextLine();
        System.out.println("请输入你要添加书籍的价格：");
        double price=scanner.nextDouble();
        System.out.println("请输入你要添加书籍的类型：");
        String type=scanner.next();
        Book newbook=new Book(name,name2,price,type);
        bookList.setBook(bookList.getSize(),newbook);
        bookList.setSize(bookList.getSize()+1);
        System.out.println("添加书籍成功！");
    }
}