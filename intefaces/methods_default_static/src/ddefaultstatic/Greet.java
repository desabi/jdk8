package ddefaultstatic;

public interface Greet {
    String text = "Hello ";

    default String getMessage(String name){
        return text + name;
    }

    static void printText(){
        System.out.println(text);
    }
}
