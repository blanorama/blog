package service;

import domain.BlogPost;
import domain.Author;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import repository.BlogPostRepository;
import repository.AuthorRepository;

@ApplicationScoped
public class AuthorService {

    private BlogPostRepository blogPostRepository;
    private AuthorRepository authorRepository;

    @Inject
    public AuthorService(BlogPostRepository blogPostRepository, AuthorRepository authorRepository) {
        this.blogPostRepository = blogPostRepository;
        this.authorRepository = authorRepository;
    }

    public AuthorService() { }

    public Author getById(long id) {
        return authorRepository.findById(id);
    }

    @Transactional
    public Author createAuthor(String name) {
        Author author = new Author();
        author.setName(name);
        authorRepository.persist(author);
        return author;
    }

    @Transactional
    public Author submitBlogPost(long authorId, String title, String content, String created) {
        BlogPost post = new BlogPost();
        post.setTitle(title);
        post.setContent(content);
        post.setCreated(created);
        blogPostRepository.persist(post);

        Author author = authorRepository.findById(authorId);
        author.getPosts().add(post);
        return author;
    }
}
