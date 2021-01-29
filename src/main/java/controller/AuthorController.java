package controller;

import controller.object.BlogPostObject;
import controller.object.AuthorObject;
import domain.BlogPost;
import domain.Author;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import service.AuthorService;

@Path("/authors")
public class AuthorController {

    @Inject
    AuthorService authorService;

    @POST
    @Produces("application/json")
    @Consumes("application/json")
    public Author create(AuthorObject authorObject) {
        return authorService.createAuthor(authorObject.getName());
    }

    @GET
    @Path("/{authorId}")
    @Produces("application/json")
    public Author get(@PathParam("authorId") long authorId) {
        return authorService.getById(authorId);
    }

    @POST
    @Path("/{authorId}/posts")
    @Produces("application/json")
    @Consumes("application/json")
    public Author submit(@PathParam("authorId") long authorId, BlogPostObject postObject) {
        return authorService.submitBlogPost(authorId, postObject.getTitle(), postObject.getContent(), postObject.getCreated());
    }
}
