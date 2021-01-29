package service;

import domain.BlogPost;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import repository.BlogPostRepository;

@ApplicationScoped
public class BlogPostService {

    private BlogPostRepository blogPostRepository;

    @Inject
    public BlogPostService(BlogPostRepository blogPostRepository) {
        this.blogPostRepository = blogPostRepository;
    }

    public BlogPostService() {}

    @Transactional
    public BlogPost highlight(long postId) {
        BlogPost post = blogPostRepository.findById(postId);
        post.setHighlighted(true);
        return post;
    }
}
