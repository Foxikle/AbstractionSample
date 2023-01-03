public class Main {
    public static void main(String[] args) {
        Food[] foods = {new Rice(), new Pea(), new Papaya(), new Cheese(), new Chicken()};
        for (Food food : foods) {
            System.out.println(food.getName() + " is good -> " + food.isGood());
            System.out.println(food.getName() + " is a -> " + food.getFoodType());
            food.eat();
            System.out.println("");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        Recliner recliner = new Recliner();
        System.out.println("Recliner costs " + recliner.cost() + "$");
        System.out.println("Recliner is comfortable -> " + recliner.isComfortable());
    }
}