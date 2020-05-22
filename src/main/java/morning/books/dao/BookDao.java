package morning.books.dao;

import morning.books.model.Author;
import morning.books.model.Book;
import morning.books.model.Genre;
import java.util.List;

public interface BookDao {

    Book add(Book book);

    List<Book> getAll();

    List<Book> getBookByTitle(String title);

    List<Book> getListOfBookByAuthor(Author author);

    List<Book> getListAllBookByGenre(Genre genre);
}
