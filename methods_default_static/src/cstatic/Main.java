package cstatic;

public class Main {
    public static void main(String[] args) {
        TheInterfaceImpl imp = new TheInterfaceImpl();
        imp.theAbstractMethod();
        TheInterface.theStaticMethod();
    }
}
