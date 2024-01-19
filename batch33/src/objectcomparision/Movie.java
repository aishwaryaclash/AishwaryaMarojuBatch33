package objectcomparision;

import java.util.Comparator;

public class Movie  {
    private int yearReleased;
    private int rating;
    private double budget;
    private double collectionAmount;

    public Movie(int yearReleased, int rating, double budget, double collectionAmount) {
        this.budget = budget;
        this.collectionAmount = collectionAmount;
        this.rating = rating;
        this.yearReleased = yearReleased;
    }

    public int getYearReleased() {
        return yearReleased;
    }

    public int getRating() {
        return rating;
    }

    public double getBudget() {
        return budget;
    }

    public double getCollectionAmount() {
        return collectionAmount;
    }
}
