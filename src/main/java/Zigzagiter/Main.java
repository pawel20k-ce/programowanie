package Zigzagiter;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(new Integer[]{5, 2, 1, 3, 4, 5, 2, 0});
        makeZIGZAG(lst);
       // Iterator<Integer> iter = lst.iterator();
     //   Integer x;
     //   while (iter.hasNext()) {
//
      //      x = iter.next();
       //  //   if (x > 4) {

       //         iter.remove();
          //  }
    //    }
        System.out.println(lst);

    }

    public static void makeZIGZAG(List<Integer> lst) {

        if (lst.size() <= 2) {
            return;

        }
        ListIterator<Integer> itFirst = lst.listIterator();
        ListIterator<Integer> itSecond = lst.listIterator();
        itSecond.next();

        Integer x, y, order = itSecond.next() - itFirst.next();
        if (order == 0) {
            order = 1;
        }
        while (itSecond.hasNext()) {
            x = itSecond.next();
            y = itFirst.next();
            if ((x - y) * order > 0) {
                itSecond.set(y);
                itFirst.set(x);
            }
            order = -order;

        }
    }
}
