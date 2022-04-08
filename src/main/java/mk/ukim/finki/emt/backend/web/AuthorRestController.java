package mk.ukim.finki.emt.backend.web;

import lombok.AllArgsConstructor;
import mk.ukim.finki.emt.backend.model.Author;
import mk.ukim.finki.emt.backend.service.AuthorService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/authors")
@AllArgsConstructor
public class AuthorRestController {

    private final AuthorService authorService;

    @GetMapping
    public List<Author> listAuthors(){
        return this.authorService.listAuthors();
    }
}
