import java.util.ArrayList;
import java.util.Scanner;

class Student {

    int id;
    String name;

    Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    void display(){
        System.out.println("ID: " + id + " Name: " + name);
    }
}

public class Main {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("How many students do you want to add?");
        int n = sc.nextInt();

        for(int i=0;i<n;i++){

            System.out.println("Enter student id:");
            int id = sc.nextInt();

            System.out.println("Enter student name:");
            String name = sc.next();

            Student s = new Student(id,name);
            students.add(s);
        }

        System.out.println("\nStudent List:");

        for(Student s: students){
            s.display();
        }

    }
}
