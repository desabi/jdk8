package generators.store;

import java.util.List;

public class StoreGeneratorMain {

  public static void main(String[] args) {
    List<Store> stores = StoreGenerator.generateStores(5);
    // challenges to solve on stores list
    // https://chat.deepseek.com/a/chat/s/5b454822-c37b-434d-a49f-11a85884c986
    stores.forEach(System.out::println);
  }

}
