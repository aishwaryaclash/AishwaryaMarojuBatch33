package objectcomparision;
import java.lang.*;
import java.util.*;

public class MovieComparisionMain {
    public static void main(String args[]) {
        Movie movie1 = new Movie(2020, 8, 50.0d, 200.0d);
        Movie movie2 = new Movie(2022, 7, 60.0d, 180.0d);
        Movie movie3 = new Movie(2020, 9, 40.0d, 250.0d);

        // Creating a list of movies
        List<Movie> movies = new ArrayList<>();
        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);

        // Using MovieByYearReleasedAndRating comparator
        System.out.println("Printing Best Movie based on Year Released and Rating:");
        Collections.sort(movies, new MovieByYearReleasedAndRating());
        printMovies(movies);

        // Using MovieByRatingProfit comparator
        System.out.println("\nPrinting Best Movies by Rating and Profit:");
        Collections.sort(movies, new MovieByRatingProfit());
        printMovies(movies);
    }
        private static void printMovies(List<Movie> movies) {
            for (Movie movie : movies) {
                System.out.println(movie.getYearReleased() + " - Rating: " + movie.getRating() +
                        " - Profit: " + (movie.getCollectionAmount() - movie.getBudget()));
            }
        }

    }



