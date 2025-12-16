import java.util.List;

public class Dish {
    private int id;
    private String name;
    private DishTypeEnum dishType;
    private List<Ingredient> ingredients;

    public Double getDishPrice() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
