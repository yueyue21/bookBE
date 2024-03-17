package main.java.chris.booking.entity;

import lombok.Data;

@Data
public class Book {
    private Long id;
    private String title;
    private String author;
    private int publicationYear;
    private String isbn;
}
