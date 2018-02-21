package testtask;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController extends Blog{

    private static final String template = "Post list %s!";
   // private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/posts")
    public GetPosts posts(@RequestParam(value="PostsList", required=false, defaultValue="is empty") int[] mas) {
        return new GetPosts();
    } // Get:/posts
}