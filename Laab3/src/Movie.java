import java.util.ArrayList;
import java.util.List;
class Movie extends Media {
    private int duration;

    public Movie(String title, String author, String ISBN, double price, int duration) {
        super(title, author, ISBN, price);
        this.duration = duration;
    }

    public void watch(User user) {
        user.addToPurchased(this);
    }

    public void recommendSimilarMovies(List<Movie> movieCatalog) {
    }

    @Override
    public String getMediaType() {
        return duration >= 120 ? "Long Movie" : "Movie";
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + getTitle() + '\'' +
                ", author='" + getAuthor() + '\'' +
                ", ISBN='" + getISBN() + '\'' +
                ", price=" + getPrice() +
                ", duration=" + duration +
                '}';
    }
}
