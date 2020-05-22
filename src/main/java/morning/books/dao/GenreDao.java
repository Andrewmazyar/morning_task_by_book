package morning.books.dao;

import morning.books.model.Genre;
import java.util.List;

public interface GenreDao {

    Genre add(Genre genre);

    List<Genre> getAll();
}
