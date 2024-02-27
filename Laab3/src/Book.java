import java.util.ArrayList;
import java.util.List;
class Book extends Media {
    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    private int stock;
    private List<Review> reviews;

    public Book(String title, String author, String ISBN, double price, int stock) {
        super(title, author, ISBN, price);
        this.stock = stock;
        this.reviews = new ArrayList<>();
    }

    public void addReview(Review review) {
        reviews.add(review);
    }

    public double getAverageRating() {
        if (reviews.isEmpty()) return 0.0;
        double sum = 0.0;
        for (Review review : reviews) {
            sum += review.getRating();
        }
        return sum / reviews.size();
    }

    public void purchase(User user) {
        user.addToPurchased(this);
        stock--;
    }

    public boolean isBestseller() {
        return getAverageRating() >= 4.5;
    }

    public void restock(int quantity) {
        stock += quantity;
        System.out.println("Restocked " + getTitle() + " by " + getAuthor() + " with " + quantity + " copies.");
    }

    @Override
    public String getMediaType() {
        return isBestseller() ? "Bestselling Book" : "Book";
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + getTitle() + '\'' +
                ", author='" + getAuthor() + '\'' +
                ", ISBN='" + getISBN() + '\'' +
                ", price=" + getPrice() +
                ", stock=" + stock +
                '}';
    }
}
