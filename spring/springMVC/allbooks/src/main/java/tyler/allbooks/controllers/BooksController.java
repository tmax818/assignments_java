package tyler.allbooks.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;
import tyler.allbooks.models.Book;
import tyler.allbooks.services.BookService;


@Controller
public class BooksController {


    private final BookService bookService;
    public BooksController(BookService bookService){
        this.bookService = bookService;
    }

    @GetMapping("/")
    public String index(Model model){
        List<Book> books = bookService.allBooks();
        
        return "index.jsp";
    }

    @GetMapping("/books/{id}")
    public String show(@PathVariable("id")Long id, Model model){
        Book book = bookService.findBook(id);
        model.addAttribute("book", book);
        return "show.jsp";
    }
}
