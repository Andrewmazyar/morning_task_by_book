package morning.books.service.impl;

import morning.books.dao.GenreDao;
import morning.books.lib.Inject;
import morning.books.lib.Service;
import morning.books.model.Genre;
import morning.books.service.GenreService;
import java.util.List;

@Service
public class GenreServiceImpl implements GenreService {
    @Inject
    private GenreDao genreDao;

    @Override
    public Genre add(Genre genre) {
        return genreDao.add(genre);
    }

    @Override
    public List<Genre> getAll() {
        return genreDao.getAll();
    }
}
