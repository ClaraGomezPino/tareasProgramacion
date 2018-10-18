public class Ejercicio415 {

    
  public static void main(String[] Strings) {
    
      System.out.println("¿En qué dirección deseas que apunte la pirámide? Teclea el número.");    
      System.out.println("1. Arriba  2. Abajo  3. Derecha  4.Izquierda");   
      
      
      String linea;
      linea = System.console().readLine();
      int n = Integer.parseInt( linea );

    switch (n) {
    
      case 1:            
      System.out.println("  *");
      System.out.println(" ***");
      System.out.println("*****");
      break; 
      
      case 2: 
      System.out.println("*****");
      System.out.println(" ***");
      System.out.println("  *");
      break;
      
      case 3:
      System.out.println("*");
      System.out.println("***");
      System.out.println("*****");
      System.out.println("***");
      System.out.println("*");
      break;
      
      case 4:
      System.out.println("    *");
      System.out.println("  ***");
      System.out.println("*****");
      System.out.println("  ***");
      System.out.println("    *");
      break;}
}
}
