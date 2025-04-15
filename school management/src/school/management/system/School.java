package school.management.system;

import java.util.List;

public class School {

    private List<Teacher> teachers;
    private List<Student> students;
    private static  int totalMoneyearned ;
    private static int totalMoneyspent;

    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers=teachers;
        this.students=students;
        totalMoneyearned=0;
        totalMoneyspent=0;
    }

    //getting the values of the parameters and ssetting them.

    public List<Teacher> getTeachers() {
        return teachers;
    }
    //addding a new teacher in school.
    public void addTeachers(Teacher teacher) {
        teachers.add(teacher) ;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudents(Student student) {
        students.add(student);
    }

    public int getTotalMoneyearned() {
        return totalMoneyearned;
    }

    public static void upadateTotalMoneyearned(int Moneyearned) {
        totalMoneyearned += Moneyearned;
    }

    public int getTotalMoneyspent() {
        return totalMoneyspent;
    }

    public static void updateTotalMoneyspent(int Moneyspent) {
        totalMoneyearned -= Moneyspent;
    }
}
