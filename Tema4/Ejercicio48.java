public class Ejercicio48 {

    
  public static void main(String[] Strings) {

      System.out.print("Por favor, introduce la primera calificación: ");
      String linea;

      linea = System.console().readLine();
        double c1 = Integer.parseInt( linea );
      System.out.print("Por favor, introduce la segunda calificación: ");

      linea = System.console().readLine();
        double c2 = Integer.parseInt( linea );
        
      System.out.print("Por favor, introduce la tercera calificación: ");

      linea = System.console().readLine();
        double c3 = Integer.parseInt( linea );
        
        double med = ((c1 + c2 + c3) / 3);
        
            if ((c1 >= 0.0) && (c2 >= 0.0) && (c3 >= 0.0) && (c1 <= 10) && (c3 <= 10) && (c2 <= 10))  {
                System.out.println("La media es de " + med + " puntos.");
            
            } else {
                System.out.println("No es posible sacar una nota fuera de los valores entre 0 y 10.");
            }
            
            if (med >= 9)  {
                System.out.println("La media es sobresaliente.");
            } else if  (med >= 7) {
                System.out.println("La media es notable.");
            } else if  (med >= 6) {
                System.out.println("La media es buena.");
            } else if  (med >= 5) { 
                System.out.println("La media es suficiente.");
            } else { 
                System.out.println("La media está suspensa.");
            }
    }
}
