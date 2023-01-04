public class Papaya implements Food {

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

    @Override
    public void eat() {
        if(isGood()){
            System.out.println("Yum!");
        } else {
            System.out.println("Yuck!");
        }
    }
}
