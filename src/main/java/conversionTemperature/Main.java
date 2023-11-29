package conversionTemperature;

import conversionTemperature.converter.CelsiusToFahrenheit;
import conversionTemperature.converter.CelsiusToKelvin;

public class Main {
    public static void main(String[] args) {
        double celsius = 15;
        double kelvin = CelsiusToKelvin.convert(celsius);
        double fahrenheit = CelsiusToFahrenheit.convert(celsius);

        System.out.println(kelvin);
        System.out.println(fahrenheit);
    }
}
