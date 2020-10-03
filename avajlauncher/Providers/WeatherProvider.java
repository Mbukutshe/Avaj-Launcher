package avajlauncher.Providers;

import avajlauncher.Models.Coordinates;

public class WeatherProvider {
    private static  WeatherProvider weatherProvider = new WeatherProvider();
    private static String weather[] = {"RAIN", "FOG", "SUN", "SNOW"};

    private WeatherProvider() {}

    public static WeatherProvider getProvider()
    {
        return WeatherProvider.weatherProvider;
    }

    public String getCurrentWeather(Coordinates coordinates)
    {
        int sum = coordinates.getLatitude() + coordinates.getLatitude() + coordinates.getHeight();
        int position = sum % 4;

        return weather[position];
    }
}