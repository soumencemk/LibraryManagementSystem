package org.jake.library.services;

import lombok.RequiredArgsConstructor;
import org.jake.library.entities.Book;
import org.jake.library.repositories.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;

    public void addBook(Book book) {
        bookRepository.save(book);
    }

    public void removeBook(Book book) {
        bookRepository.delete(book);
    }

    public Book getBook(int id) {
        return bookRepository.findById(id).get();
    }

    public List<Book> getBookList(){
        return bookRepository.findAll();
    }

    public boolean bookExists(Book book) {
        return bookRepository.existsById(book.getId());
    }
}
