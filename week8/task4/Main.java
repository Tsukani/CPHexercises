public class Main {
    //4.b
    static void printStrings(String[] array) {
        for (String str:array) {
            System.out.println(str);
        }
    }

    //4.c
    static int intSum(int[] array) {
        int sum = 0;
        for (int i:array) {
            sum+=i;
        }
        return sum;
    }

    //4.d
    static int intAverage(int[] array) {
        int sum = 0;
        for (int i:array) {
            sum+=i;
        }
        return sum/array.length;
    }

    public static void main(String[] args) {
        //4.a
        int[] intarr = {1,2,3};
        String[] strarr = {"hello", "world", "!"};
        boolean[] boolarr = {false, true, false};
        
        printStrings(strarr);
        System.out.println(intSum(intarr));
        System.out.println(intAverage(intarr));
    }
}