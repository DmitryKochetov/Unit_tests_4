package seminars.fourth.message;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


class NotificationServiceTest {
    @Test
    void checkMessage(){
        MessageService messageService = mock(MessageService.class);
        NotificationService notificationService = new NotificationService(messageService);

        notificationService.sendNotification("сообщение", "Nataly");

        verify(messageService).sendMessage("сообщение", "Nataly");
    }
}