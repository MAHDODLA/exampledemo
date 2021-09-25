import java.util.ArrayList;

public class Main extends ShapesFactory{
	
public static void main(String[] args) {
		
		Circle c1 = new Circle(3.0);
		Circle c2 = new Circle(2.0);
		Circle c3 = new Circle(4.0);
		Rectangle r1=new Rectangle(2.0,4.0);
		Rectangle r2=new Rectangle(3.0,5.0);
		Rectangle r3=new Rectangle(4.0,6.0);
		ArrayList<Shape> slist = new ArrayList<>();
		slist.add(c1);
		slist.add(c2);
		slist.add(c3);
		slist.add(r1);
		slist.add(r2);
		slist.add(r3);
		
	}   

}