package avajlauncher.aircrafts.Messages;

import avajlauncher.FileWriter.SimulationFile;
import avajlauncher.aircrafts.Aircraft;

public class Landing {
    public static void PrintOut(int i, String status, Aircraft t)
    {
        String[] aircrafts = {"JetPlane#", "Helicopter#", "Balloon#"};
        if (status.equals("GROUNDED"))
        {
            SimulationFile.SimulationWriter(aircrafts[i] + t.getName() + "(" + t.getId() + "): landing.");
            SimulationFile.SimulationWriter("Current Coordinates: Longtitude:" + t.getCoord().getLongitude() +", Latitude: " + t.getCoord().getLatitude() + ", Height: " + t.getCoord().getHeight());
        }
    }
}