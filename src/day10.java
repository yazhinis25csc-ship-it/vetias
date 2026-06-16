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
import java.util.LinkedList;
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
    }

