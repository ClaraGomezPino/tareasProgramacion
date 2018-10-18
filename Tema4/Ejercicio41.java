  public class Ejercicio41 {
    public static void main(String[] args) {
      System.out.print("Por favor, introduce el día de la semana a modo de número: ");
      
      String linea = System.console().readLine();
        int x = Integer.parseInt( linea );
        
        if (x == 1) {
          System.out.println("El lunes tienes a primera hora.");}
        if (x == 2) {
          System.out.println("El martes tienes a primera hora.");}
        if (x == 3) {
          System.out.println("El miércoles tienes a primera hora.");}
        if (x == 4) {
          System.out.println("El jueves tienes a primera hora.");}
        if (x == 5) {
          System.out.println("El viernes tienes a primera hora.");}   
        if (x == 6) {
          System.out.println("El sábado no tienes clase.");}   
        if (x == 7) {
          System.out.println("El domingo no tienes clase."); } 
        if (x > 7 || x < 1) {
          System.out.println("Este día no existe."); }                                        
      }
    }
  
