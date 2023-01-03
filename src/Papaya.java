public class Papaya extends Food{

    @Override
    public FoodType getFoodType() {
        return FoodType.FRUIT;
    }

    @Override
    public boolean isGood() {
        return false;
    }

    @Override
    public String getName() {
        return "Papaya";
    }
}
