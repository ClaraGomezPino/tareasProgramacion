public class Ejercicio410 {

    
  public static void main(String[] Strings) {

      String linea;
      System.out.print("Por favor, introduce el día del mes en  el cual naciste: ");
      linea = System.console().readLine();
      int d = Integer.parseInt( linea );
      
      System.out.print("Por favor, introduce el mes en  el cual naciste a modo de número: ");
      linea = System.console().readLine();
      int m = Integer.parseInt( linea );      
          
          
        switch (m) {
        
         case 1:
          if (d <= 19) {
           System.out.print("Hola, Capricornio");
          } else { 
           System.out.print("Hola, Acuario");}
           break; 
       
         case 2:
          if (d <= 18) {
           System.out.print("Hola, Acuario");
          } else { 
           System.out.print("Hola, Piscis");}
           break;         
           
       
         case 3:
          if (d <= 20) {
           System.out.print("Hola, Piscis");
          } else { 
           System.out.print("Hola, Aries");}
           break;                    
           
           
       
         case 4:
          if (d <= 19) {
           System.out.print("Hola, Aries");
          } else { 
           System.out.print("Hola, Tauro");}
           break;        
           
       
         case 5:
          if (d <= 20) {
           System.out.print("Hola, Tauro");
          } else { 
           System.out.print("Hola, Géminis");}
           break;         
           
       
         case 6:
          if (d <= 20) {
           System.out.print("Hola, Géminis");
          } else { 
           System.out.print("Hola, Cáncer");}
           break;         
           
       
         case 7:
          if (d <= 22) {
           System.out.print("Hola, Cáncer");
          } else { 
           System.out.print("Hola, Leo");}
           break;         
           
       
         case 8:
          if (d <= 22) {
           System.out.print("Hola, Leo");
          } else { 
           System.out.print("Hola, Virgo");}
           break;         
           
       
         case 9:
          if (d <= 22) {
           System.out.print("Hola, Virgo");
          } else { 
           System.out.print("Hola, Libra");}
           break;         
           
       
         case 10:
          if (d <= 22) {
           System.out.print("Hola, Libra");
          } else { 
           System.out.print("Hola, Escorpio");}
           break;         
           
          
       
         case 11:
          if (d <= 22) {
           System.out.print("Hola, Escorpio");
          } else { 
           System.out.print("Hola, Sagitario");}
           break;                          


         case 12:
          if (d <= 22) {
           System.out.print("Hola, Sagitario");
          } else { 
           System.out.print("Hola, Capricornio");}
           break;                          
        }                                                                                                                                                    
    }
}
