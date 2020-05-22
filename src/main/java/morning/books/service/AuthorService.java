package morning.books.service;

import morning.books.model.Author;
import java.util.List;

public interface AuthorService {

    Author add (Author author);

    List<Author> getAll();
}
