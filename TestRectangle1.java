//Program to find the area of the reactangle 
package corejava;

class Rectangle{
	int length;
	int width;
	
	void insert(int l, int w)
	{
		length=l;
		width=w;
	}
void area() {
	System.out.println("Area="+length*width);
}
	
}
	
	public class TestRectangle1 {
		public static void main(String args[])
		{
			
       
		Rectangle r1=new Rectangle();
		Rectangle r2=new Rectangle();
		
		r1.insert(11,5);
		r1.area();	
	}
	
}
