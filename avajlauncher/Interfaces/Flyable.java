package avajlauncher.Interfaces;

import avajlauncher.Weather.WeatherTower;

public interface Flyable {
    public void updateConditions();
    public void registerTower(WeatherTower WeatherTower);
}