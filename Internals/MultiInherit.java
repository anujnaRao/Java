import java.io.*;
import java.util.*;

interface Rectangle
{
  public double areaRect(float x,float y);
}
interface Triangle
{
 public double areaTri(float x,float y);
}

class Area implements Rectangle,Triangle
{
 public double areaRect(float x,float y)
 {
   return x*y;
 }
 public double areaTri(float x,float y)
 {
   return (x*y)/2;
 } 
 public static void main(String[] ar)
 {
  Area a1=new Area();
  //Console c=System.Console();  
  Scanner s=new Scanner(System.in);
  System.out.println("Enter the length and breadth");
  //float a= Float.parseFloat(c.readLine());
   float a= s.nextFloat();
  //float b= Float.parseFloat(c.readLine());
   float b= s.nextFloat();
  System.out.println("Enter the base and height");
  //float p= Float.parseFloat(c.readLine());
  float p=s.nextFloat();
  float q=s.nextFloat();
  //float q= Float.parseFloat(c.readLine());
  System.out.println("Area of Rectangle "+ a1.areaRect(a,b));
  System.out.println("Area of Triangle "+a1.areaTri(p,q));
 }
}