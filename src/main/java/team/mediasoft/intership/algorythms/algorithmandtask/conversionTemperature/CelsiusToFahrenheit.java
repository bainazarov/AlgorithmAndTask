package team.mediasoft.intership.algorythms.algorithmandtask.conversionTemperature;

public class CelsiusToFahrenheit implements Converter {
    @Override
    public double converter(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}
