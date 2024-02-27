import java.util.ArrayList;
import java.util.List;
class Music extends Media {
    private String artist;

    public Music(String title, String artist, String ISBN, double price) {
        super(title, "", ISBN, price);
        this.artist = artist;
    }

    public void listen(User user) {
        user.addToPurchased(this);
    }

    public void generatePlaylist(List<Music> musicCatalog) {
    }

    @Override
    public String getMediaType() {
        return getPrice() >= 10 ? "Premium Music" : "Music";
    }

    @Override
    public String toString() {
        return "Music{" +
                "title='" + getTitle() + '\'' +
                ", artist='" + artist + '\'' +
                ", ISBN='" + getISBN() + '\'' +
                ", price=" + getPrice() +
                '}';
    }
}
