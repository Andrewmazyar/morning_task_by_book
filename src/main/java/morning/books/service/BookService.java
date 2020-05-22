package morning.books.service;

import morning.books.model.Author;
import morning.books.model.Book;
import morning.books.model.Genre;
import java.util.List;

public interface BookService {
    Book add(Book book);

    List<Book> getAll();

    List<Book> getBookByTitle(String title);

    List<Book> getListOfBookByAuthor(Author author);

    List<Book> getListAllBookByGenre(Genre genre);
}
