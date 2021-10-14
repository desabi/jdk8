package aclassimpl;

public class Main {
    public static void main(String[] args) {
        // functional interface with class implementation
        StringProcessorImpl impl = new StringProcessorImpl();

        System.out.println(impl.process("abi"));
    }
}
