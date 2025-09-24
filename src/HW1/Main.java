package HW1;

public class Main {

    private static void PrintStudentInfo(Student std){
        System.out.println("\nChecking Upon Student " + std.getName() + " Information:");
        System.out.println("ID is: " + std.getStudentId());
        System.out.println("Name is: " + std.getName());
        System.out.println("Grade is: " + std.getGrade());
        System.out.println("Passed? Status: " + std.isPassing() + "\n");
    }

    public static void main(String[] args) {
        Student std1 = new Student();
        Student std2 = new Student(22222, "Tyler", 45);

        std1.setStudentId(11111);
        std1.setName("Mark");
        std1.setGrade(77.5);

        PrintStudentInfo(std1);
        System.out.println("***********************************************************");
        PrintStudentInfo(std2);
    }
}