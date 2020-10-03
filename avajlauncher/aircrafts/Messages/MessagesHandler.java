package avajlauncher.aircrafts.Messages;

import java.util.ArrayList;
import java.util.List;

public class MessagesHandler {

    public static List<String> JETPLANE = new ArrayList<>()
    {
        private static final long serialVersionUID = 12L;
        {
            add("SUN"); //SUN
            add("It is raining!"); //RAIN
            add("FOG"); //FOG
            add("Of course! It's already winter."); //SNOW
            add("Thought will still gonna fly. Should land now."); //GROUNDED
        }
    };

    public static List<String> HELICOPTER = new ArrayList<>()
    {
        private static final long serialVersionUID = 13L;
        {
            add("SUN"); //SUN
            add("It is raining!"); //RAIN
            add("FOG"); //FOG
            add("Fuck! winter it's coming."); //SNOW
            add("It's time to land now."); //GROUNDED
        }
    };

    public static List<String> BALLOON = new ArrayList<>()
    {
        private static final long serialVersionUID = 14L;
        {
            add("SUN"); //SUN
            add("It is raining!"); //RAIN
            add("FOG"); //FOG
            add("Of course! It's already winter."); //SNOW
            add("Oh! s**t! now it's time to land already."); //GROUNDED
        }
    };
}