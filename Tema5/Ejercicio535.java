public class Ejercicio535 {
  public static void main(String[] Strings) {


    System.out.printf("Por favor, introduce la altura del reloj de arena. \n recomendamos un número impar superior o igual a 3:");
    String linea;
    linea = System.console().readLine();
    int altura = Integer.parseInt( linea );
    int mitad = (altura + 1) / 2;
    int sangria = 0;
    int incremento = 1;
    int relleno =  altura - 1;
    if (altura < 3 || altura % 2 == 0); {
      System.out.println("Por favor, introduce una altura correcta: ");
    }
    while (altura / 2 + 1 > incremento) {
      for (int i = 0; i < sangria; i++) {
          System.out.print(" ");
      }
      System.out.print("*");
  
      for (int i = 1; i < relleno; i++) {
        System.out.print(" ");
      }  
      System.out.print("*");
      System.out.println();
      incremento++;
      sangria++;
      relleno -= 2;    
    }
    for (int j = (altura + 1) / 2 - 1 ; j > 0; j--) {
          System.out.print(" ");
      }
      System.out.println("*");
      

      relleno = 0;
      sangria = (altura) / 2;
      incremento = 1;
    while (altura / 2 + 1 > incremento)  {
      incremento++;
      sangria--;
      relleno += 2;    
      for (int i = 1; i <= sangria; i++) {
          System.out.print(" ");
      }
      System.out.print("*");
  
      for (int i = 1; i < relleno; i++) {
        System.out.print(" ");
      }  
      System.out.print("*");
      System.out.println();

        
    }
  } 
}
