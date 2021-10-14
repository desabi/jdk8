package adefault;

public class Main {
    public static void main(String[] args) {
        MyInterfaceImpl impl = new MyInterfaceImpl();
        impl.myAbstractMethod();
        impl.myDefaultMethod();
    }
}
