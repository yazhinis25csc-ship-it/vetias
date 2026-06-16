import java.util.ArrayList;
public class day10 {
    static void main() {
        String[] Names = {"Ram", "ABC", "xyz"};
        ArrayList<String> studentList = new ArrayList();
        studentList.add("Ram");
       studentList.add("ABC");
        studentList.add("xyz");
        for (String s : studentList) {
            System.out.println(s);
        }
        studentList.remove("ram");
        for(String s: studentList) {

        }
    }
}
