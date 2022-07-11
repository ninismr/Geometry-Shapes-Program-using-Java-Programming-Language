public class Sphere extends Circle{
    
    @Override
    public float getArea()
    {
        float Area = 4 * super.getArea();
		return Area;  
	}
	
	@Override
	public float getPerimeter()
	{
        float Perimeter = (4 * super.getArea()) / 3;
		return Perimeter;
    }
    
    public float getVolume()
    {
        float Volume = (4 * super.getArea() * super.getRadius()) / 3;
        return Volume;
    }
}
