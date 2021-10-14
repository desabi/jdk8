package adefault;

public interface MyInterface {

    void myAbstractMethod();

    default void myDefaultMethod(){
        System.out.println("Inside default method");
    }
}
