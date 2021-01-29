package repository;

import domain.Author;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class AuthorRepository implements PanacheRepository<Author> { }
