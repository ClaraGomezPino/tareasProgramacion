public class Ejercicio536 {

  public static void main(String[] args) {
       
       int capicua = 0;

      while (capicua == 0) {
        System.out.print("Introduzca un número entero: ");
        int n = Integer.parseInt(System.console().readLine());
        long base = n;
        int nInv = 0;    
 
        
        while (n > 0) {
        nInv = (nInv * 10) + (n % 10);
        n /= 10;
        
        }
        if (base == nInv) {
          capicua = 1;
        } else {
          System.out.printf("El número no es capicua, vuelve a intentarlo: \n \n");
          }
      }
          System.out.print("El número es capicua, ¡felicidades!");

        
    
  
  } 
}
    
