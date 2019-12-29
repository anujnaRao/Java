public class overloadCM{
 
 overloadCM()
 {
   System.out.println("Default constructor");
 }

 int i,j;
 overloadCM(int i,int j)
 {
  this.i=i;
  this.j=j;
  System.out.println("Summation is "+(i+j));
 }

 public void show()
 {
  System.out.println("Method without pararmeter");
 }

 public void show(int i,int j)
 {
  int p=i*j;
  System.out.println("Product "+p);
 }

 public void show(double d,int e)
 {
  double res=d/e;
  System.out.println("Division "+res);
 }

 public void show(String s)
 {
  System.out.println("String is "+s);
 }

 public static void main(String ar[])
 {
  overloadCM m=new overloadCM();
  overloadCM o1=new overloadCM(2,3);
  m.show();
  m.show(5,6);
  m.show(2.4,5);
  m.show("Hello");
 }
}