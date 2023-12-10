import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

import javax.print.DocFlavor.READER;

public class TwoMonstersSplit {
    public static void main(String[] args)  throws IOException {
        
        BufferedReader bfr = new BufferedReader( new InputStreamReader(System.in) );
        System.out.println("Enter String with Monsters : @ and $");
        // String input = bfr.readLine();s

        String raw_in = new String("RRRWWWYYY@eRR$ere$fef@dw");
        // System.out.println( input );
        System.out.println( raw_in );

        // MinimumSplit( inpsut );
        int Result = MinimumSplit( raw_in );
        System.out.println("Result : "+ Result );
    }

    public static int MinimumSplit( String str ){

        System.out.println( "Input String : "+ str);
        
        String splitted_str[] = str.split("[@ , $ ]");
        System.out.println( "Splitted String : "+ Arrays.toString(splitted_str) );

        int length = splitted_str.length;
        ArrayList<Integer> list = new ArrayList<>(); 

        TreeSet<Integer> TSet = new TreeSet<>();
        // TreeSet<Integer>   Tset = new TreeSet<>();
        System.out.println( "Tset Size() : "+ TSet.size() );
        for (String subStr : splitted_str) {
            list.add( subStr.length() );
            TSet.add(subStr.length() );

        }
        System.out.println("char Split Array L : "+ list.size() + " \nTset Len : "+ TSet.size() );
        System.out.println( list.toString()  + " \n" + TSet.toString());
        return TSet.first();
    }
    
}
