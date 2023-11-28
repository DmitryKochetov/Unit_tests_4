package seminars.fourth.book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;


class BookServiceTest {

    private BookService bookService;
    private InMemoryBookRepository bookRepository;


    @BeforeEach
    void setUp(){
        bookRepository = mock(InMemoryBookRepository.class);
        bookService = new BookService(bookRepository);
    }

    @Test
    void checkBookFindById() {
        when(bookRepository.findById("1")).thenReturn(new Book("1"));
        Book result = bookRepository.findById("1");
        assertThat(result).isNotNull();
    }

    @Test
    void checkBookFindAll() {
        when(bookRepository.findAll()).thenReturn(Arrays.asList(new Book("1"), new Book("2")));
        List<Book> result = bookRepository.findAll();
        assertThat(result).hasSize(2);;
    }

}