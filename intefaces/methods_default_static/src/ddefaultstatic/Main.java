package ddefaultstatic;

public class Main {
    public static void main(String[] args) {
        Greet.printText();

        FirstImpl firstImpl = new FirstImpl();
        SecondImpl secondImpl = new SecondImpl();

        System.out.println(firstImpl.getMessage("Abi"));
        System.out.println(secondImpl.getMessage("Bianca"));
    }
}
