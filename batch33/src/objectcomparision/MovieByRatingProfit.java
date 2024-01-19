package objectcomparision;

import java.util.Comparator;

public class MovieByRatingProfit implements Comparator<Movie> {
    @Override
    public int compare(Movie m1, Movie m2) {
        if ((m1.getRating() > m2.getRating()) && ((m1.getCollectionAmount() - m1.getBudget()) > (m2.getCollectionAmount() - m2.getBudget()))) {
            return 1;
        } else if ((m1.getRating() < m2.getRating()) && ((m1.getCollectionAmount() - m1.getBudget()) < (m2.getCollectionAmount() - m2.getBudget()))) {
            return -1;
        } else {
            return 0;
        }

    }
}
