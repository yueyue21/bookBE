package main.java.chris.booking.mapper;

import chris.booking.DTO.BookDTO;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface BookMapper {

    @Select("SELECT * FROM books")
    List<BookDTO> getAllBooks();

    @Select("SELECT * FROM books WHERE id = #{id}")
    BookDTO getBookById(Long id);

    @Insert("INSERT INTO books (title, author, publicationYear, isbn) VALUES (#{title}, #{author}, #{publicationYear}, #{isbn})")
    void createBook(BookDTO bookDTO);

    @Update("UPDATE books SET title = #{title}, author = #{author}, publicationYear = #{publicationYear}, isbn = #{isbn} WHERE id = #{id}")
    void updateBook(BookDTO bookDTO);

    @Delete("DELETE FROM books WHERE id = #{id}")
    void deleteBook(Long id);
}
