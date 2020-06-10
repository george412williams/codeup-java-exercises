public class Dish {

    private int costInCents;
    private String nameOfDish;
    private boolean wouldRecommend;
    public void printSummary(){
        System.out.printf("Cost: %d%n" + "Name: %s%n" + "Recommended: %b%n", costInCents, nameOfDish, wouldRecommend);

    }
    public int getCostInCents(int costInCents) {
        return costInCents;
    }

    public void setCostInCents(int costInCents) {
        this.costInCents = costInCents;
    }

    public String getNameOfDish(String nameOfDish) {
        return nameOfDish;
    }

    public void setNameOfDish(String nameOfDish) {
        this.nameOfDish = nameOfDish;
    }

    public boolean getWouldRecommend(){
        return wouldRecommend;
    }

    public void setWouldRecommend(boolean wouldRecommend) {
        this.wouldRecommend = wouldRecommend;
    }


}
