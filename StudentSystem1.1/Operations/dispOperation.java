package StudentSystem.Operations;

import StudentSystem.Students;
import StudentSystem.student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class dispOperation implements Iopertion{
    //显示学生列表信息
    @Override
    public void work(Students students) {
        List<student> lists=new ArrayList<>();
        for(int i=0;i<students.getSize();i++){
//            System.out.println(students.getstudent(i));
            lists.add(students.getstudent(i));
        }
        Collections.sort(lists);
        for(student s:lists){
            System.out.println(s);
        }
    }
}
