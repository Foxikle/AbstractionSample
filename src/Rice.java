public class Rice implements Food {
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

    @Override
    public void eat() {
        if(isGood()){
            System.out.println("Yum!");
        } else {
            System.out.println("Yuck!");
        }
    }
}
