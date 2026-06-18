

/*import java.util.Set;
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
}*/
import java.util.HashMap;
public class day11 {
    public static void main(String[]args) {
        java.util.Map<String,Integer> mark=new HashMap<>();
        mark.put("ram",89);
        mark.put("john",78);
        mark.put("aravindh",67);
        mark.put("ramesh",90);
        System.out.println(mark.get("percent"));
        mark.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        });
    }
}



