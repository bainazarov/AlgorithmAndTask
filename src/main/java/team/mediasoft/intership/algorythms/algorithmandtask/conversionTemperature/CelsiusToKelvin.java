package team.mediasoft.intership.algorythms.algorithmandtask.conversionTemperature;

public class CelsiusToKelvin implements Converter {

    @Override
    public double converter(double celsius) {
        return celsius + 273.15;
    }
}
