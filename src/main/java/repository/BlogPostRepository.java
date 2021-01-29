package repository;

import domain.BlogPost;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class BlogPostRepository implements PanacheRepository<BlogPost> { }
