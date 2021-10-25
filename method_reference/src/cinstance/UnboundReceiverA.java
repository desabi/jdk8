package cinstance;

import java.util.function.Function;

public class UnboundReceiverA {
    public static void main(String[] args) {

        Person personArg = new Person("abi", 34, 1.62);

        // Functions: converting an object of type T to one of type R (method apply)
        // receiver: you can provide it implicitly when the method is invoked
        // ClassName::instanceMethod
        Function<Person, String> functionA = (Person personParam) -> personParam.getName();
        // Function<Person, String> functionX = personParam -> personParam.getName(); funciona
        Function<Person, String> functionB = Person::getName;

        // El método getName() no recibe ningún parámetro y retorna un String
            //No recibe parámetros ya que se especifica/provee de manera implícita con Person::getName
        // El método apply (de Function<Person, String>) Recibe un parametro de tipo Person y devuelve un String
        // Los dos métodos coinciden en la cantidad de parámetros y el tipo de retorno
        System.out.println(functionA.apply(personArg));
        System.out.println(functionB.apply(personArg));
    }
}

