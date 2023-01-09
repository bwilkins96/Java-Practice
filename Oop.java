import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

class Oop {
    public static void main(String[] args) {
        User user = new User("Ben", "1996-11-05");

        System.out.printf("%s was born on %s and he is now %d years old.\n",
            user.getName(), user.getBirthDay(), user.age());

        Book book = new Book("A Tale of Two Cities", "Charles Dickens", 112);
        Book book2 = new Book("Origin of Species", "Charles Darwin", 502);
        AudioBook book3 = new AudioBook("Dracula", "Bram Stoker", 240);
        EBook book4 = new EBook("Meditations", "Marcus Aurelius", 170, "PDF");

        user.borrow(book);
        user.borrow(book2);
        user.borrow(book3);
        user.borrow(book4);

        System.out.printf("\n%s has borrowed these books: ", user.getName());
        for (int i = 0; i < user.getBooks().size(); i++) {
            System.out.printf("%s", user.getBooks().get(i).toString());
            
            if (i < user.getBooks().size()-1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}

class User {
    private String name;
    private LocalDate birthDay;
    private ArrayList<Book> books = new ArrayList<Book>();

    User(String name, String birthDay) {
        this.name = name;
        this.birthDay = LocalDate.parse(birthDay);
    }

    public String getName() {
        return this.name;
    }

    public String getBirthDay() {
        return this.birthDay.toString();
    }

    public ArrayList<Book> getBooks() {
        return this.books;
    }

    public int age() {
        int age = Period.between(this.birthDay, LocalDate.now()).getYears();
        return age;
    }

    public void borrow(Book book) {
        this.books.add(book);
    }
}

class Book {
    private String title;
    private String author;
    private int pageCount;

    Book(String title, String author, int pageCount) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getPageCount() {
        return this.pageCount;
    }

    public String toString() {
        return String.format("%s by %s", this.title, this.author);
    }
}

class AudioBook extends Book {
    private int runTime;

    AudioBook(String title, String author, int runTime) {
        super(title, author, 0);
        this.runTime = runTime;
    }

    public int getRunTime() {
        return this.runTime;
    }
}

class EBook extends Book {
    private String format;

    EBook(String title, String author, int pageCount, String format) {
        super(title, author, pageCount);
        this.format = format;
    }

    String getFormat() {
        return format;
    }
}