package tyler.bookclub.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tyler.bookclub.models.Book;
import tyler.bookclub.repositories.BookRepository;

@Service
public class BookService {

    @Autowired BookRepository bookRepository;

    public void addBook(Book book){
        bookRepository.save(book);
    }

    public List<Book> getAll() {
        return bookRepository.findAll();
    }

    public Book getOne(Long id){
        Optional<Book> book = bookRepository.findById(id);
        return book.orElse(null);
    }
    
}
