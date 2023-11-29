package conversionTemperatureTest;

import conversionTemperature.converter.CelsiusToFahrenheit;
import conversionTemperature.converter.CelsiusToKelvin;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConversionTemperatureTest {

    @Test
    public void celsiusToKelvinTest_Positive() {
        double celsius = 15;
        double expected = 288.15;
        double actual = CelsiusToKelvin.convert(celsius);

        assertEquals(expected, actual);
    }

    @Test
    public void celsiusToKelvinTest_Negative() {
        double celsius = 15;
        double expected = 288.14;
        double actual = CelsiusToKelvin.convert(celsius);

        assertEquals(expected, actual);
    }

    @Test
    public void celsiusToFahrenheitTest_Positive() {
        double celsius = 15;
        double expected = 59;
        double actual = CelsiusToFahrenheit.convert(celsius);

        assertEquals(expected, actual);
    }

    @Test
    public void celsiusToFahrenheitTest_Negative() {
        double celsius = 15;
        double expected = 58;
        double actual = CelsiusToFahrenheit.convert(celsius);

        assertEquals(expected, actual);
    }
}
