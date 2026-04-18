package Bookmarklist;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class controller {

    @GetMapping("/")
    public List<bookmark_entry> getAllBookmarks() {
        return List.of(
                new bookmark_entry("Youtube"),
                new bookmark_entry("Facebook"),
                new bookmark_entry("Instagram"),
                new bookmark_entry("HTW-Berlin")
        );
    }

}
