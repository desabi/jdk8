package generators.product;

import java.util.List;

public class ProductGeneratorMain {

  public static void main(String[] args) {
    List<Product> products = ProductGenerator.generateProducts();

    // challenges to solve on products list
    // https://claude.ai/chat/42892104-8558-424a-a57e-902f567c663a


    /*System.out.println("[");
    for (int i = 0; i < products.size(); i++) {
      System.out.println(products.get(i));
      if (i < products.size() - 1) System.out.println(",");
    }
    System.out.println("]");*/

  }

}
