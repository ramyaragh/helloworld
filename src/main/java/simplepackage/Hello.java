package simplepackage;

public class Hello {

    public static String concatenate(String one, String two){
        return one + two;
    }

    public static void main(String ... args){
        System.out.println(concatenate("hello ", "world"));

    }
}
