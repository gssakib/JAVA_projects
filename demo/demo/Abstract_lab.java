package demo;

public class Abstract_lab {

	public static void main(String[] args) throws CloneNotSupportedException {
		GeometricObject [] arry = new GeometricObject[10];
		arry[0] = new Rectangle(1.0, 2.0, "blue", true);
		arry[1] = (Rectangle) arry[0].clone();
		arry[2] = (Rectangle) arry[0].clone();
		arry[3] = (Rectangle) arry[0].clone();
		arry[4] = (Rectangle) arry[0].clone();
		
		arry[5] = new lala(1);
		arry[6] = (lala) arry[5].clone();
		arry[7] = (lala) arry[5].clone();
		arry[8] = (lala) arry[5].clone();
		arry[9] = (lala) arry[5].clone();
		
		
		
		System.out.println(sumArea(arry));
		
	}
	
	public static double sumArea(GeometricObject [] a) {
		double t_area = 0;
		
		for(int i = 0; i < a.length; i++){
			t_area += a[i].getArea();
		}
		
		return t_area;
		
	}

}



abstract class GeometricObject  {
	 private String color = "white";
	 private boolean filled;
	 private java.util.Date dateCreated;
	 protected GeometricObject() {
	 dateCreated = new java.util.Date();
	 }
	 protected GeometricObject(String color, boolean filled) {
	 dateCreated = new java.util.Date();
	 this.color = color;
	 this.filled = filled;
	 }
	 public String getColor() { return color; }
	 public void setColor(String color) { this.color = color; }
	 public boolean isFilled() { return filled; }
	 public void setFilled(boolean filled) { this.filled = filled; }
	 public java.util.Date getDateCreated() { return dateCreated; }
	 public String toString() {
	 return "created on " + dateCreated + "\ncolor: " + color +
	 " and filled: " + filled;
	 }
	 /** Abstract method getArea */
	 public abstract double getArea();
	 /** Abstract method getPerimeter */
	 public abstract double getPerimeter();
	 
	 public Object clone() throws CloneNotSupportedException{
		 return super.clone();
	 }
	 
	}

 class lala extends GeometricObject implements Cloneable {
	 private double radius;
	 public lala() { }
	 public lala(double radius) {
	 this.radius = radius;
	 }
	 public double getRadius() {
	 return radius;
	 }
	 public void setRadius(double radius) {
	 this.radius = radius;
	 }
	 public double getArea() {
	 return radius * radius * Math.PI;
	 }
	 public double getDiameter() {
	 return 2 * radius;
	 }
	 public double getPerimeter() {
	 return 2 * radius * Math.PI;
	 }
	 /* Print the circle info */
	 public void printCircle() {
	 System.out.println("The circle is created " + getDateCreated() +
	 " and the radius is " + radius);
	 }
	
	 
	}
 
 
  class Rectangle extends GeometricObject implements Cloneable{
	 private double width;
	 private double height;
	 public Rectangle() { }
	 public Rectangle(double width, double height, String color,
	boolean filled) {
	 super(color,filled);
	 this.width = width;
	 this.height = height;
	 }
	 public double getWidth() { return width; }
	 public void setWidth(double width) { this.width = width; }
	 public double getHeight() { return height; }
	 public void setHeight(double height) { this.height = height; }

	 public double getArea() {
	 return width * height;
	 }
	 public double getPerimeter() {
	 return 2 * (width + height);
	 }
	 
	 
	 
	}