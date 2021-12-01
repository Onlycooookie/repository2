public class PolyismDemo5 {
  public static void main(String[] args) {
	  displayObject(new Circle2(1,"red",false));
	  displayObject(new Rectangle3(1,1,"black",true));
  }

  public static void displayObject(GeometricObject1 object) {
	System.out.println("Created on "+object.getDateCreated()+
	                     ". Color is "+object.getColor());
    }
}
