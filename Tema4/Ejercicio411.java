public class Ejercicio411 {

    
  public static void main(String[] Strings) {

      String linea;
      System.out.print("Por favor, introduce la hora del día del 0 al 23: ");
      linea = System.console().readLine();
      int h = Integer.parseInt( linea );
      
      System.out.print("Por favor, introduce los minutos del 0 al 59: ");
      linea = System.console().readLine();
      int m = Integer.parseInt( linea );      
          
          int totSec = (h * 3600 + m * 60);
          int medSec = (24 * 3600);
          int resSec = (medSec - totSec);
          
      if ((resSec == 0) || (totSec == 0)) {
        System.out.print("Es medianoche.");

      } else if ((totSec > 0) && (totSec < medSec)) {
        System.out.print("Son las " + h + " horas y " + m + " minutos. Faltan " + resSec + " para medianoche.");                  
      
      } else {
        System.out.print("Has introducido una hora incorrecta.");}
        
        }                                                                                                                                                    
    }

