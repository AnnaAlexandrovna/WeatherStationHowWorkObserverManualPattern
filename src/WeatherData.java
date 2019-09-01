import java.util.ArrayList;

public class WeatherData implements  Subject {

    private ArrayList observers;
    private float temperarure;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i<observers.size(); i++){
            Observer observer = (Observer)observers.get(i);
            observer.update(temperarure, humidity, pressure);
        }
    }

    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements (float temperarure, float humidity, float pressure) {
        this.temperarure = temperarure;
        this.humidity = humidity;
        this.pressure = pressure;

        measurementsChanged();
    }
}
