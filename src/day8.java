/*public  class day8{
    interface Employee{
        String Name();
        String id();
        String salary();
    }
    static class BankEmployee implements Employee {
        @Override
        public String Name() {
            return "xyz";
        }
        @Override
        public String id() {
            return "101";
        }
        @Override
        public String salary() {
            return "50000";
        }
        public String solveprogram() {
            System.out.println("solution");
            return "solution";
        }
    }
    static class CheckingEmployee implements Employee {
        @Override
        public String Name() {
            return "ABC";
        }
        @Override
        public String id() {
            return "102";
        }
        @Override
        public String salary() {
            return "5000";
        }
        public String work() {
            System.out.println("process");
            return "process";
        }
    }
    public static void main(String[] args) {
        BankEmployee bank = new BankEmployee();
        System.out.println("Name : " + bank.Name());
        System.out.println("ID : " + bank.id());
        System.out.println("Salary : " + bank.salary());
        bank.solveprogram();
        System.out.println();
        CheckingEmployee checking = new CheckingEmployee();
        System.out.println("Name : " + checking.Name());
        System.out.println("ID : " + checking.id());
        System.out.println("Salary : " + checking.salary());
        checking.work();
    }
}*/


/*public class day8 {
record Courserecord(int course,int dept){
}
static void main(){
            Courserecord course=new Courserecord(123,234);
    System.out.println(course.course());
    System.out.println(course.dept());
}
}*/

public class day8 {
    enum LANGUAGE {
        EN("English"),
        GR("German"),
        JP("Japansese"),
        TA("Tamil");
        String value;

        LANGUAGE(String value) {
            this.value = value;
        }
    }

    static void main() {
        System.out.println(LANGUAGE.EN.value);
        System.out.println(LANGUAGE.GR.value);
        System.out.println(LANGUAGE.JP.value);
        System.out.println(LANGUAGE.TA.value);


    }
}
