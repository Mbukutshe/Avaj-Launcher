package avajlauncher.Factory;

import avajlauncher.Exceptions.MyException;
import avajlauncher.FileWriter.SimulationFile;
import avajlauncher.Interfaces.Flyable;
import avajlauncher.Models.Coordinates;
import avajlauncher.aircrafts.Baloon;
import avajlauncher.aircrafts.Helicopter;
import avajlauncher.aircrafts.JetPlane;

public abstract class AircraftFactory
{
    public static Flyable newAircraft(String type, String name, int longitude, int latitude, int height)
            throws MyException {
        if (longitude < 0 || latitude < 0 || height < 0)
            throw new MyException("error: only positive values are required.");
        if (height > 100)
            height = 100;
        Coordinates coordinates = new Coordinates(longitude, latitude, height);

        if (type.equalsIgnoreCase("JetPlane"))
        {
            SimulationFile.SimulationWriter(type + " " + name + " has been created.");
            return new JetPlane(name, coordinates);
        } 
        else
            if (type.equalsIgnoreCase("Helicopter")) 
            {
                SimulationFile.SimulationWriter(type + " " + name + "  has been created.");
                return new Helicopter(name, coordinates);
            } 
            else 
                if (type.equalsIgnoreCase("Baloon"))
                {
                    SimulationFile.SimulationWriter(type + " " + name + "  has been created.");
                    return new Baloon(name, coordinates);
                }
        return null;
    }
}