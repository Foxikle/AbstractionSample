public class Chicken extends Food{
    @Override
    public FoodType getFoodType() {
        return FoodType.PROTEIN;
    }

    @Override
    public boolean isGood() {
        return true;
    }

    @Override
    public String getName() {
        return "Chicken";
    }
}
