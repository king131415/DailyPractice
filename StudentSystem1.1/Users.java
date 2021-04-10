package StudentSystem;

import StudentSystem.Operations.Iopertion;

public abstract class Users {
    protected String name;
    protected Iopertion[] iopertions;
    protected void doIoperation(Students students,int choice){
        iopertions[choice-1].work(students); //具体执行的方法

    }
    public abstract int menu();
}
