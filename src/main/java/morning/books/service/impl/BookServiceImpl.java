package morning.books.service.impl;

import morning.books.dao.BookDao;
import morning.books.lib.Inject;
import morning.books.lib.Service;
import morning.books.model.Author;
import morning.books.model.Book;
import morning.books.model.Genre;
import morning.books.service.BookService;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Inject
    private BookDao bookDao;

    @Override
    public Book add(Book book) {
        return bookDao.add(book);
    }

    @Override
    public List<Book> getAll() {
        return bookDao.getAll();
    }

    @Override
    public List<Book> getBookByTitle(String title) {
        return bookDao.getBookByTitle(title);
    }

    @Override
    public List<Book> getListOfBookByAuthor(Author author) {
        return bookDao.getListOfBookByAuthor(author);
    }

    @Override
    public List<Book> getListAllBookByGenre(Genre genre) {
        return bookDao.getListAllBookByGenre(genre);
    }
}
