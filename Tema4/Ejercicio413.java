public class Ejercicio413 {

    
  public static void main(String[] Strings) {

      System.out.print("Por favor, introduce el primer número: ");
      String linea;
      linea = System.console().readLine();
        int a = Integer.parseInt( linea );
  
      System.out.print("Por favor, introduce el segundo número: ");
        
      linea = System.console().readLine();
        int b = Integer.parseInt( linea );  
  
      System.out.print("Por favor, introduce el tercer número: ");
      
      linea = System.console().readLine();
        int c = Integer.parseInt( linea );         

      if ((a > b) && (b > c)) {
      System.out.print(a + " " + b + " " + c);
      } else if ((a > c) && (c > b)) { 
      System.out.print(a + " " + c + " " + b);
      } else if ((b > a) && (a > c)) { 
      System.out.print(b + " " + a + " " + c);
      } else if ((b > c) && (c > a)) { 
      System.out.print(b + " " + c + " " + a); 
      } else if ((c > a) && (a > b)) { 
      System.out.print(c + " " + a + " " + b);           
      } else if ((c > b) && (b > a)) { 
      System.out.print(c + " " + b + " " + a);     
      
    }
  }
}            
