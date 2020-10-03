package avajlauncher.Tower;

import java.util.ArrayList;
import java.util.List;

import avajlauncher.Interfaces.Flyable;

public abstract class Tower {
    private List<Flyable> observers = new ArrayList<Flyable>();

    int check = 0;

    public void register(Flyable flyable)
    {
        observers.add(flyable);
    }

    public void unregister(Flyable flyable)
    {
        check = 1;
        observers.remove(flyable);
    }

    protected void conditionsChanged()
    {
        int i = 0;
        while (i < observers.size()) 
        {
            if (check == 1){
                i--;
                check = 0;
            }
            observers.get(i).updateConditions();
            i++;
        }
    }
}