package zad2uunduplikt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer>lista = Arrays.asList(new Integer[]{1,2,3,1,5,6,1});


        System.out.println(del(lista));
    }

    private static List<Integer> del(List<Integer> L) {
        List<Integer> mylist = new ArrayList<>();
        for (Integer i : L) {
        if (!mylist.contains(i))
            mylist.add(i);

        }

return mylist;
    }
}
