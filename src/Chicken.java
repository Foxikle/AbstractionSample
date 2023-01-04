public class Chicken implements Food {
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

    @Override
    public void eat() {
        if(isGood()){
            System.out.println("Yum!");
        } else {
            System.out.println("Yuck!");
        }
    }
}
