import java.util.ArrayList;
import java.util.List;
class Novel extends Book {
    private String genre;

    public Novel(String title, String author, String ISBN, double price, int stock, String genre) {
        super(title, author, ISBN, price, stock);
        this.genre = genre;
    }

    @Override
    public String getMediaType() {
        return isBestseller() ? "Bestselling Novel" : "Novel";
    }

    @Override
    public String toString() {
        return "Novel{" +
                "title='" + getTitle() + '\'' +
                ", author='" + getAuthor() + '\'' +
                ", ISBN='" + getISBN() + '\'' +
                ", price=" + getPrice() +
                ", stock=" + stock +
                ", genre='" + genre + '\'' +
                '}';
    }
}