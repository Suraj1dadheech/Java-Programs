package CoreJavaPart1.ConstructorAndInheritance.CarpetCost;

public class Floor {
	private double length, width;
    public Floor(double width, double length)
    {
        this.length = length < 0 ? 0 : length;
        this.width = width < 0 ? 0 : width;
    }
    public double getArea() 
    {
    	return length*width;
    }
}
