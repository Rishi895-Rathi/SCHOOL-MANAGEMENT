package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher lizzy=new Teacher(1,"Lzzy",500);
        Teacher Sailesh =new Teacher(2,"Sailesh",700);
        Teacher Himanshu = new Teacher(0,"Himanshu",900);

        List<Teacher> teacherList=new ArrayList<>();
         teacherList.add(lizzy);
         teacherList.add(Sailesh);
         teacherList.add(Himanshu);

        Student Rishi=new Student(1,"Rishi",12);
        Student Vasu=new Student(2,"Vasu",11);

        List<Student>studentlist=new ArrayList<>();
        studentlist.add(Rishi);
        studentlist.add(Vasu);


        School bfs =new School(teacherList,studentlist);
        System.out.println("bfs has earned "+bfs.getTotalMoneyearned());
        Rishi.payfee(1100);
        Vasu.payfee(1000);
        System.out.println("bfs has earned "+bfs.getTotalMoneyearned());

        System.out.println("------making school pay salary-----------");
        lizzy.salarypaid(lizzy.getSalary());
        System.out.println("bfs has spent for salary to "+lizzy.getname()+" and has "+bfs.getTotalMoneyearned());

        System.out.println(Rishi);


    }
}
