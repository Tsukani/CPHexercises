package com.company;
import java.util.Scanner;

public class Main {

    //1
    static int min(int a, int b, int c) {
        int lowestAB = Math.min(a, b);
        return Math.min(lowestAB, c);
    }

    //2
    static void printEvenNumbers(int max) {
        if (max >= 2) {
           String str = "";
           for(int i = 1; i <= Math.floor(max/2); i++) {
               str += "{" + i*2 + "} ";
           }
           System.out.println(str);
        } else {
            System.out.printf("Value must be above or equal 2, got %d%n", max);
        }
    }

    //3
    static int smallestAbsVal (int a, int b, int c) {
        int lowestAB = Math.min(Math.abs(a), Math.abs(b));
        return Math.min(lowestAB, Math.abs(c));
    }

    //4
    static int sumDigits(int num) {
        int numAbs = Math.abs(num);
        String string = String.valueOf(numAbs);
        int result = 0;
        for (int i = 0; i < string.length(); i++) {
            result += Integer.parseInt(string.substring(i, i+1));
        }
        return result;
    }

    //5
    static void reverseVertical(String str) {
        for (int i = str.length(); i > 0; i--) {
            System.out.println(str.substring(i-1, i));
        }
    }

    //6
    static void processName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Skriv venligst dit fulde navn:");

        String name = scanner.nextLine();
        System.out.println("Navnet med store bogstaver:  " + name.toUpperCase());
    }

    //7
    static String repeat(String str) {
        String string = "";
        for (int i = 0; i < str.length(); i++) {
            string += str;
        }
        return string;
    }

    //8
    static void shortestName(int n) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        for (int i = 0; i < n; i++) {
            System.out.printf("Skriv et navn (%d/%d)%n", i+1, n);
            String newName = scanner.nextLine();
            if (newName.length() < name.length() || name == "") name = newName;
        }
        System.out.printf("%s er det korteste navn%n", name);
    }

    //9
    static void randomNumbers() {
        boolean active = true;
        while (active) {
            int num = (int)Math.floor(Math.random() * 1000);
            System.out.printf("Random number: %d%n", num);
            if (num>900) break;
        }
    }

    //10
    static void maxMin() {
        Integer highest = null;
        Integer lowest = null;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Skriv et tal (eller -1 for at afslutte):");
            int newInt = Integer.valueOf(scanner.nextLine());
            if (newInt == -1) break;
            if (highest == null || newInt > highest) highest = newInt;
            if (lowest == null || newInt < lowest) lowest = newInt;
        }
        System.out.printf("Maximum var %d%n", highest);
        System.out.printf("Minimum var %d%n", lowest);
    }

    //11
    static void printMultiple(int num) {
        String str = "";
        for (int i = 1; i <= 10; i++) {
            str += i*num;
            if (i != 10) str += " og ";
        }
        System.out.println(str);
    }

    //12
    static int max(int[] arr) {
       int maxValue = arr[0];
       for (int i = 1; i < arr.length; i++) {
           maxValue = (arr[i] > maxValue) ? arr[i] : maxValue;
       }
       return maxValue;
    }

    //13
    static boolean allLess(int[] arr1, int[] arr2) {
        boolean result = true;
        if (arr1.length != arr2.length) {
            System.out.println("Array size mismatch");
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] >= arr2[i]) result = false;
        }
        return result;
    }

    public static void main(String[] args) {
        //1
        System.out.println(min(3, -2, 7));
        System.out.println(min(19, 27, 6));

        //2
        printEvenNumbers(8);
        printEvenNumbers(12);

        //3
        System.out.println(smallestAbsVal(1, 9, -11));
        System.out.println(smallestAbsVal(-8, 2, 12));

        //4
        System.out.println(sumDigits(931));
        System.out.println(sumDigits(-99));

        //5
        reverseVertical("laptop");

        //6
        processName();

        //7
        System.out.println(repeat("Hej"));
        System.out.println(repeat(""));

        //8
        shortestName(4);

        //9
        randomNumbers();

        //10
        maxMin();

        //11
        printMultiple(5);

        //12
        int[] numbers = {5, 12, 81, -5, 23};
        System.out.println(max(numbers));

        //13
        int[] array1 = {1, 2, 3, 4, 5};
        int [] array2 = {6, 7, 8, 9, 10};
        System.out.println(allLess(array1, array2));
        System.out.println(allLess(array2, array1));
    }
}

