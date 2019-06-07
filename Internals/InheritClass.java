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
class SubClass
{
  SubClass()
  {
    super();
    System.out.println("Sub class constructor");
  }
  void display()
  {
    int i=20;
    super.display();
    System.out.println("Value of i is "+i);
  }
}