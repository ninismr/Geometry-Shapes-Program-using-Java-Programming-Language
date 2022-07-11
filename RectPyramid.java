public class RectPyramid extends Rectangle{
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
        float Area = super.getArea() + (super.getLength() * h) + (super.getWidth() * h);
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
        float Volume = (super.getArea() * h) / 3;
        return Volume;
    }
}
