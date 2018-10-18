public class Ejercicio46 {

    
  public static void main(String[] Strings) {

      System.out.print("Por favor, introduce la altura en metros: ");
      String linea;
      linea = System.console().readLine();
        double h = Integer.parseInt( linea );
        
            if (h > 0.0) {
                double t = Math.sqrt((h * 2) / 9.81);
                System.out.println("El objeto tardará " + t + " segundos en caer.");
            } else if (h == 0.0) {
                System.out.println("El objeto no puede caer si no está elevado.");
            } else {
                System.out.println("No existe una altura negativa.");
            }

    }
}
