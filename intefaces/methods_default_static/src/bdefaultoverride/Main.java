package bdefaultoverride;

public class Main {
    public static void main(String[] args) {
        MyInterfaceImpl imp = new MyInterfaceImpl();
        imp.myAbstractMethod();
        imp.myDefaultMethod();
    }
}
