package abasic;

//Function: converting an object of type T to one of type R (apply)
@FunctionalInterface
public interface MyFunction {
    int apply(String textParameter);
}
