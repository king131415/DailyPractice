package BookSystem.operation;

import BookSystem.BookList;

public class ExitOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        // 退出程序
        System.out.println("退出程序");
        System.exit(0);//系统退出函数
    }
}