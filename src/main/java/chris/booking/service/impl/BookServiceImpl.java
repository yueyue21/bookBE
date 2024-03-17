package chris.booking.service.impl;

import chris.booking.DTO.BookDTO;
import chris.booking.mapper.BookMapper;
import chris.booking.mapper.
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements  {

    private final BookMapper bookMapper;

    @Autowired
    public BookServiceImpl(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public List<BookDTO> getAllBooks() {
        return bookMapper.getAllBooks();
    }

    @Override
    public BookDTO getBookById(Long id) {
        return bookMapper.getBookById(id);
    }

    @Override
    public void createBook(BookDTO bookDTO) {
        bookMapper.createBook(bookDTO);
    }

    @Override
    public void updateBook(Long id, BookDTO bookDTO) {
        bookDTO.setId(id);
        bookMapper.updateBook(bookDTO);
    }

    @Override
    public void deleteBook(Long id) {
        bookMapper.deleteBook(id);
    }
}
