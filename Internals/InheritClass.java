class SuperClass
{
  SuperClass()
  {
    System.out.println("Super Class constructor");
  }
  void display()
  {
    int i=10;
    System.out.println("Value of i is "+i);
  }
}
class SubClass extends SuperClass
{
  int i=20;
  SubClass()
  {
    super();
    System.out.println("Sub class constructor");
  }
  void display()
  {
    super.display();
    System.out.println("Value of i is "+i);
  }
}

public class InheritClass
{
 public static void main(String[] ar)
 {
   SubClass s=new SubClass();
   s.display();
 }
}