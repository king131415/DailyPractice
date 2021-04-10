package StudentSystem.Operations;

import StudentSystem.Students;

public class dispOperation implements Iopertion{
    //显示学生列表信息
    @Override
    public void work(Students students) {
        for(int i=0;i<students.getSize();i++){
            System.out.println(students.getstudent(i));
        }
    }
}
