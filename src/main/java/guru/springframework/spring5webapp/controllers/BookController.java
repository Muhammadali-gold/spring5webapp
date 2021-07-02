package guru.springframework.spring5webapp.controllers;

import guru.springframework.spring5webapp.model.repositories.BookRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {


    private final BookRepositories bookRepositories;

    public BookController(BookRepositories bookRepositories) {
        this.bookRepositories = bookRepositories;
    }

    @RequestMapping(path = "/books")
    public String getbooks(Model model){

        model.addAttribute("books",bookRepositories.findAll());

        return "books";
    }
}
