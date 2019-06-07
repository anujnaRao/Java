class Shape
{
 Shape()
 {
  System.out.println("This is the default constructor\n");
 }
 Shape(String s)
 {
   System.out.println("This is parametrized constructor");
 }

 public void Area()
 {
   int r=4;
   System.out.println("Area of the circle is "+(3.14*r*r));
 }

 public void Area(int l)
 {
   System.out.println("Area of the square is "+(l*l));
 }

 public void Area(int b,int h)
 {
   System.out.println("Area of the rectangle is "+(b*h));
 }

 public void Area(int b,double h)
 {
  System.out.println("Area of the triangle is "+(b*h)/2);
 }

 public void Area(String s,int i)
 {
   System.out.println("Overridden method is "+s+" and "+i);
 }

 public static void main(String ar[])
 {
  Shape s=new Shape();
  Shape s1=new Shape("Hello");
  s.Area();
  s.Area(5);
  s.Area(2,3);
  s.Area(3,4.5);
  s.Area("String",4);
 }
}