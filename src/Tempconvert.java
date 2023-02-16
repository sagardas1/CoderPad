public class Tempconvert {

    public double[] convertTemperature(double celsius) {
        double i[] = {celsius + 273.15, (celsius * 1.80 + 32.00)};
        return i;
    }
}
