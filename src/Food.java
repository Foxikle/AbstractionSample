public abstract class Food {
    public abstract FoodType getFoodType();
    public abstract boolean isGood();
    public abstract String getName();
    public void eat(){
        if(isGood()){
            System.out.println("Yum!");
        } else {
            System.out.println("Yuck!");
        }
    }
}
