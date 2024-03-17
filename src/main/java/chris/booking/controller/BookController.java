package main.java.chris.booking.controller;

import chris.booking.DTO.BookDTO;
import chris.booking.service.BookService;
import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping("/getAll")
    public List<BookDTO> getAllBooks() {
        return bookService.getAllBooks();
    }

    @PostMapping("/{id}")
    public BookDTO getBookById(@PathVariable Long id) {
        return bookService.getBookById(id);
    }

    @PostMapping("/create")
    public void createBook(@RequestBody BookDTO bookDTO) {
        bookService.createBook(bookDTO);
    }

    @PostMapping("/update/{id}")
    public void updateBook(@PathVariable Long id, @RequestBody BookDTO bookDTO) {
        bookService.updateBook(id, bookDTO);
    }

    @PostMapping("/delete/{id}")
    public void deleteBook(@PathVariable Long id) {
        bookService.deleteBook(id);
    }
}