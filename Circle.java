public class Circle extends Shapes {
    private float r;

	public void setRadius(float r)
	{
		this.r = r; 
	}
	
	public float getRadius()
	{
		return r; 
	}

    @Override
    public float getArea()
    {
        float Area = (float) (Math.PI * r * r);
		return Area;  
	}
	
	@Override
	public float getPerimeter()
	{
        float Perimeter = (float) (2 * Math.PI * r);
		return Perimeter;
	}
}
