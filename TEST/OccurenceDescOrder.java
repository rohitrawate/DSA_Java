import java.security.Key;
import java.util.*;;

public class OccurenceDescOrder {

    public static void  printChar(String str)
    {
        String[] arr =  str.split(" ");
        System.out.println(Arrays.toString(arr));

        HashMap<String, Integer> hm = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            System.out.println(hm.getOrDefault(arr[i] , 0 ));
            hm.put(arr[i],hm.getOrDefault(arr[i] , 0 ) + 1);
        }

        Map< Integer, String> tm = new TreeMap<>();

        hm.forEach((key, value) -> tm.put(value, key));
        tm.forEach((key,value) -> {
            for (Map.Entry m: hm.entrySet())
            {
                if( key!= 1 && m.getValue()==key )
                  System.out.println(   m.getKey() ); /// m.getValue() +" "+
            }
        });

    }

    public static void main(String[] args) {
        printChar("hey you you what what are are are doing");

    }
}

