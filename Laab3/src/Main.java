//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        Store store = new Store();

        Book book1 = new Book("Book1", "Author1", "ISBN1", 20.0, 10);
        store.addMedia(book1);
        Movie movie1 = new Movie("Movie1", "Director1", "ISBN2", 15.0, 130);
        store.addMedia(movie1);
        Music music1 = new Music("Song1", "Artist1", "ISBN3", 5.0);
        store.addMedia(music1);
        Novel novel1 = new Novel("Novel1", "Author2", "ISBN4", 25.0, 5, "Fiction");
        store.addMedia(novel1);
        AcademicBook academicBook1 = new AcademicBook("AcademicBook1", "Author3", "ISBN5", 30.0, 8, "Science");
        store.addMedia(academicBook1);

        User user1 = new User("User1", "user1@gmail.com");
        store.addUser(user1);

        System.out.println("Available Medias:");
        store.displayMedias();

        user1.addToCart(book1);
        user1.addToCart(movie1);
        user1.addToCart(music1);

        System.out.println("\nShopping Cart for " + user1.getUsername() + ":");
        user1.getShoppingCart().forEach(System.out::println);

        user1.checkout();
        System.out.println("\nPurchase completed for " + user1.getUsername() + ".");

        System.out.println("\nPurchased Media for " + user1.getUsername() + ":");
        user1.getPurchased().forEach(System.out::println);
    }
    }
