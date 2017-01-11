package paint;

public class PaintApp {

	public static void main(String[] args) {
		
		Point pt1=new Point();
		pt1.setX(100);
		pt1.setY(200);
		Point pt2=new Point(50,100);		
		ColorPoint pt3=new ColorPoint(500,500,"red");
	
		
		Rect rect = new Rect();
		Circle circle=new Circle();
		Triangle triangle=new Triangle();
		//그리기
		drawPoint(pt1);
		drawPoint(pt2);	
		
		//Point p=pt3;
		drawPoint(pt3);
		
		
//		drawRect(rect);
//		drawCircle(circle);
		drawShape(rect);
		drawShape(circle);
		drawShape(triangle);
	}
	public static void drawPoint(Point point){
		point.show();
	}
	
	public static void drawShape(Shape shape){
		shape.draw();
	}
	
	
	
	
//	public static void drawRect(Rect rect){
//		rect.draw();
//		
//	}
//	public static void drawCircle(Circle circle){
//		circle.draw();
//	}

}
