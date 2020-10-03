package avajlauncher.aircrafts;

import avajlauncher.Models.Coordinates;
import avajlauncher.aircrafts.CoordConditions.Conditions;

public abstract class Aircraft
{
    protected long id;
    protected String name;
    protected Coordinates coordinates;
    private static long idCounter = 0;

    protected Aircraft(String name, Coordinates coordinates)
    {
        this.name = name;
        this.coordinates = coordinates;
        this.id = this.nextId();
    }

    public String getName()
    {
        return name;
    }

    public long getId()
    {
        return id;
    }

    public Coordinates getCoord()
    {
        return coordinates;
    }

    private long nextId()
    {
        long id = Aircraft.idCounter++;
        return id;
    }
 
    public String changePoints(String w, int position)
    {
        Conditions cond = new Conditions();
        int height = 0;
        int[] conditions = null;

        if (w.equalsIgnoreCase("SUN"))
        {
            conditions = cond.SUN.get(position);
            if (this.coordinates.getHeight() + conditions[2] > 100)
                height = 100;
            else 
                height = this.coordinates.getHeight() + conditions[2];
        }
        else 
            if (w.equalsIgnoreCase("RAIN")) 
            {
                conditions = cond.RAIN.get(position);
                height = this.coordinates.getHeight() + conditions[2];
            }
            else
                if (w.equalsIgnoreCase("FOG"))
                {
                    conditions = cond.FOG.get(position);
                    height = this.coordinates.getHeight() + conditions[2];
                }
                else
                    if (w.equalsIgnoreCase("SNOW"))
                    {
                        conditions = cond.SNOW.get(position);
                        height = this.coordinates.getHeight() + conditions[2];
                    }
        this.coordinates = new Coordinates(this.coordinates.getLongitude() + conditions[0],this.coordinates.getLatitude() + conditions[1], height);
        if (height <= 0) return "GROUNDED";
        return w;
    }
}