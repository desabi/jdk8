package replace;

import java.util.Map;
import java.util.TreeMap;
import java.util.function.BiFunction;

public class ReplaceMap {
    public static void main(String[] args) {
        Map<String, String> map = new TreeMap<>();
        map.put("Smith", "Robert");
        map.put("Jones", "Alex");

        BiFunction<String, String, String> biFunction = (lastName, name) -> "Mr. " + name;

        map.replaceAll(biFunction);
        map.forEach((lastName, name)-> System.out.println(name + " " +lastName));
    }
}
