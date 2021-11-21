public class Circle_8 {
    private double radius=1;
    
    private static int numberOfObjects=0;
    
    public Circle_8() {
    	numberOfObjects++;
    }
    
    public Circle_8(double newRadius) {
    	radius=newRadius;
    	numberOfObjects++;
    }
    
    public double getRadius() {
    	return radius;
    }
    
    public void setRadius(double newRadius) {
    	radius=(newRadius >=0)? newRadius :0;
    }
    
    public static int getNumberOfObjects() {
    	return numberOfObjects;
    }
    
    public double getArea() {
    	return radius*radius*Math.PI;
    }
}
