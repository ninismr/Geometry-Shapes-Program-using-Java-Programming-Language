public class Rectangle extends Shapes {
    private float l;
    private float w;
    
    public void setLength(float l)
	{
		this.l = l; 
	}
	
	public float getLength()
	{
		return l; 
	}
	
    public void setWidth(float w)
	{
		this.w = w; 
	}
    
	public float getWidth()
	{
        return w; 
    }
    
    @Override
    public float getArea()
    {
        float Area = l * w;
		return Area;  
	}
	
	@Override
	public float getPerimeter()
	{
        float Perimeter = 2 * (l + w);
		return Perimeter;
	}
}
