public class Dish {
  private String name;
  private String recipe;
  private Type type;
  private int price;

  public Dish(String name, String description, Type type, int price) {
    this.name = name;
    this.recipe = description;
    this.type = type;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public String getRecipe() {
    return recipe;
  }

  public Type getType() {
    return type;
  }

  public int getPrice() {
    return price;
  }

  public String toString() {
    return "Type: " + type + "\nNavn: " + name + "\nOppskrift: " + recipe + "\nPrice: " + price;
  }

}
