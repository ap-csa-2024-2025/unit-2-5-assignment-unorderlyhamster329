import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Circle circ1 = new Circle(10.1);
    Circle circ2 = new Circle(14);
    Circle circ3 = new Circle(20.5);

    String output1 = circ1.toString();
    System.out.println(output1); 

    String output2 = circ2.toString();
    System.out.println(output2);

    String output3 = circ3.toString();
    System.out.println(output3);

    Scanner banner = new Scanner(System.in);
    System.out.println("Type a number for length and width");
  }
}
