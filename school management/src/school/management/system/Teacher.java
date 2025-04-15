package school.management.system;

/**
 * creating for teacher records -> name ,id salary.
 */
public class Teacher {

    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    public Teacher(int id,String name , int salary){

        this.id=id;
        this.name=name;
        this.salary=salary;
        this.salaryEarned=0;
    }
    public int getid(){
        return id;
    }
    public String getname(){
        return name;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }

    /**
     * adds to salaryEarned
     * removes from the total money earned by school
     * @param salary
     */
    public void salarypaid(int salary){
        salaryEarned+=salary;
        School.updateTotalMoneyspent(salary);
    }
}
