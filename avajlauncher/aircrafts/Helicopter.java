package avajlauncher.aircrafts;

import avajlauncher.FileWriter.SimulationFile;
import avajlauncher.Interfaces.Flyable;
import avajlauncher.Models.Coordinates;
import avajlauncher.Weather.WeatherTower;
import avajlauncher.aircrafts.Messages.Landing;
import avajlauncher.aircrafts.Messages.MessagesHandler;

public class Helicopter extends Aircraft implements Flyable
{
    
    private WeatherTower weatherTower;

    public Helicopter(String name, Coordinates coordinates)
    {
        super(name, coordinates);
    }

    @Override
    public void updateConditions()
    {
       String status = this.changePoints(weatherTower.getWeather(this.coordinates), 1);
       if (status.equals("SUN"))
            SimulationFile.SimulationWriter("Helicopter#" + this.getName() + "(" + this.getId() + "): " + MessagesHandler.HELICOPTER.get(0));
        else
            if (status.equals("RAIN"))
                SimulationFile.SimulationWriter("Helicopter#" + this.getName() + "(" + this.getId() + "): " + MessagesHandler.HELICOPTER.get(1));
            else
                if (status.equals("FOG"))
                    SimulationFile.SimulationWriter("Helicopter#" + this.getName() + "(" + this.getId() + "): " + MessagesHandler.HELICOPTER.get(2));
                else
                    if (status.equals("SNOW"))
                        SimulationFile.SimulationWriter("Helicopter#" + this.getName() + "(" + this.getId() + "): " + MessagesHandler.HELICOPTER.get(3));
                    else
                        if (status.equals("GROUNDED"))
                            SimulationFile.SimulationWriter("Helicopter#" + this.getName() + "(" + this.getId() + "): " + MessagesHandler.HELICOPTER.get(4));
       Landing.PrintOut(1, status, this);
       if (status.equals("GROUNDED"))
       {
            this.weatherTower.unregister(this);
            SimulationFile.SimulationWriter("Tower says: Helicopter#" + this.name + "(" + this.id + ")" + " unregistered from weather tower.");
       }
    }
    
    @Override
    public void registerTower(WeatherTower weatherTower)
    {
        this.weatherTower = weatherTower;
		this.weatherTower.register(this);
		SimulationFile.SimulationWriter("Tower says: Helicopter#" + this.name + "(" + this.id + ")" + " registered to weather tower.");
    }
}