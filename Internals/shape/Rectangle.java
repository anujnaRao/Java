package shape;

public class Rectangle {
 private int br,h;
 public void getVal(int a,int b)
 {
   br=a;
   h=b;
 }
 public void area()
 {
  System.out.println("Area of Rectangle is "+ (br*h));
 }
}