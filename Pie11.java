public class Pie
{

		// declare variables in Pie class to be called in separate file
		String type;
		float diameter;
		float radius;
		int pieces;

	//initates object if all values exist
	public Pie(String startType, float startDiameter)
	{
		type=startType;
		diameter=startDiameter;
		radius=startDiameter/2;
	}

	//sets a new type if required
	public void setType(String newType)
	{
		type = newType;
	}
	//sets a new diameter if required
	public void setDiameter(float newDiameter)
	{
		diameter = newDiameter;
		radius = newDiameter/2;
	}
	//sets a new radius if required
	public void setRadius(float newDiameter)
	{
		radius = newDiameter/2;
		diameter = newDiameter;
	}
	//returns the type of pie
	public String returnType()
	{
		return type;
	}
	//returns the diameter
	public float returnDiameter()
	{
		return diameter;
	}
	//returns the radius
	public float returnRadius()
	{
		return radius;
	}

	//checks to see how many pieces of pie can be cut in accordance to the size of the pie and returns the number of pieces
	public int returnPieces()
	{
		if (diameter <= 9)
		{
			pieces = 4;
		   	return pieces;
		}
		else if (diameter >= 10 && diameter <= 20)
		{
			pieces = 8;
		   	return pieces;
		}
		else 
		{
			pieces = 12;
		   	return pieces;
		}
	}


}