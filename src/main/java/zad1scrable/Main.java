package zad1scrable;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<Character,Integer> lettervalues = new HashMap<Character,Integer>();

        String a = "AEIOULNRST";

        for (int i=0; i<a.length();i++)
            lettervalues.put(a.charAt(i),1);

        String b = "DG";

        for (int i=0; i<b.length();i++)
            lettervalues.put(b.charAt(i),2);

        String c = "BCMP";

        for (int i=0; i<c.length();i++)
            lettervalues.put(c.charAt(i),3);


        String d = "FHVWY";

        for (int i=0; i<d.length();i++)
            lettervalues.put(d.charAt(i),4);


        String e = "K";

        for (int i=0; i<e.length();i++)
            lettervalues.put(e.charAt(i),5);


        String f = "JX";

        for (int i=0; i<f.length();i++)
            lettervalues.put(f.charAt(i),8);

        System.out.println(lettervalues);

    }


}
