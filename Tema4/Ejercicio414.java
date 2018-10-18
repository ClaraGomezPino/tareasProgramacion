public class Ejercicio414 {

    
  public static void main(String[] Strings) {

      System.out.print("Por favor, introduce un número: ");
      String linea;
      linea = System.console().readLine();
      int num = Integer.parseInt( linea );
        
        if (num%2 == 0) {
      System.out.println("El número es par");
        }else {
      System.out.println("El número es impar");
      }
      
      if (num%5 == 0) {
        System.out.println("El número es múltiplo de 5");
      }else {
        System.out.println("El número no es múltiplo de 5");
      }
    }
} 
    
