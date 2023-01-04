public class Cheese implements Food {

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

    @Override
    public void eat() {
        if(isGood()){
            System.out.println("Yum!");
        } else {
            System.out.println("Yuck!");
        }
    }
}
