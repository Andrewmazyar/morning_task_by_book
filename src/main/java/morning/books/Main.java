package morning.books;

import morning.books.lib.Injector;
import morning.books.model.Author;
import morning.books.model.Book;
import morning.books.model.Genre;
import morning.books.service.AuthorService;
import morning.books.service.BookService;
import morning.books.service.GenreService;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static Injector INJECTOR = Injector.getInstance("morning.books");

    public static void main(String[] args) {
        Genre roman = new Genre();
        Genre fighter = new Genre();
        Genre detective = new Genre();
        fighter.setName("fighter");
        roman.setName("roman");
        detective.setName("detective");
        GenreService genreService = (GenreService) INJECTOR.getInstance(GenreService.class);
        genreService.add(roman);
        genreService.add(fighter);
        genreService.add(detective);

        Author hector = new Author();
        Author pupkin = new Author();
        Author alkash = new Author();
        hector.setName("Hector");
        pupkin.setName("Pupkin");
        alkash.setName("Alkash");
        AuthorService authorService = (AuthorService) INJECTOR.getInstance(AuthorService.class);
        authorService.add(hector);
        authorService.add(pupkin);
        authorService.add(alkash);

        Book howToBecomeAlko = new Book();
        Book troya = new Book();
        List<Author> authors = new ArrayList<>();
        authors.add(pupkin);
        authors.add(alkash);
        howToBecomeAlko.setTitle("How To Become Alko");
        howToBecomeAlko.setAuthorList(authors);
        howToBecomeAlko.setGenre(roman);
        List<Author> fighters = new ArrayList<>();
        fighters.add(hector);
        troya.setTitle("Troya");
        troya.setAuthorList(fighters);
        troya.setGenre(fighter);
        BookService bookService = (BookService) INJECTOR.getInstance(BookService.class);
        bookService.add(howToBecomeAlko);
        bookService.add(troya);

        bookService.getBookByTitle("Troya").forEach(System.out::println);
        bookService.getListAllBookByGenre(roman).forEach(System.out::println);
        bookService.getListOfBookByAuthor(hector).forEach(System.out::println);
    }
}
