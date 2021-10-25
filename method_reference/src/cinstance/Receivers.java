package cinstance;

public class Receivers {
    public static void main(String[] args) {
        // receivers
        // Hello is the receiver of the length method
        int lengthA = "Hello".length();

        String name = "DESABI";
        // name is the receiver of the length method
        int lengthB = name.length();

        // new String("Tiger") is the receiver of the length method
        int lengthC = new String("Tiger").length();
    }
}
