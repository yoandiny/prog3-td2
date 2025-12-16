import java.util.List;

public class Dish {
    private int id;
    private String name;
    private DishTypeEnum dishType;
    private List<Ingredient> ingredients;



    public Dish(int id, String name, DishTypeEnum dishType, List<Ingredient> ingredients) {
        this.id = id;
        this.name = name;
        this.dishType = dishType;
        this.ingredients = ingredients;
    }

    public Double getDishPrice() {
        double price = 0.0;
        for (Ingredient ingredient : ingredients) {
            double ingedientPrice = ingredient.getPrice();
            price += ingedientPrice;
        }
        return price;
    }

    public String getName() {
        return name;
    }
}
