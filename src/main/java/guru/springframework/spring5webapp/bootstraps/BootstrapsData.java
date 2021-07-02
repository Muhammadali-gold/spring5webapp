package guru.springframework.spring5webapp.bootstraps;

import guru.springframework.spring5webapp.model.Author;
import guru.springframework.spring5webapp.model.Book;
import guru.springframework.spring5webapp.model.repositories.AuthorRepositories;
import guru.springframework.spring5webapp.model.repositories.BookRepositories;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapsData implements CommandLineRunner {

    private final AuthorRepositories authorRepositories;
    private final BookRepositories bookRepositories;

    public BootstrapsData(AuthorRepositories authorRepositories, BookRepositories bookRepositories) {
        this.authorRepositories = authorRepositories;
        this.bookRepositories = bookRepositories;
    }

    @Override
    public void run(String... args) throws Exception {
        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Domain Driven Design","123123");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        authorRepositories.save(eric);
        bookRepositories.save(ddd);

        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("J2EE development without EJB","123546");
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);

        authorRepositories.save(rod);
        bookRepositories.save(noEJB);

        System.out.println("Started in Bootstraps");
        System.out.println("Number of books: " + bookRepositories.count());
        System.out.println("Number of authors: " + authorRepositories.count());
    }
}
