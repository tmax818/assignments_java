package tyler.bookclub.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import tyler.bookclub.models.Book;
import tyler.bookclub.services.BookService;

@Controller
public class BookController {

    @Autowired BookService bookService;

    //! CREATE
    
    @GetMapping("/books/new")
    public String newBook(@ModelAttribute("book")Book book){
        return "books/new.jsp";
    }

    @PostMapping("/books")
    public String createBook(@ModelAttribute("book")Book book){
        bookService.addBook(book);
        return "redirect:/books";
    }

    //! READ ALL
    
    @GetMapping("/books")
    public String allBooks(Model model){
        List<Book> books = bookService.getAll();
        model.addAttribute("books", books);
        return "books/index.jsp";
    }

    //! READ ONE

    @GetMapping("/books/{id}")
    public String show(@PathVariable("id")Long id, Model model){
        Book book = bookService.getOne(id);
    }
}
