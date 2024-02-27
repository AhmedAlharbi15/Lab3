import java.util.ArrayList;
import java.util.List;
class Store {
    private List<Media> mediaList;
    private List<User> users;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public Store() {
        this.mediaList = new ArrayList<>();
        this.users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void displayUsers() {
        for (User user : users) {
            System.out.println(user);
        }
    }

    public void addMedia(Media media) {
        mediaList.add(media);
    }

    public void displayMedias() {
        for (Media media : mediaList) {
            System.out.println(media);
        }
    }

    public Book searchBook(String title) {
        for (Media media : mediaList) {
            if (media instanceof Book && media.getTitle().equals(title)) {
                return (Book) media;
            }
        }
        return null;
    }
}