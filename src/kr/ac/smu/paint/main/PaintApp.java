package kr.ac.smu.paint.main;

import kr.ac.smu.paint.i.Drawable;
import kr.ac.smu.paint.point.ColorPoint;
import kr.ac.smu.paint.point.Point;
import kr.ac.smu.paint.shape.Circle;
import kr.ac.smu.paint.shape.Rect;
import kr.ac.smu.paint.shape.Shape;
import kr.ac.smu.paint.shape.Triangle;

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
		draw(pt1);
		draw(pt2);	
		
		//Point p=pt3;
		draw(pt3);
		
		drawShape(rect);
		
//		drawRect(rect);
//		drawCircle(circle);
		draw(rect);
		draw(circle);
		draw(triangle);
	}
//	public static void drawPoint(Point point){
//		point.show();
//	}
//	
	public static void drawShape(Shape shape){
		shape.draw();
	}
//	
	public static void draw(Drawable drawable){
		drawable.draw();
	}
	
	
//	public static void drawRect(Rect rect){
//		rect.draw();
//		
//	}
//	public static void drawCircle(Circle circle){
//		circle.draw();
//	}

}
