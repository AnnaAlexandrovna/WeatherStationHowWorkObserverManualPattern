public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditiondDisplay currentConditiondDisplay = new CurrentConditiondDisplay(weatherData);

        weatherData.setMeasurements(80,65, 30.4f);
        weatherData.setMeasurements(82,70,29.2f);
    }
}
