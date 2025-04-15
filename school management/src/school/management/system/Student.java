package school.management.system;

public class Student{
    private int id;
    private String name;
    private int grade ;
    private int feepaid ;
    private int feetotal;

    /**
     * to create a new student by initializing the student values
     * fee paid initialy is 0.
     * fee for the student is increased by 3000 every year.
     * @param id id for thw student its must be unique.
     * @param name name of the student.
     * @param grade grade of the student.
     */
    public Student(int id , String name, int grade){
        this.feepaid=0;
        this.feetotal=5000;
        this.id =id;
        this.name=name;
        this.grade=grade;
    }
    //not going to change the student name ,id.
    //to update the grade of the student
    public void setgrade(int grade){
        this.grade =grade;
    }

    //school is recieve the amoubnt.
    public void payfee(int fees)
    {
        feepaid+=fees;
        School.upadateTotalMoneyearned(feepaid);
    }
    public int getid(){
        return id;
    }
    public String getname(){
        return name;
    }
    public int getGrade(){
        return grade;
    }
    public int getfeepaid() {
        return feepaid;
    }
    public int getfeetotal(){
        return feetotal;
    }

    @Override
    public String toString() {
        return "student name "+name +" fee paid "+ feepaid;
    }
}
