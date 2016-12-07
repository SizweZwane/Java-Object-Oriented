package aggregation;

/**
 * Created by Sizwe on 2016/12/07.
 */
class Author {
    private String authorName;
    private int age;
    private String place;

    Author(String name, int age, String place) {
        this.authorName = name;
        this.age = age;
        this.place = place;
    }

    String getAuthorName() {
        return authorName;
    }

    int getAge() {
        return age;
    }

    String getPlace() {
        return place;
    }
}

class Book {
    private String name;
    private int price;
    private Author author;

    Book(String n, int p, Author author) {
        this.name = n;
        this.price = p;
        this.author = author;
    }

    String getName() {
        return name;
    }

    int getPrice() {
        return price;
    }

    Author getAuthor() {
        return author;
    }
}

public class Aggregation {

    public static void main(String args[]) {
        Author author = new Author("Sizwe", 23, "South Africa");
        Book book = new Book("Head First Java", 550, author);
        showDetail(book);
    }

    private static void showDetail(Book book) {
        System.out.println("Book: " + book.getName());
        System.out.println("price: $" + book.getPrice());
        System.out.println("Author: " + book.getAuthor().getAuthorName() + "(" + book.getAuthor().getAge() + ") from " + book.getAuthor().getPlace());
    }
}
