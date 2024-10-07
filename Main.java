import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    //Problem 1
    Circle circ1 = new Circle(10.1);
    Circle circ2 = new Circle(14);
    Circle circ3 = new Circle(20.5);

    String output1 = circ1.toString();
    System.out.println(output1); 

    String output2 = circ2.toString();
    System.out.println(output2);

    String output3 = circ3.toString();
    System.out.println(output3);

    //Problem 2
    Scanner rectInput = new Scanner(System.in);
    System.out.println("Type a number for length and width");
    double lengthandWidth = rectInput.nextDouble();
    System.out.println("Type a length");
    double length = rectInput.nextDouble();
    System.out.println("Type a width");
    double width = rectInput.nextDouble();

    Rectangle rect1 = new Rectangle(lengthandWidth);
    Rectangle rect2 = new Rectangle(length, width);

    String output4 = rect1.toString();
    System.out.println(output4);
    
    String output5 = rect2.toString();
    System.out.println(output5);


    //Problem 3
    System.out.println("Type a side length");
    double sLength = rectInput.nextDouble();

    RegularPolygon triangle = new RegularPolygon(3, sLength);
    RegularPolygon square = new RegularPolygon(4, sLength);
    String output6 = triangle.toString();
    System.out.println(output6);
    String output7 = square.toString();
    System.out.println(output7);

    
    
  }
}
