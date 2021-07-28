package ca.ciccc.wmad202.assignment8.problem6;

import java.util.ArrayList;

public class GenericExample {
    interface BiFunction {
        public ArrayList<Integer> apply(ArrayList<Integer> list1, ArrayList<Integer> list2);
    }

    public ArrayList<Integer> test(ArrayList<Integer> list1, ArrayList<Integer> list2, BiFunction bi) {
        return bi.apply(list1, list2);
    }
}
