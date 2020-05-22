package morning.books.service.impl;

import morning.books.dao.AuthorDao;
import morning.books.lib.Inject;
import morning.books.lib.Service;
import morning.books.model.Author;
import morning.books.service.AuthorService;
import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {
    @Inject
    private AuthorDao authorDao;

    @Override
    public Author add(Author author) {
        return authorDao.add(author);
    }

    @Override
    public List<Author> getAll() {
        return authorDao.getAll();
    }
}
