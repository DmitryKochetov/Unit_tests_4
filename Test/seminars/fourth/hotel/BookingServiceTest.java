package seminars.fourth.hotel;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class BookingServiceTest {
    private BookingService bookingService;
    private HotelService hotelService;



    @BeforeEach
    void setUp(){
        hotelService = mock(HotelService.class);
        bookingService= new BookingService(hotelService);
    }

    @Test
    void checkNumberTrue() {
        when(hotelService.isRoomAvailable(24)).thenReturn(true);

        boolean result = bookingService.bookRoom(24);

        assertTrue(result);
    }

    @Test
    void checkNumberFalse() {
        when(hotelService.isRoomAvailable(23)).thenReturn(false);

        boolean result = bookingService.bookRoom(23);

        assertFalse(result);
    }


}