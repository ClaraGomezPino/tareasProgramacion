public class Ejercicio537 {

  public static void main(String[] args) {
        System.out.print("Introduzca un número entero: ");
        int n = Integer.parseInt(System.console().readLine());
        int base = n;
        int nInv = 0;    
        int cifras = 0;
        while (n > 0) {
        nInv = (nInv * 10) + (n % 10);
        n /= 10;
        cifras++;
        }
        while (nInv > 0) {
      
          for (int i = 0; i < nInv % 10; i++){
            System.out.print("| ");
        }
            System.out.print("- ");

          nInv = nInv / 10;
        }

  }
}
