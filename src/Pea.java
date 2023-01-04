public class Pea implements Food {
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

    @Override
    public void eat() {
        if(isGood()){
            System.out.println("Yum!");
        } else {
            System.out.println("Yuck!");
        }
    }
}
