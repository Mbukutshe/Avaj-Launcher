package avajlauncher.Weather;

import avajlauncher.Tower.Tower;
import avajlauncher.Models.Coordinates;
import avajlauncher.Providers.WeatherProvider;

public class WeatherTower extends Tower{

    public String getWeather(Coordinates coordinates)
    {
        return WeatherProvider.getProvider().getCurrentWeather(coordinates);
    }

    public void changeWeather()
    {
        this.conditionsChanged();
    }
}