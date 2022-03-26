package traversinobject;

import java.util.TreeMap;
import java.util.function.BiConsumer;

public class TraverseMap {
    public static void main(String[] args) {

        // forEachRemaining: Traversing Objects Using Iterators
        // foreach:  Traversing Iterable Objects

        TreeMap<String, Double> employeeSalaries = new TreeMap<>();
        employeeSalaries.put("Joe Smith", 100_000.0);
        employeeSalaries.put("Maggie Jones", 110_000.0);
        employeeSalaries.put("Larry Rodriguez", 105_000.0);

        BiConsumer<String, Double> biConsumer =
                (name, salary) -> System.out.println(name+" makes $"+salary+" anually");

        employeeSalaries.forEach(biConsumer);
        employeeSalaries.forEach((name, salary) -> System.out.println(name+" makes $"+salary+" anually"));
    }
}
