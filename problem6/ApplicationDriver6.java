package ca.ciccc.wmad202.assignment8.problem6;

import ca.ciccc.wmad202.assignment8.problem6.GenericExample.BiFunction;

import java.util.ArrayList;
import java.util.Arrays;

public class ApplicationDriver6 {

    public static void test() {

        ArrayList<Integer> l1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6));
        ArrayList<Integer> l2 = new ArrayList<Integer>(Arrays.asList(7, 8, 9, 10, 11, 12));

        BiFunction bi1 = (list1, list2) -> {

            ArrayList<Integer> list3 = new ArrayList<Integer>();
            for (Integer i : list1) {
                list3.add(i);
            }

            for (Integer i : list2) {
                list3.add(i);
            }

            return list3;

        };

        System.out.println(bi1.apply(l1, l2));

    };

}
