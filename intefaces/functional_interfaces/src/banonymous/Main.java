package banonymous;

import aclassimpl.StringProcessor;

public class Main {
    public static void main(String[] args) {
        // functional interface with anonymous class
        StringProcessor impl = new StringProcessor() {
            @Override
            public String process(String text) {
                return text.toUpperCase();
            }
        };

        System.out.println(impl.process("abi"));
    }
}
