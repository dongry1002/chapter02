package kr.ac.smu.paint.main;

import kr.ac.smu.paint.i.Drawable;
import kr.ac.smu.paint.i.Resizeable;
import kr.ac.smu.paint.shape.Circle;
import kr.ac.smu.paint.shape.Rect;
import kr.ac.smu.paint.shape.Shape;

public class InstanceOfTest {

	public static void main(String[] args) {
			Circle c = new Circle();
			
			System.out.println(c instanceof Circle);
			System.out.println(c instanceof Shape);
			System.out.println(c instanceof Drawable);
			
			//에
			//System.out.println(c instanceof Rectangle);
	
			Shape s = new Rect();
			System.out.println(s instanceof Shape);
			System.out.println(s instanceof Rect);
			System.out.println(s instanceof Circle);
			System.out.println(s instanceof Drawable);
			System.out.println(s instanceof Resizeable);//구현안되도 에러는 안남(false)
			//System.out.println(s instanceof String); 에러
			
			Drawable drawable=new Circle();
			System.out.println(drawable instanceof Shape);
			System.out.println(drawable instanceof Rect);
			System.out.println(drawable instanceof Circle);
			System.out.println(drawable instanceof Drawable);
			
			
	
	}

}
