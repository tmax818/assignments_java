package tyler.renderingbooks.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import tyler.renderingbooks.Models.Book;
import tyler.renderingbooks.Services.BookService;


@Controller
public class BooksController {


    private final BookService bookService;
    public BooksController(BookService bookService){
        this.bookService = bookService;
    }

    @GetMapping("/books/{id}")
    public String show(@PathVariable("id")Long id, Model model){
        Book book = bookService.findBook(id);
        model.addAttribute("book", book);
        return "show.jsp";
    }
}
