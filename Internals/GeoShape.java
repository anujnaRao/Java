import shape.Rectangle;
import java.util.Scanner;

public class GeoShape{
 public static void main(String[] ar)
 {
   int ch;
   Scanner s=new Scanner(System.in);
   Rectangle r=new Rectangle();
   do
   {
     System.out.println("1.Rectangle\n2.Exit\n");
     System.out.println("Enter your choice");
     ch=s.nextInt();
     switch(ch)
     {
      case 1: System.out.println("Enter the breadth and height");
	      int br=s.nextInt();
	      int h=s.nextInt();
	      r.getVal(br,h);
	      r.area();
	      break;
      case 2: break;
      default:System.out.println("Invalid choice");
     }
   }while(ch!=2);
 }
}