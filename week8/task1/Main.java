public class Main {
    //1.a
    public static void main(String[] args) {
        printbr();
        printString("1.c");
        printNameAge("Christian", 19);
    }

    //1.b
    static void printbr() {
        System.out.println("");
    }

    //1.c
    static void printString(String string) {
        System.out.println(string);
    }

    //1.d
    static void printNameAge(String name, int age) {
        System.out.println(String.format("My name is %s, I am %d years old", name, age));
    }
}
