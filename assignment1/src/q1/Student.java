package q1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

enum Branch
{
    COMPUTER_SCIENCE, SOFTWARE_ENGINEERING, OTHER
}

public class Student
{
    private String name;
    private String introduction;
    private int studentId; // only last 4 digits
    private Branch branch;
    private Date dob;

    public Student()
    {
    }

    public Student(String name, String introduction, int studentId, Branch branch, Date dob)
    {
        this.name = name;
        this.introduction = introduction;
        this.studentId = studentId;
        this.branch = branch;
        this.dob = dob;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getIntroduction()
    {
        return introduction;
    }

    public void setIntroduction(String introduction)
    {
        this.introduction = introduction;
    }

    public int getStudentId()
    {
        return studentId;
    }

    public void setStudentId(int studentId)
    {
        this.studentId = studentId;
    }

    public Branch getBranch()
    {
        return branch;
    }

    public void setBranch(Branch branch)
    {
        this.branch = branch;
    }

    public Date getDob()
    {
        return dob;
    }

    public void setDob(Date dob)
    {
        this.dob = dob;
    }

    @Override
    public String toString()
    {
        return "Student [name=" + name + ", introduction=" + introduction + ", studentId=" + studentId + ", branch="
                + branch + ", dob=" + dob + "]";
    }

}
