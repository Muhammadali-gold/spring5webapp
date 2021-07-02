package guru.springframework.spring5webapp.bootstraps;

import guru.springframework.spring5webapp.model.Author;
import guru.springframework.spring5webapp.model.Book;
import guru.springframework.spring5webapp.model.Publishers;
import guru.springframework.spring5webapp.model.repositories.AuthorRepositories;
import guru.springframework.spring5webapp.model.repositories.BookRepositories;
import guru.springframework.spring5webapp.model.repositories.PublisherRepositories;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapsData implements CommandLineRunner {

    private final AuthorRepositories authorRepositories;
    private final BookRepositories bookRepositories;
    private final PublisherRepositories publisherRepository;

    public BootstrapsData(AuthorRepositories authorRepositories, BookRepositories bookRepositories, PublisherRepositories publisherRepository) {
        this.authorRepositories = authorRepositories;
        this.bookRepositories = bookRepositories;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) {
        System.out.println("Started in Bootstrap");


        Publishers publisher = new Publishers();
        publisher.setName("SFG Publishing");
        publisher.setCity("St Petersburg");
        publisher.setState("FL");

        publisherRepository.save(publisher);


        System.out.println("Publishers Count: " + publisherRepository.count());

        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Domain Driven Design","123123");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);
        ddd.setPublishers(publisher);
        publisher.getBooks().add(ddd);

        authorRepositories.save(eric);
        bookRepositories.save(ddd);

        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("J2EE development without EJB","123546");
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);
        noEJB.setPublishers(publisher);

        publisher.getBooks().add(noEJB);

        authorRepositories.save(rod);
        bookRepositories.save(noEJB);

        System.out.println("Started in Bootstraps");
        System.out.println("Number of books: " + bookRepositories.count());
        System.out.println("Number of authors: " + authorRepositories.count());
        System.out.println("Publisher Number of books: " + publisher.getBooks().size());
    }
}
