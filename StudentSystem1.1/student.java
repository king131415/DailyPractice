package StudentSystem;

public class student implements Comparable<student>{
    private int id;
    private String name;
    private String sex;
    private int age;
    private int score;

    public student(int id, String name, String sex, int age, int score) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(student o) {
        if(this.score<o.getScore()){
            return 1;
        }else if(this.score>o.getScore()){
            return -1;
        }else {
            return 0;
        }
    }
}
