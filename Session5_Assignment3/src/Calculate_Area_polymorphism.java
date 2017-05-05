class OverloadDemo
{
    void area(float x, float y)
    {
        System.out.println("the area of the rectangle is "+x*y+" sq units");
    }
    void area(double a,double b)
    {
        double z = a*b/2;
        System.out.println("the area of Triangle is "+z+" sq units");
    }
}
class Calculate_Area_polymorphism
{
     public static void main(String args[]) 
	{
	   OverloadDemo ob = new OverloadDemo();
	   ob.area(10,20);
	   ob.area(11.0,12.0);
	   
        }
}