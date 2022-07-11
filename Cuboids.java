public class Cuboids extends Rectangle{
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
        float Area = 2 * ((super.getLength() * super.getWidth()) + (super.getLength() * h) + (super.getWidth() * h));
		return Area;  
	}
	
	@Override
	public float getPerimeter()
	{
        float Perimeter = 4 * (super.getLength() + super.getWidth() + h);
		return Perimeter;
    }
    
    public float getVolume()
    {
        float Volume = super.getArea() * h;
        return Volume;
    }
}
