package q1;

import java.util.Date;
import java.util.Calendar;

public class StudentDemo
{
    public static void main(String[] args)
    {
        Student student1 = new Student("Andrei Orlov", "Hello world!", 8012, Branch.OTHER, new Date(2003 - 1900, Calendar.JULY, 15));

        System.out.println(student1);
    }
}
