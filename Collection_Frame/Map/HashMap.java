
// import java.util.HashMap;
import java.util.Map;

public class HashMap {
    public static void main(String[] args) {
        Map<Integer, String> hmap = new java.util.HashMap<>();

        System.out.println(hmap);
        hmap.put(007, "Rohit");
        System.out.println(hmap);
        System.out.println(hmap.get(7));

    }
}
