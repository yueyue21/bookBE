package chris.booking.service;

import chris.booking.DTO.BookDTO;

import java.util.List;

public interface BookService {
    List<BookDTO> getAllBooks();
    BookDTO getBookById(Long id);
    void createBook(BookDTO bookDTO);
    void updateBook(Long id, BookDTO bookDTO);
    void deleteBook(Long id);
}
