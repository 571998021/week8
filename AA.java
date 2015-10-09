import java.util.Scanner;

public class AA {
 public static void main(String[] args) throws Exception {
  Scanner in = new Scanner(System.in);
  System.out.print("Input Circle Radius : ");
  double radius = in.nextDouble();
  double result = Math.PI * radius * radius;
  System.out.println("The Circle Area = " + result);
 }
}