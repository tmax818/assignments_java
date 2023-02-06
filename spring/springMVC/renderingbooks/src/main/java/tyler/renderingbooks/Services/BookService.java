package tyler.renderingbooks.Services;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import tyler.renderingbooks.Models.Book;
import tyler.renderingbooks.Repositories.BookRepository;

@Service
public class BookService {
        // adding the book repository as a dependency
        private final BookRepository bookRepository;
    
        public BookService(BookRepository bookRepository) {
            this.bookRepository = bookRepository;
        }
        // returns all the books
        public List<Book> allBooks() {
            return bookRepository.findAll();
        }
        // creates a book
        public Book createBook(Book b) {
            return bookRepository.save(b);
        }
        // retrieves a book
        public Book findBook(Long id) {
            Optional<Book> optionalBook = bookRepository.findById(id);
            if(optionalBook.isPresent()) {
                return optionalBook.get();
            } else {
                return null;
            }
        }
        
        public Book updateBook(Book book){
            return bookRepository.save(book);
        }

        public void deleteBook(Long id){
            bookRepository.deleteById(id);
        }
    
}
