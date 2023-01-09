import entities.Product;
import java.util.Set;
import java.util.TreeSet;

public class App {

  public static void main(String[] args) throws Exception {
    // Esse Codigo e para intender que quando ussa um treeSet a class do comjunto ela tem que ser
    //uma implementeçao do comperablo para que seja posivel que o treeSete ordena meus objetos
    System.out.println("=======================================");

    Set<Product> set = new TreeSet<>();
    set.add(new Product("TV", 900.0));
    set.add(new Product("Notebook", 1200.0));
    set.add(new Product("Tablet", 400.0));

    for (Product p : set) {
      System.out.println(p);

      System.out.println("=======================================");
    }
  }
}
