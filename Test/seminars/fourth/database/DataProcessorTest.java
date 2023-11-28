package seminars.fourth.database;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.mockito.Mockito.*;


class DataProcessorTest {
    @Test
    void dataTest () {
        Database database = mock(Database.class);
        DataProcessor dataProcessor = new DataProcessor(database);

        when(database.query(anyString())).thenReturn(Arrays.asList("Data1", "Data2", "Data3"));

        List<String> result = dataProcessor.processData("запрос");

        verify(database).query("запрос");

        assertThat(result).hasSize(3);
    }

}