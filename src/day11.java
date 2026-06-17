
import java.util.HashSet;
import java.util.Set;
 public class day11 {
    public static void main(String[]args){
        Set<String> set=new HashSet<>();
        set.add("pras");
        set.add("ash");
        set.add("yal");
        set.add("yal");
        set.add("goz");
        System.out.println("Set:");
        for(String s:set){
            System.out.println(s);
        }
    }
}
