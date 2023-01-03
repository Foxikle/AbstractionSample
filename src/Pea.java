public class Pea extends Food{
    @Override
    public FoodType getFoodType() {
        return FoodType.VEGETABLE;
    }

    @Override
    public boolean isGood() {
        return true;
    }

    @Override
    public String getName() {
        return "Pea";
    }
}
