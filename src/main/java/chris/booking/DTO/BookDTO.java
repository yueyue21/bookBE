package chris.booking.DTO;

import lombok.Data;

@Data
public class BookDTO {
    private Long id;
    private String title;
    private String author;
    private int publicationYear;
    private String isbn;
}