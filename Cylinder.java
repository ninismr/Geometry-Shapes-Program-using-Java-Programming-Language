public class Cylinder extends Circle{
    private float h;
    
    public void setHeight(float h)
	{
		this.h = h; 
	}
	
	public float getHeight()
	{
		return h; 
    }
    
    
    @Override
    public float getArea()
    {
        float Area = (2 *  super.getArea()) +  (super.getPerimeter() * h);
		return Area;  
	}
	
	@Override
	public float getPerimeter()
	{
        float Perimeter = super.getPerimeter();
		return Perimeter;
    }
    
    public float getVolume()
    {
        float Volume = super.getArea() * h;
        return Volume;
    }
}
