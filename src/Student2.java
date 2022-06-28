import com.company.Student;

import java.util.Scanner;

public class Student2 {
    String name;
    public Student2(String s){
        name = s;
    }
    public Student2(){
        name="unknown";
    }
    public void printname(){
        System.out.println("enter the name");

    }
}
class StudentMain{
    public static void main(String[] args) {
        Student2 s=new Student2();
//        Scanner scan=new Scanner(System.in);
//        String name=scan.nextLine();

        Student2 a=new Student2();
        System.out.println(s.name);
        System.out.println(a.name);
    }
}
