package avajlauncher.FileWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class SimulationFile
{
    public SimulationFile()
    {
        try 
        {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("simulation.txt"));
            bufferedWriter.close();
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }
    }

    public static void SimulationWriter(String text)
    {
        try 
        {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("simulation.txt", true));
            bufferedWriter.append(text);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }
    }
}