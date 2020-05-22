package morning.books.dao;

import morning.books.model.Author;
import java.util.List;

public interface AuthorDao {

    Author add (Author author);

    List<Author> getAll();
}
