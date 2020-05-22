package morning.books.service;

import morning.books.model.Genre;
import java.util.List;

public interface GenreService {

    Genre add(Genre genre);

    List<Genre> getAll();
}
