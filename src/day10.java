/*import java.util.ArrayList;
public class day10 {
    static void main() {
        String[] Names = {"Ram", "ABC", "xyz"};
        ArrayList<String> studentList = new ArrayList();
        studentList.add("Ram");
       studentList.add("ABC");
        studentList.add("xyz");
        studentList.add("xyt");
        studentList.add("xye");
        for (String s : studentList) {
            System.out.println(s);
        }
        studentList.remove("ram");
        for(String s: studentList) {

   }
   }
   }*/
/*import java.util.LinkedList;
public class day10 {
    static void main() {
        LinkedList<String> queue = new LinkedList<String>() ;
        queue.add("abc");
        queue.add("cdf");
        queue.add("efg");
        queue.add("hij");
        queue.add("klm");
        while(!queue.isEmpty()){

                process(queue);
            }
        }
        static void process (LinkedList<String> queue) {
            String removed = queue.removeFirst();
            System.out.println("Removed:" + removed);

        }
    }*/
import java.util.LinkedList;
/*class Student{
    String name;
    int regno;
    int marks;
    Student(String name ,int regno,int marks){
        this.name=name;
        this.regno=regno;
        this.marks=marks;
    }
    @Override
    public String toString(){
        return "Name:"+name+
                ",regno:"+regno+
                ", Marks:"+marks;
    }
}
public class day10{
    static void main() {
        LinkedList<Student> students = new LinkedList<>();
        students.add(new Student("abc", 100, 80));
        students.add(new Student("dfg", 102, 90));
        students.add(new Student("ggj", 103, 87));
        students.add(new Student("fgh", 104, 78));
        students.add(new Student("yuj", 105, 90));
        System.out.println();
        for (Student s : students) {
            System.out.println(s);
        }
        students.removeFirst();
        System.out.println("\nAfter removing first student");
        for (Student s : students) {
            System.out.println(s);
        }
        String searchvalue = "Ravi";
        for (Student s : students) {
            if (s.name.equalsIgnoreCase(searchvalue)) {
                s.marks = 95;
                break;
            }
        }
        System.out.println("\nAfter updating Ravi's marks:");
        for (Student s : students) {
            System.out.println(s);
        }
    }*/
/*import java.util.LinkedList;

public class Day10Linked {

    static class Student {
        String name;
        int regNo;
        int marks;

        Student(String name, int regNo, int marks) {
            this.name = name;
            this.regNo = regNo;
            this.marks = marks;
        }
    }

    static void removeStudent(LinkedList<Student> students) {
        System.out.println("Removed : " + students.removeFirst().name);
    }

    static void updateStudent(LinkedList<Student> students) {
        for (Student s : students) {
            if (s.name.equals("Deepa")) {
                s.marks = 95; // Update marks from 85 to 95
            }
        }/*


    /*public static void main(String[] args) {

        LinkedList<Student> students = new LinkedList<>();

        // Add 5 Students
        students.add(new Student("Arun", 101, 80));
        students.add(new Student("Bala", 102, 75));
        students.add(new Student("Charan", 103, 90));
        students.add(new Student("Deepa", 104, 85));
        students.add(new Student("Esha", 105, 88));

        // Remove 1 Student
        removeStudent(students);
        updateStudent(students);
        System.out.println("\nStudent Details");
        for (Student s : students) {
            System.out.println(
                    s.name + " " +
                            s.regNo + " " +
                            s.marks
            );
        }
    }
} */




