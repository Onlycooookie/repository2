public class CastingDemo7 {
  public static void main(String[] args) {
	  Object object1=new Circle2(1);
	  Object object2=new Rectangle3(1,1);
	  
	  displayObject(object1);
	  displayObject(object2);
  }
  
  public static void displayObject(Object object) {
	  if (object instanceof Circle2) {
		  System.out.println("The circle area is "+((Circle2)object).getArea());
		  System.out.println("The circle diameter is "+((Circle2)object).getDiameter());
	  }
	  else if (object instanceof Rectangle3) {
		  System.out.println("The rectangle area is "+((Rectangle3)object).getArea());
	  }
  }
}
