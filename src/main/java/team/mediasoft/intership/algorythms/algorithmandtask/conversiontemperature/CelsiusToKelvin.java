package team.mediasoft.intership.algorythms.algorithmandtask.conversiontemperature;

public class CelsiusToKelvin implements Converter {

    @Override
    public double converter(double celsius) {
        return celsius + 273.15;
    }
}
