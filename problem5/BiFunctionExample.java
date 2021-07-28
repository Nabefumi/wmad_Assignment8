package ca.ciccc.wmad202.assignment8.problem5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.BiFunction;

public class BiFunctionExample {

    public static void test(){
        //TODO Auto-generated method stub
        BiFunction<ArrayList<Integer>, ArrayList<Integer>, ArrayList<Integer>> bi = (list1, list2) -> {

            ArrayList<Integer> list3 = new ArrayList<>();

                for (Integer i : list1) {
                    list3.add(i);

                }
                for (Integer i : list2) {
                    list3.add(i);
                }
                return list3;
            };

            ArrayList<Integer> l1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
            ArrayList<Integer> l2 = new ArrayList<>(Arrays.asList(7, 8, 9, 10, 11, 12));

            System.out.println(bi.apply(l1, l2).size());
            System.out.println(bi.apply(l1, l2));
    }
}
