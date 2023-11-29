package conversiontemperaturetest;

import org.junit.jupiter.api.Test;
import team.mediasoft.intership.algorythms.algorithmandtask.conversiontemperature.CelsiusToFahrenheit;
import team.mediasoft.intership.algorythms.algorithmandtask.conversiontemperature.CelsiusToKelvin;
import team.mediasoft.intership.algorythms.algorithmandtask.conversiontemperature.Converter;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConversionTemperatureTest {
    @Test
    public void celsiusToKelvinTest_Positive() {
        Converter converter = new CelsiusToKelvin();
        double actual = converter.converter(15);

        assertEquals(288.15, actual);
    }

    @Test
    public void celsiusToFahrenheitTest_Positive() {
        Converter converter = new CelsiusToFahrenheit();
        double actual = converter.converter(15);

        assertEquals(59, actual);

    }
}
