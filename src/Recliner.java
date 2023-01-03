public class Recliner implements Furniture{
    @Override
    public boolean isComfortable() {
        return true;
    }

    @Override
    public int cost() {
        return 500;
    }
}
