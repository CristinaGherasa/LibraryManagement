package com.application.courselibrary;

import com.application.courselibrary.entity.Author;
import com.application.courselibrary.entity.Book;
import com.application.courselibrary.entity.Category;
import com.application.courselibrary.entity.Publisher;
import com.application.courselibrary.service.BookService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CourselibraryApplication {

    public static void main(String[] args) {
        SpringApplication.run(CourselibraryApplication.class, args);
    }

    @Bean
    public CommandLineRunner initialCreate(BookService bookService) {
        return (args) -> {
            Book book1 = new Book("1569844", "Maitrey", "Roman publicat in 1933");
            Author author1 = new Author("Mircea Eliade", "Autorul avea 26 de ani");
            Category category1 = new Category("Beletristica");
            Publisher publisher1 = new Publisher("Agora");
            book1.addAuthor(author1);
            book1.addCategory(category1);
            book1.addPublisher(publisher1);
            bookService.createBook(book1);

            Book book2 = new Book("1234756", "Micul Print", "Cea mai citita carte a sec XX");
            Author author2 = new Author("Antoine de Saint Exupery", "S-a inspirat din realitate");
            Category category2 = new Category("Fictiune");
            Publisher publisher2 = new Publisher("RAO");
            book1.addAuthor(author2);
            book1.addCategory(category2);
            book1.addPublisher(publisher2);
            bookService.createBook(book2);

            Book book3 = new Book("3784512", "Batranul si marea", "Publicata in 1952");
            Author author3 = new Author("Ernest Hemingway", "Autorul a castigat premiul Pulitzer");
            Category category3 = new Category("Clasici");
            Publisher publisher3 = new Publisher("Polirom");
            book1.addAuthor(author3);
            book1.addCategory(category3);
            book1.addPublisher(publisher3);
            bookService.createBook(book3);

            Book book4 = new Book("7755641", "Mizerabilii", "Roman terminat in 1862");
            Author author4 = new Author("Victor Hugo", "Autorul era in exil");
            Category category4 = new Category("Clasici");
            Publisher publisher4 = new Publisher("Litera");
            book1.addAuthor(author4);
            book1.addCategory(category4);
            book1.addPublisher(publisher4);
            bookService.createBook(book4);
        };
    }

}
