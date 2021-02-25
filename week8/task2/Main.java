class Main{
    public static boolean happy = true;
  
    public static void main(String [] args) {
        if (iAmHappy()){
            System.out.println("I clap my hands");
        } else {
            System.out.println("I don't clap my hands"); 
        }
        
        System.out.println(multiply(5, 10)); 
        
        System.out.println(uppercase("hello world")); 

        System.out.println(startsWithUpperCase("Hello world")); 
    }
    public static boolean iAmHappy() {
        //2.a
        return happy;
    }

    public static int multiply(int a, int b) {
        //2.b
        return a+b;
    }

    public static String uppercase(String string) {
        //2.c
        return string.toUpperCase();
    }

    public static boolean startsWithUpperCase(String string) {
        //2.d
        return Character.isUpperCase(string.charAt(0));
    }
}