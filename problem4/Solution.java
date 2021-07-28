package ca.ciccc.wmad202.assignment8.problem4;

public class Solution {

    public int[] solution(int[] array, int K) {
        //body of the method
        int[] newArray = new int[array.length];

        for(int i = 0; i < array.length;i++){
            if(i + K >= array.length){
                newArray[i + K - array.length] = array[i];
            } else {
                newArray[i + K] = array[i];
            }
        }
        return newArray;
    }

    public static class TestQuestion4 {

        public static void test() {
            Solution s = new Solution();
            int[] array = {3, 8, 9, 7, 6};
            System.out.print("Previous array is : ");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + ",");
            }
            System.out.println();
            int[] newArray = s.solution(array, 1);
            System.out.print("New array is : ");
            for (int i = 0; i < array.length; i++) {
                System.out.print(newArray[i] + ",");
            }
        }
    }
}
