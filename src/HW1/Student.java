package HW1;

public class Student {
    int studentId;
    String name;
    double grade;

    public Student(){}

    public Student(int studentId, String name, double grade) {
        this.studentId = studentId;
        this.name = name;
        this.grade = grade;
    }

    public void setStudentId(int id){
        this.studentId = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setGrade(double grade){
        if(grade < 0 || grade > 100){
            return;
        }
        this.grade = grade;
    }

    public int getStudentId() {return studentId;}
    public String getName() {return name;}
    public double getGrade() {return grade;}

    public boolean isPassing(){
        return grade >= 60;
    }
}