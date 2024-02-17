package q2;

import java.util.Map;
import java.util.Collections;

enum STUDENT_YEAR
{
    FRESHMAN, SOPHOMORE, JUNIOR, SENIOR;
}

public class Student
{
    private int SID;
    private STUDENT_YEAR year;
    private String name;
    private Map<String, Integer> coursesTaken;
    double GPA;

    public Student(){}

    public Student(String name, int studentID, STUDENT_YEAR year, Map<String, Integer> coursesTaken)
    {
        this.name = name;
        this.SID = studentID;
        this.year = year;
        this.GPA = GPA;
        this.coursesTaken = coursesTaken;
    }

    public String getName()
    {
        return name;
    }
    public void setname(String name)
    {
        this.name = name;
    }
    public int getID()
    {
        return SID;
    }
    public void setID(int SID)
    {
        this.SID = SID;
    }
    public STUDENT_YEAR getYear()
    {
        return year;
    }
    public void setYear(STUDENT_YEAR year)
    {
        this.year = year;
    }
    public Map<String, Integer> getAllCourses()
    {
        return coursesTaken;
    }
    public void addCourse(String courseName, int grade)
    {
        coursesTaken.put(courseName, grade);
    }
    public void importCourses(Map<String, Integer> courseMap)
    {
        this.coursesTaken = courseMap;
    }
    public double calculateGPA()
    {
        int total = 0;
        for(Map.Entry<String, Integer> entry : coursesTaken.entrySet())
        {
            total += entry.getValue();
        }
        GPA = total/coursesTaken.size();
        return GPA;
    }
    public void printInfo()
    {
        System.out.println("Student [name=" + name + ", student ID=" + SID + ", year=" + year + ", GPA=" + calculateGPA() + "]\nCourses Taken:");
        int i = 1;
        for(Map.Entry<String, Integer> entry : coursesTaken.entrySet())
        {
            System.out.print(entry.getKey());
            if(i < coursesTaken.size())
            {
                System.out.print(", ");
                i++;
            }
            else
            {
                System.out.println();
            }
        }
    }
}
