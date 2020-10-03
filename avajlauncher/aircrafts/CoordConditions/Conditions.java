package avajlauncher.aircrafts.CoordConditions;

import java.util.ArrayList;
import java.util.List;

public class Conditions {
	public List<int[]> SUN = new ArrayList<>()
	{
		private static final long serialVersionUID = 2L;
		{
			add(new int[] {0, 10, 2}); //JETPLANE
			add(new int[] {10, 0, 2}); //HELICOPTER
			add(new int[] {2, 0, 4}); // BALLOON
		}
	};
    
	public List<int[]> RAIN = new ArrayList<>()
	{
		private static final long serialVersionUID = 3L;
		{
			add(new int[] {0, 5, 0}); //JETPLANE
			add(new int[] {5, 0, 0}); //HELICOPTER
			add(new int[] {0, 0, -5}); //BALLOON
		}
	};

	public List<int[]> FOG = new ArrayList<>()
	{
		private static final long serialVersionUID = 4L;
		{
			add(new int[] {0, 1, 0}); //JETPLANE
			add(new int[] {1, 0, 2}); //HELICOPTER
			add(new int[] {0, 0, -3}); //BALLOON
		}
	};

	public List<int[]> SNOW = new ArrayList<>()
	{
		private static final long serialVersionUID = 5L;
		{
			add(new int[] {0, 0, -7}); //JETPLANE
			add(new int[] {0, 0, -12}); //HELICOPTER
			add(new int[] {0, 0, -15}); //BALLOON
		}
	};
}