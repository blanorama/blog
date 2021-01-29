package controller;

import domain.BlogPost;
import javax.inject.Inject;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import service.BlogPostService;

@Path("/posts")
public class BlogPostController {

   @Inject
   BlogPostService blogPostService;

   @PUT
   @Produces("application/json")
   @Path("/{postId}")
   public BlogPost highlight(@PathParam("postId") long postId) {
       return blogPostService.highlight(postId);
   }

}
