package zad3merge;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8});
        List<Integer> lst2 = Arrays.asList(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8});
        System.out.println(merge(lst, lst2));
    }

    public static List<Integer> merge(List<Integer> first, List<Integer> second) {

        List<Integer> result = new ArrayList<>(first.size() + second.size());
        int i = 0, j = 0;
        Integer x, y;

        while (i < first.size() & j < second.size()) {
            x = first.get(i);
            y = second.get(j);
            if (x < y) {
                result.add(x);
                i += 1;

            } else {
                result.add(y);
                j += 1;
            }
        }

        while (i < first.size()) {
            result.add(first.get(i));
            i++;

        }
        while (j < second.size()) {
            result.add(second.get(j));
            j++;
        }
        return result;
    }

    public static List<Integer> merge2(List<Integer> first, List<Integer> second) {
        Iterator<Integer> itFirst = first.listIterator();
        Iterator<Integer> itsecond = second.listIterator();
        List<Integer> result = new ArrayList<>(first.size() + second.size());
        Integer x,y;

        x = itFirst.next();
        y = itsecond.next();

        while (x!=null & y != null){
            if (x<y){
              result.add(x);
              x=itFirst.hasNext() ? itFirst.next() :null;

            }else {
                result.add(y);
                y=itFirst.hasNext() ? itFirst.next() :null;
            }
        }
        if (x !=null) {
            result.add(x);
        }else{
            result.add(y);
        }
        itFirst.forEachRemaining(result::add);
        itsecond.forEachRemaining(result::add);

        return result;
    }
}
