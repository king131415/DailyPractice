package StudentSystem.Operations;

import StudentSystem.Students;

public class ExistOperation implements Iopertion{
    //退出系统
    @Override
    public void work(Students students) {
        System.out.println("安全退出系统！");
        System.exit(0);
    }
}
