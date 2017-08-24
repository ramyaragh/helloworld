package simplepackage;

public class Hello {

    public static String concatenate(String one, String two){
        return one + two;
    }

    public static int add(int one, int two){
        return one + two;
    }

    public static int subtract(int one, int two){
        return one - two;
    }

    public static void main(String ... args){
        System.out.println(concatenate("hello ", "world"));

    }
}
