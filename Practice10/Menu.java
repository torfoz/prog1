import java.util.List;

public class Menu {
  private String name;
  private List<Dish> dishes;

  public Menu(String name, List<Dish> dishes, Type type) {
    this.name = name;
    this.dishes = dishes;
  }

  public void addDish(Dish dish) {
    dishes.add(dish);
  }

  public String getName() {
    return name;
  }

  public List<Dish> getDish() {
    return dishes;
  }
}
