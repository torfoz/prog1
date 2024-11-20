import java.util.List;
import java.util.ArrayList;

public class MenuRegister {
  private List<Menu> menuRegister = new ArrayList<>();
  private List<Dish> dishRegister = new ArrayList<>();

  public void addMenu(String name, List<Dish> dishes, Type type) {
    menuRegister.add(new Menu(name, dishes, type));
  }

  public void addDish(String name, String recipe, Type type, int price) {
    dishRegister.add(new Dish(name, recipe, type, price));
  }

  public void addDishToMenu(String menuName, Dish dish) {
    for (Menu menu : menuRegister) {
      if (menu.getName().equals(menuName)) {
        menu.addDish(dish);
      }
    }
  }

  public void getDishByName(String name) {
    for (Dish dish : dishRegister) {
      if (dish.getName().equals(name)) {
        System.out.println(dish);
      }
    }
  }

  public void getDishByType(Type type) {
    for (Dish dish : dishRegister) {
      if (dish.getType().equals(type)) {
        System.out.println(dish);
      }
    }
  }

  public void getDishByPriceInterval(int minPrice, int maxPrice) {
    for (Dish dish : dishRegister) {
      if (dish.getPrice() >= minPrice && dish.getPrice() <= maxPrice) {
        System.out.println(dish);
      }
    }
  }

  public void printMenuRegister() {
    for (Menu menu : menuRegister) {
      System.out.println("\nMenynavn: " + menu.getName());
      for (Dish dish : menu.getDish()) {
        System.out.println("Type: " + dish.getType());
        System.out.println("Navn: " + dish.getName());
        System.out.println("Oppskrift: " + dish.getRecipe());
        System.out.println("Price: " + dish.getPrice());
      }
    }
  }

  public static void main(String[] args) {
    MenuRegister menuRegister = new MenuRegister();
    menuRegister.addDish("Pasta", "Pasta with tomato sauce", Type.HOVEDRETT, 100);
    menuRegister.addDish("Salad", "Salad with chicken", Type.FORRETT, 50);
    menuRegister.addDish("Ice cream", "Vanilla ice cream", Type.DESSERT, 30);
    menuRegister.addDish("Suppe", "Grønnsakssuppe", Type.FORRETT, 50);
    menuRegister.addMenu("Menu 1", new ArrayList<>(), Type.HOVEDRETT);
    menuRegister.addMenu("Menu 2", new ArrayList<>(), Type.FORRETT);
    menuRegister.addMenu("Menu 3", new ArrayList<>(), Type.DESSERT);

    Dish pasta = menuRegister.dishRegister.get(0);
    Dish salad = menuRegister.dishRegister.get(1);
    Dish iceCream = menuRegister.dishRegister.get(2);
    Dish soupe = menuRegister.dishRegister.get(3);

    menuRegister.addDishToMenu("Menu 1", pasta);
    menuRegister.addDishToMenu("Menu 1", salad);
    menuRegister.addDishToMenu("Menu 2", iceCream);
    menuRegister.addDishToMenu("Menu 3", soupe);
    menuRegister.printMenuRegister();
    System.out.println("\n");
    menuRegister.getDishByName("Pasta");
    System.out.println("\n");
    menuRegister.getDishByType(Type.FORRETT);
    System.out.println("\n");
    menuRegister.getDishByPriceInterval(40, 60);
  }

}
