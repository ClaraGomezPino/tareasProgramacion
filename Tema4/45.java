import java.util.Scanner;
public class Exercise2 {

    
  public static void main(String[] Strings) {

      System.out.print("Por favor, introduce el valor de a: ");
      
      String linea = System.console().readLine();
        double a = Integer.parseInt( linea );
  
      System.out.print("Por favor, introduce el valor de b: ");
        double b = Integer.parseInt( linea );  
  
      System.out.print("Por favor, introduce el valor de c: ");
        double c = Integer.parseInt( linea );         
            double result = b * b - 4.0 * a * c;

            if (result > 0.0) {
                double r1 = (-b + Math.pow(result, 0.5)) / (2.0 * a);
                double r2 = (-b - Math.pow(result, 0.5)) / (2.0 * a);
                System.out.println("The roots are " + r1 + " and " + r2);
            } else if (result == 0.0) {
                double r1 = -b / (2.0 * a);
                System.out.println("The root is " + r1);
            } else {
                System.out.println("The equation has no real roots.");
            }

    }
}
