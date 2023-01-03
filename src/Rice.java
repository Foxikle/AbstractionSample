public class Rice extends Food {
    @Override
    public FoodType getFoodType() {
        return FoodType.GRAIN;
    }

    @Override
    public boolean isGood() {
        return true;
    }

    @Override
    public String getName() {
        return "Rice";
    }
}
