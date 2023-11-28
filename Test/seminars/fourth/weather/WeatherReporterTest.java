package seminars.fourth.weather;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class WeatherReporterTest {
    @Test
    void weatherTest(){

        WeatherService serviceMock = mock(WeatherService.class);
        WeatherReporter weatherReporter = new WeatherReporter(serviceMock);
        when(serviceMock.getCurrentTemperature()).thenReturn(25);

        String result = weatherReporter.generateReport();

        assertEquals("Текущая температура: " + 25 + " градусов.",result);
    }
}