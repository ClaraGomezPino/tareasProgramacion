public class Ejercicio49 {

    
  public static void main(String[] Strings) {

      System.out.print("Por favor, introduce el valor de a: ");
      String linea;
      linea = System.console().readLine();
        double a = Integer.parseInt( linea );
  
      System.out.print("Por favor, introduce el valor de b: ");
        
      linea = System.console().readLine();
        double b = Integer.parseInt( linea );  
  
      System.out.print("Por favor, introduce el valor de c: ");
      
      linea = System.console().readLine();
        double c = Integer.parseInt( linea );         
        
            double resultado = b * b - 4.0 * a * c;

            if (resultado > 0.0) {
                double r1 = (-b + Math.sqrt(resultado)) / (2.0 * a);
                double r2 = (-b - Math.sqrt(resultado)) / (2.0 * a);
                System.out.println("Las raíces son " + r1 + " y " + r2);
            } else if (resultado == 0.0) {
                double r1 = -b / (2.0 * a);
                System.out.println("La raíz es " + r1);
            } else {
                System.out.println("La ecuación no contiene raíz real alguna.");
            }

    }
}
