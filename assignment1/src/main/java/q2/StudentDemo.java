package q2;

import java.util.Map;
import java.util.HashMap;

public class StudentDemo
{
    public static void main(String[] args)
    {
        Student student1 = new Student();
        student1.setname("Andrei");
        student1.setID(192375829);
        student1.setYear(STUDENT_YEAR.JUNIOR);

        Map<String, Integer> courses = new HashMap<String, Integer>();
        courses.put("Calculus I", 4);
        courses.put("Calculus II", 3);
        courses.put("Calculus III", 2);
        courses.put("English I", 3);
        courses.put("English II", 4);
        courses.put("Some class that I failed idk", 1);

        student1.importCourses(courses);

        Student student2 = new Student("Andrei", 192375829, STUDENT_YEAR.JUNIOR, courses);

        Student student3 = new Student();

        System.out.println("Data of student1:");
        student1.printInfo();
        System.out.println("\nData of student2:");
        student2.printInfo();
        System.out.println("\nData of student3:");
        student3.printInfo();

    }
}
