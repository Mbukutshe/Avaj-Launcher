package avajlauncher.Simulation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import avajlauncher.Weather.WeatherTower;
import avajlauncher.Exceptions.MyException;
import avajlauncher.Factory.AircraftFactory;
import avajlauncher.FileWriter.SimulationFile;

public class Simulator
{

    static int runTimes;
    static BufferedReader reader;
    static String cLine;
    static WeatherTower tower;
    final static int st_line = 1;

    public static void main(String[] args)
    {
        if (args.length < 1)
            return;
        try
        {
            File input = new File(args[0]);
            startSimulation(input);
            new SimulationFile();
            createAircrafts();
            while (runTimes-- > 0)
                tower.changeWeather();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return;
        }
    }

    public static void startSimulation(File input) throws MyException {
        try {
            reader = new BufferedReader(new FileReader(input));
            runTimes = Integer.parseInt(reader.readLine());
        } catch (Exception ex) {
            throw new MyException(ex);
        }
    }

    public static void createAircrafts() throws MyException
    {
        try
        {
            String type; String name; int longitude; int latitude; int height;
            String input[];
            tower = new WeatherTower();
            cLine = reader.readLine();
            while (cLine != null)
            {
                input = cLine.split("\\s+");
                type = input[0];
                name = input[1];
                longitude = Integer.parseInt(input[2]);
                latitude = Integer.parseInt(input[3]);
                height = Integer.parseInt(input[4]);
                AircraftFactory.newAircraft(type, name, longitude, latitude, height).registerTower(tower);
                cLine = reader.readLine();
			}
			reader.close();
		} catch (Exception ex) {
			throw new MyException(ex.getMessage());
		}
    }
}