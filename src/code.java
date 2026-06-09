
   void main() {
        int[] marks = {87, 23, 44, 89, 32};
        System.out.print("pass mark");
        for (int mark : marks) {
            if (mark > 40) {
                System.out.println(mark + "");
            }
        }
        System.out.print("fail mark");
        for (int mark : marks) {
            if (mark <40) {
                System.out.println(mark + "");

            }
        }
 }