import java.util.ArrayList;
import java.util.List;
class Review {
    private String username;
    private double rating;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    private String comments;

    public Review(String username, double rating, String comments) {
        this.username = username;
        this.rating = rating;
        this.comments = comments;
    }

}
