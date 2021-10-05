package cstatic;

public interface TheInterface {

    void theAbstractMethod();

    static void theStaticMethod(){
        System.out.println("Inside the static method");
    }
}
