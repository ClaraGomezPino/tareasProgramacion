public class Ejercicio57 {

    
  public static void main(String[] Strings) {

    int seguridad = 0; 
    int contraseña = 4959 ;
    do {
    System.out.print("Por favor, introduce un número de cuatro cifras: ");
    String linea;
    linea = System.console().readLine();
    int i = Integer.parseInt( linea );
    if (contraseña != i) {
      System.out.println("El número es incorrecto.");  
      seguridad++;
    } else  {
      System.out.println("La caja fuerte se ha abierto satisfactoriamente.");
      }  
  } while (seguridad != 4); 
      System.out.println("La caja fuerte se ha bloqueado, no puedes continuar.");  

      
  
}
} 
