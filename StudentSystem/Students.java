package StudentSystem;

public class Students implements {
    private student[] students=new student[100];
    private int size=0;

    public Students() {
        students[0]=new student(01,"邱琦","男",18,98);
        students[1]=new student(02,"郝帅","男",20,100);
        students[2]=new student(03,"蒙恬","男",23,101);
        size=3;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public student getstudent(int index){
        return students[index];
    }
    public  void setStudents(int index,student student1){
        students[index]=student1;
    }
    
}
