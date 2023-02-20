package tyler.bookclub.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import tyler.bookclub.models.Book;

@Controller
public class BookController {
    
    @GetMapping("/books")
    public String allBooks(){
        return "books/index.jsp";
    }

    @GetMapping("/books/new")
    public String newBook(@ModelAttribute("book")Book book){
        return "books/new.jsp";
    }

}
