import java.util.ArrayList;
import java.util.List;
class AcademicBook extends Book {
    private String subject;

    public AcademicBook(String title, String author, String ISBN, double price, int stock, String subject) {
        super(title, author, ISBN, price, stock);
        this.subject = subject;
    }

    @Override
    public String getMediaType() {
        return isBestseller() ? "Bestselling AcademicBook" : "AcademicBook";
    }

    @Override
    public String toString() {
        return "AcademicBook{" +
                "title='" + getTitle() + '\'' +
                ", author='" + getAuthor() + '\'' +
                ", ISBN='" + getISBN() + '\'' +
                ", price=" + getPrice() +
                ", stock=" + stock +
                ", subject='" + subject + '\'' +
                '}';
    }
}