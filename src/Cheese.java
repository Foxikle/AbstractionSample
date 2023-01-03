public class Cheese extends Food {

    @Override
    public FoodType getFoodType() {
        return FoodType.DAIRY;
    }

    @Override
    public boolean isGood() {
        return true;
    }

    @Override
    public String getName() {
        return "Cheese";
    }
}
